package com.example.saidabot.Model.ResponseMessage;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Reply{

    @SerializedName("messaging_product")
    @Expose
    private String messagingProduct;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("template")
    @Expose
    private Template template;

    private Text text;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public void setText(Text text){this.text=text;}

}
