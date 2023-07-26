/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Auto-generated: 2023-07-24 11:49:12
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@Builder
@Getter
@Setter
public class Intent {

    private String query;
    private double score;
    private boolean complete;
    private String domain;
    private int confidence;
    private String skillType;

    @JsonProperty("sub_domain")
    private String subDomain;
    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("request_type")
    private String requestType;
    @JsonProperty("need_fetch_token")
    private boolean needFetchToken;
    @JsonProperty("is_direct_wakeup")
    private boolean isDirectWakeup;
    private String slots;


}