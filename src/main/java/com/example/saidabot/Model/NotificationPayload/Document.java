package com.example.saidabot.Model.NotificationPayload;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Document {

    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("has256")
    @Expose
    private String has256;
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("id")
    @Expose
    private String id;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getHas256() {
        return has256;
    }

    public void setHas256(String has256) {
        this.has256 = has256;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
