package com.example.saidabot.Model.NotificationPayload;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Payload {

    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("entry")
    @Expose
    private List<Entry> entry = null;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

}