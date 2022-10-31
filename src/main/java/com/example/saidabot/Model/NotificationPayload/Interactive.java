package com.example.saidabot.Model.NotificationPayload;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Interactive {

    @SerializedName("button_reply")
    @Expose
    private String buttonReply;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("list_reply")
    @Expose
    private String listReply;
    @SerializedName("description")
    @Expose
    private String description;

    public String getButtonReply() {
        return buttonReply;
    }

    public void setButtonReply(String buttonReply) {
        this.buttonReply = buttonReply;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getListReply() {
        return listReply;
    }

    public void setListReply(String listReply) {
        this.listReply = listReply;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}