package com.example.demo.model;

import java.util.Date;

public class Progress {
    private Long userId;

    private Long courseId;

    private String status;

    private Object percentage;

    private Date lastUpdateDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Object getPercentage() {
        return percentage;
    }

    public void setPercentage(Object percentage) {
        this.percentage = percentage;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}