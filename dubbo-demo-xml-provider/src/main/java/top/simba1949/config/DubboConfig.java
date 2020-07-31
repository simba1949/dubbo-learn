package top.simba1949.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Anthony
 * @date 2020/7/31 12:00
 */
@Configuration
@ImportResource(locations = "classpath:/dubbo/dubbo-xml-provider.xml")
public class DubboConfig {
}
