package com.example.saidabot.Model.CustomerCare100;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Level1 {
    @Id
    private Integer level1_id;
    private String service_type;

    @ManyToOne
    @JoinColumn(name="level0_id")
    private Level0 level0;

    public void setLevel1_id(Integer level1_id) {
        this.level1_id = level1_id;
    }

    public Integer getLevel1_id() {
        return level1_id;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getService_type() {
        return service_type;
    }
}
