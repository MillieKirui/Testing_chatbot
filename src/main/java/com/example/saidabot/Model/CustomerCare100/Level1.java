package com.example.saidabot.Model.CustomerCare100;

import javax.persistence.*;



public class Level1 {
    @Id
    private Double level1_id;
    private String service_type;

    protected Level1(){

    }
    public Level1(Double level1_id,String service_type){
        this.service_type=service_type;
        this.level1_id=level1_id;
    }


    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getService_type() {
        return service_type;
    }

    public void setLevel1_id(Double level1_id) {
        this.level1_id = level1_id;
    }

    public Double getLevel1_id() {
        return level1_id;
    }
}
