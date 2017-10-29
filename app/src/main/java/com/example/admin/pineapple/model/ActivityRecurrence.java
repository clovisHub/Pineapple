
package com.example.admin.pineapple.model;

import java.util.List;
import com.squareup.moshi.Json;

public class ActivityRecurrence {

    @Json(name = "frequencyInterval")
    private Object frequencyInterval;
    @Json(name = "activityStartDate")
    private String activityStartDate;
    @Json(name = "activityExclusions")
    private List<Object> activityExclusions = null;
    @Json(name = "monthWeekInterval")
    private Object monthWeekInterval;
    @Json(name = "activityEndDate")
    private String activityEndDate;
    @Json(name = "days")
    private String days;
    @Json(name = "startTime")
    private String startTime;
    @Json(name = "endTime")
    private String endTime;
    @Json(name = "frequency")
    private Frequency frequency;

    public Object getFrequencyInterval() {
        return frequencyInterval;
    }

    public void setFrequencyInterval(Object frequencyInterval) {
        this.frequencyInterval = frequencyInterval;
    }

    public String getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(String activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public List<Object> getActivityExclusions() {
        return activityExclusions;
    }

    public void setActivityExclusions(List<Object> activityExclusions) {
        this.activityExclusions = activityExclusions;
    }

    public Object getMonthWeekInterval() {
        return monthWeekInterval;
    }

    public void setMonthWeekInterval(Object monthWeekInterval) {
        this.monthWeekInterval = monthWeekInterval;
    }

    public String getActivityEndDate() {
        return activityEndDate;
    }

    public void setActivityEndDate(String activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

}
