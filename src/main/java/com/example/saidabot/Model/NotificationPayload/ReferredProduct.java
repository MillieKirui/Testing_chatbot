package com.example.saidabot.Model.NotificationPayload;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ReferredProduct {

    @SerializedName("catalog_id")
    @Expose
    private String catalogId;
    @SerializedName("product_retailer_id")
    @Expose
    private String productRetailerId;

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getProductRetailerId() {
        return productRetailerId;
    }

    public void setProductRetailerId(String productRetailerId) {
        this.productRetailerId = productRetailerId;
    }

}