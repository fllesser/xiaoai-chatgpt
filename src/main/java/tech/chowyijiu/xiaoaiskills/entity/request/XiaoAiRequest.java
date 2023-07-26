/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.xiaoaiskills.entity.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class XiaoAiRequest {

    private String version;
    private Session session;
    private RequestData request;
    private String query;
    private Context context;

}