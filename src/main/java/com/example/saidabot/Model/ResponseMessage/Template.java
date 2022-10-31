package com.example.saidabot.Model.ResponseMessage;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Template {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("language")
    @Expose
    private Language language;
    @SerializedName("components")
    @Expose
    private List<Component> components = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

}
