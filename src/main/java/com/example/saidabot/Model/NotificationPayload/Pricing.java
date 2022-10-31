package com.example.saidabot.Model.NotificationPayload;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Pricing {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("pricing_model")
    @Expose
    private String pricingModel;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPricingModel() {
        return pricingModel;
    }

    public void setPricingModel(String pricingModel) {
        this.pricingModel = pricingModel;
    }

}
