/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.response;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class ToSpeak {

    private final int type = 0; //tts的类型，目前仅支持0：TTS
    private String text;  //tts要说的文本

}