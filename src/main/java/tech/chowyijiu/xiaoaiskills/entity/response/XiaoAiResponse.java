/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

/**
 * Auto-generated: 2023-07-24 12:32:52
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@Builder
@Getter
public class XiaoAiResponse {

    @JsonProperty("is_session_end")
    private boolean isSessionEnd; //是否结束当前会话
    private String version; //返回的协议版本，默认请用1.0
    private ResponseData response; //返回的具体信息
    @JsonProperty("session_attributes")
    private SessionAttributes sessionAttributes; //期望小爱技能平台帮忙持久化的json object


    public static XiaoAiResponse chat(String text) {
        ToSpeak toSpeak = ToSpeak.builder().text(text).build();
        ResponseData responseData = ResponseData.builder().notUnderstand(false).toSpeak(toSpeak).build();
        return XiaoAiResponse.builder().version("1.0").isSessionEnd(false).response(responseData).build();
    }

    public static XiaoAiResponse end(String text) {
        ToSpeak toSpeak = ToSpeak.builder().text(text).build();
        ResponseData responseData = ResponseData.builder().notUnderstand(false).toSpeak(toSpeak).build();
        return XiaoAiResponse.builder().version("1.0").isSessionEnd(true).response(responseData).build();
    }

}