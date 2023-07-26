/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class RequestData {

    private int type;
    @JsonProperty("request_id")
    private String requestId;
    private long timestamp;
    private Intent intent;
    private String locale;
    @JsonProperty("slot_info")
    private SlotInfo slotInfo;


}