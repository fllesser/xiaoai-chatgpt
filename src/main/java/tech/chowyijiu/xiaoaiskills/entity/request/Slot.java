/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.request;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Slot {

    private String name;
    private String value;
    @JsonProperty("raw_value")
    private String rawValue;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}