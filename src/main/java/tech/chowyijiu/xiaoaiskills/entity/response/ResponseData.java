/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Builder
@Getter
@Setter
public class ResponseData {

    private final double confidence = 0.8869365;
    @JsonProperty("open_mic")
    private final boolean openMic = false;

    @JsonProperty("to_speak")
    private ToSpeak toSpeak; //tts要说的话，通常简单的回复可以使用这个字段
    @JsonProperty("to_display")
    private ToDisplay toDisplay; //有屏设备显示的数据
    @JsonProperty("log_info")
    private LogInfo log_info;
    @JsonProperty("not_understand")
    private boolean notUnderstand; //是否理解用户的请求，具体作用详见最佳实践
    //private List<String> directives; //设备的复杂操作通常放在这里，例如多句tts，url音频播放等

}