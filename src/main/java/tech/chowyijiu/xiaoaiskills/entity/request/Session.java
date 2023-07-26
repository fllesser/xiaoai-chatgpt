/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Session {

    @JsonProperty("is_new")
    private boolean isNew;
    @JsonProperty("session_id")
    private String sessionId;
    private Application_ application;
    private User user;


}