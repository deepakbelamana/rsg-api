package com.RepSetGo.RepSetGo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Users")
public class User {

    @Id
    String userId;
    String email;
    String password;

    List<Metrics> metricsList;

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Metrics> getMetricsList() {
        return metricsList;
    }

    public void setMetricsList(List<Metrics> metricsList) {
        this.metricsList = metricsList;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
