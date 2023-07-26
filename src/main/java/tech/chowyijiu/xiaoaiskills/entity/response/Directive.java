package tech.chowyijiu.xiaoaiskills.entity.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Directive {

    private String type; //	动作的类型，audio播放音频，tts播放文字	String	是
    @JsonProperty("audio_item")
    private AudioItem audioItem;	//音频内容	AudioItem	否
    @JsonProperty("tts_item")
    private TTSItem ttsItem;	//tts内容	TTSItem	否
}
