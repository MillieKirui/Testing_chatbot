package com.example.saidabot.Model.NotificationPayload;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Contact {

    @SerializedName("wa_id")
    @Expose
    private String waId;
    @SerializedName("profile")
    @Expose
    private Profile profile;

    public String getWaId() {
        return waId;
    }

    public void setWaId(String waId) {
        this.waId = waId;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

}
