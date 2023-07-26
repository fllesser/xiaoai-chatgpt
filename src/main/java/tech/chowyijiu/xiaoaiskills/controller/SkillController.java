package tech.chowyijiu.xiaoaiskills.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import tech.chowyijiu.xiaoaiskills.entity.request.XiaoAiRequest;
import tech.chowyijiu.xiaoaiskills.entity.request.Slot;
import tech.chowyijiu.xiaoaiskills.entity.response.XiaoAiResponse;
import tech.chowyijiu.xiaoaiskills.handler.SlotHandler;

import java.util.List;

/**
 * @author elastic chow
 * @date 24/7/2023
 */
@Slf4j
@RestController
public class SkillController {

    public static final String coreName = "贾斯特";

    @PostMapping("/skill")
    public XiaoAiResponse skill(@RequestBody XiaoAiRequest data, @RequestHeader("Authorization") String auth) {
        String query = data.getRequest().getIntent().getQuery();
        List<Slot> slots = data.getRequest().getSlotInfo().getSlots();
        log.info("query: {}, slots: {}", query, slots);
        String gptResp = SlotHandler.reply;
        if (gptResp != null && gptResp.length() > 0){
            SlotHandler.reply = "";
            return XiaoAiResponse.end(gptResp);
        }
        XiaoAiResponse reply = switch (query.intern()) {
            case "打开贾斯特", "进入贾斯特" -> XiaoAiResponse.chat("贾斯特核心引擎已开启");
            case "关闭技能", "关闭贾斯特", "退出", "关闭" -> XiaoAiResponse.end("贾斯特核心引擎已开启");
            case "" -> XiaoAiResponse.chat("continue waiting");
            default -> null;
        };
        if (reply != null) return reply;
        if (slots == null || slots.size() == 0) return XiaoAiResponse.chat("没有命中语料");

        String replyText = "";
        for (Slot slot : slots) {
            replyText = switch (slot.getName().intern()) {
                case "keyword" -> SlotHandler.handleKeyword(slot.getRawValue());
                case "search" -> SlotHandler.handleSearch(slot.getRawValue());
                default -> "功能正在开发中";
            };
        }
        return XiaoAiResponse.chat(replyText);
    }

}
