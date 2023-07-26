/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Context {

    @JsonProperty("device_id")
    private String deviceId;
    @JsonProperty("in_exp")
    private boolean inExp;

}