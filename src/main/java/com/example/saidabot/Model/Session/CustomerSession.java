package com.example.saidabot.Model.Session;

import javax.persistence.*;

@Entity
public class CustomerSession {
    @Id
    private Integer id;
    private Integer wa_id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWa_id() {
        return wa_id;
    }

    public void setWa_id(Integer wa_id) {
        this.wa_id = wa_id;
    }
}
