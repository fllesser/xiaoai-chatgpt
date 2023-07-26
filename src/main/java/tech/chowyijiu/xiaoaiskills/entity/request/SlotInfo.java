/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.request;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class SlotInfo {

    @JsonProperty("intent_name")
    private String intentName;
    private List<Slot> slots;
}