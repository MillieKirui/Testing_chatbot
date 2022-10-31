package com.example.saidabot.Model.NotificationPayload;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Sticker {

    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("sha256")
    @Expose
    private String sha256;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("animated")
    @Expose
    private String animated;

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnimated() {
        return animated;
    }

    public void setAnimated(String animated) {
        this.animated = animated;
    }

}
