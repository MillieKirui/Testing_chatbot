package com.example.saidabot.Model.NotificationPayload;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Button {

    @SerializedName("payload")
    @Expose
    private String payload;
    @SerializedName("text")
    @Expose
    private String text;

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
