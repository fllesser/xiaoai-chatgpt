package tech.chowyijiu.xiaoaiskills.handler;

import lombok.extern.slf4j.Slf4j;
import tech.chowyijiu.xiaoaiskills.utl.GptUtil;
import tech.chowyijiu.xiaoaiskills.utl.gitcafe.GitcafeUtil;
import tech.chowyijiu.xiaoaiskills.utl.gitcafe.ResourceData;
import tech.chowyijiu.xiaoaiskills.utl.gitcafe.ResourceUtil;

import java.util.List;

/**
 * @author elastic chow
 * @date 24/7/2023
 */
@Slf4j
public class SlotHandler {

    public static String reply = "";

    public static String handleKeyword(String keyword) {
        new Thread(() -> {
            reply = GptUtil.chat(keyword);
            log.info("reply: {}", reply);
        }).start();
        return "问题已转达给ChatGpt, 等待响应";
        //List<ResourceData> resourceData = GitcafeUtil.get(keyword);
        //return ResourceUtil.buildString(resourceData);
    }

    public static String handleSearch(String search) {
        return "功能正在开发";
    }
}
