package com.example.saidabot.Model.NotificationPayload;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Context {

    @SerializedName("forwarded")
    @Expose
    private String forwarded;
    @SerializedName("frequently_forwarded")
    @Expose
    private String frequentlyForwarded;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("referred_product")
    @Expose
    private ReferredProduct referredProduct;

    public String getForwarded() {
        return forwarded;
    }

    public void setForwarded(String forwarded) {
        this.forwarded = forwarded;
    }

    public String getFrequentlyForwarded() {
        return frequentlyForwarded;
    }

    public void setFrequentlyForwarded(String frequentlyForwarded) {
        this.frequentlyForwarded = frequentlyForwarded;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReferredProduct getReferredProduct() {
        return referredProduct;
    }

    public void setReferredProduct(ReferredProduct referredProduct) {
        this.referredProduct = referredProduct;
    }

}