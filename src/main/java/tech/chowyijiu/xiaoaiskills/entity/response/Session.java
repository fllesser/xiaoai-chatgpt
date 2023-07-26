/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.response;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
public class Session {

    private String sessionID;
    private String skillName;
    private String skillSubName;
    private int turn;
    private List<Data> data;

}