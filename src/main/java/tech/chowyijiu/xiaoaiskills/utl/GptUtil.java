package tech.chowyijiu.xiaoaiskills.utl;

import com.unfbx.chatgpt.OpenAiClient;
import com.unfbx.chatgpt.entity.chat.ChatCompletion;
import com.unfbx.chatgpt.entity.chat.ChatCompletionResponse;
import com.unfbx.chatgpt.entity.chat.Message;
import com.unfbx.chatgpt.function.KeyRandomStrategy;
import tech.chowyijiu.xiaoaiskills.config.GptConfig;

import java.util.List;

/**
 * @author elastic chow
 * @date 24/7/2023
 */
public class GptUtil {

    public static String chat(String question) {
        OpenAiClient client = OpenAiClient.builder()
                .apiKey(GptConfig.chatGptKey)
                .keyStrategy(new KeyRandomStrategy())
                .build();
        Message message = Message.builder().role(Message.Role.USER).content(question).build();
        ChatCompletion chatCompletion = ChatCompletion.builder().messages(List.of(message)).build();
        StringBuilder sb = new StringBuilder();
        //sb.append("[GPT3.5]");
        try {
            ChatCompletionResponse chatCompletionResponse = client.chatCompletion(chatCompletion);
            chatCompletionResponse.getChoices().forEach(e -> sb.append(e.getMessage().getContent()));
        } catch (Exception e) {
            //e.printStackTrace();
            sb.append("网络发生错误, 或者API key 失效");
        }
        return sb.toString();
    }
}
