/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.response;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ToDisplay {

    private final int type = 0;
    private String text; // 显示的文字
    //private String url;  //假如显示html则通过这个链接指定

}