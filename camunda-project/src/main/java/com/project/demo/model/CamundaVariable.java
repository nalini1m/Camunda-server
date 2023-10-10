package com.project.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CamundaVariable {

    @JsonProperty("type")
    String type;
    @JsonProperty("value")
    String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CamundaVariable{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
