package com.example.saidabot.Model.NotificationPayload;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Origin {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("expiration_timestampt")
    @Expose
    private String expirationTimestampt;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpirationTimestampt() {
        return expirationTimestampt;
    }

    public void setExpirationTimestampt(String expirationTimestampt) {
        this.expirationTimestampt = expirationTimestampt;
    }

}
