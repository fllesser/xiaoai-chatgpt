package tech.chowyijiu.xiaoaiskills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan({"tech.chowyijiu.xiaoaiskills.config"})
public class XiaoaiskillsApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoaiskillsApplication.class, args);
    }

}
