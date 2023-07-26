/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.response;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class SessionAttributes {

    private int noticeFlag;
    private String replyKeyWord;
    private int turn;
    private MiniSkillInfo miniSkillInfo;
    private Session session;
    private String longtailEngine;
    private boolean replace;
    private double latitude;
    private double longtitude;

}