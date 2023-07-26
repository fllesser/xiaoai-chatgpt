/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {

    @JsonProperty("user_id")
    private String user_id;
    @JsonProperty("is_user_login")
    private boolean isUserLogin;
    private String gender;

}