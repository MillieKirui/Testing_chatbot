package com.example.saidabot.Model.CustomerCare100;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Level0 {
    @Id
    private Integer level0_id;
    private String service_type;

    public  Level0(Integer level0_id, String service_type){
        this.level0_id=level0_id;
        this.service_type=service_type;
    }
    protected Level0(){}


    public Integer getLevel0_id() {
        return level0_id;
    }

    public void setLevel0_id(Integer level0_id) {
        this.level0_id = level0_id;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }
}
