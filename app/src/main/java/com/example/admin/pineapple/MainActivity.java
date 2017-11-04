package com.example.admin.pineapple;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.KeyProperties;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.pineapple.applevel.AppPineapple;
import com.example.admin.pineapple.view.MapsActivity;
import com.example.admin.pineapple.viewmodel.ViewModelMapRecycler;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnGo;


    Double latitude, longitude;
    private KeyStore keyStore;
    private final String keyVal ="androidHive";
    private Cipher cipher;
    private TextView textView;


    @Inject
    ViewModelMapRecycler you;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo = (Button) findViewById(R.id.btn_goId);
        btnGo.setOnClickListener(this);

        ((AppPineapple) this.getApplicationContext()).getAppComponent().inject(this);

        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KEYGUARD_SERVICE);
        FingerprintManager fingerprintManager = (FingerprintManager) getSystemService(FINGERPRINT_SERVICE);

        if(!fingerprintManager.isHardwareDetected()){
            textView.setText("Your Device does not have a Fingerprint Sensor");
        }

        //manifest?
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.USE_FINGERPRINT) != PackageManager.PERMISSION_GRANTED){
            textView.setText("Your Device does not have a Fingerprint Sensor");
            return;
        }

        //fingerPrint registered?
        if (!fingerprintManager.hasEnrolledFingerprints()){
                 return;
        }
            //Checks whether lock screen security is enabled or not
        if (!keyguardManager.isKeyguardSecure()){
                 return;
        }
        else {
            generateKey();

            if (cipherInit()) {

                FingerprintManager.CryptoObject cryptoObject = new FingerprintManager.CryptoObject(cipher);
                FingerprintHandler helper = new FingerprintHandler(this);
                helper.startAuth(fingerprintManager, cryptoObject);

                //if the user is confirmed show the google map
                if(FingerprintHandler.isAuthentik()==true){
                    you.fetchObservableEvents();
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(intent);
                }
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    private boolean cipherInit() {
          try {
                cipher = Cipher.getInstance(KeyProperties.KEY_ALGORITHM_AES + "/"
                        + KeyProperties.BLOCK_MODE_CBC + "/" + KeyProperties.ENCRYPTION_PADDING_PKCS7);
          }
          catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
              throw new RuntimeException("Failed to get Cipher", e);
          }
          try {

              keyStore.load(null);

              SecretKey key = (SecretKey) keyStore.getKey(keyVal, null);
              cipher.init(Cipher.ENCRYPT_MODE, key);
              return true;

          }
          catch (KeyPermanentlyInvalidatedException e) {
               return false;

          }
          catch (KeyStoreException | CertificateException | UnrecoverableKeyException
                  | IOException | NoSuchAlgorithmException | InvalidKeyException e) {
             throw new RuntimeException("Failed to init Cipher", e);
          }
    }

    @TargetApi(Build.VERSION_CODES.M)
    private void generateKey() {

        try {
            keyStore = KeyStore.getInstance("AndroidKeyStore");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        KeyGenerator keyGenerator;
        try {
            keyGenerator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES,"AndroidKeyStore");

        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
               throw new RuntimeException("Failed to get KeyGenerator instance", e);
       }

        try {
            keyStore.load(null);

            keyGenerator.init(new KeyGenParameterSpec.Builder(keyVal,
                            KeyProperties.PURPOSE_ENCRYPT |
                             KeyProperties.PURPOSE_DECRYPT)
                            .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
                            .setUserAuthenticationRequired(true)
                            .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_PKCS7)
                    .build());
            keyGenerator.generateKey();

        } catch (NoSuchAlgorithmException |
                InvalidAlgorithmParameterException | CertificateException | IOException e) {

            throw new RuntimeException(e);
        }
    }


    @Override
    public void onClick(View view) {
        //ViewModelMapRecycler you = new ViewModelMapRecycler(getApplicationContext());
        // you.fetchEvents();
        you.fetchObservableEvents();
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }


}
