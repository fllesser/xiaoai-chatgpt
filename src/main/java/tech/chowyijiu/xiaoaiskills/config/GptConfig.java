package tech.chowyijiu.xiaoaiskills.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author elastic chow
 * @date 24/7/2023
 */
@ConfigurationProperties(prefix = "myconfig")
public class GptConfig {

    public static List<String> chatGptKey;

    public void setChatGptKey(List<String> chatGptKey) {
        GptConfig.chatGptKey = chatGptKey;
    }
}
