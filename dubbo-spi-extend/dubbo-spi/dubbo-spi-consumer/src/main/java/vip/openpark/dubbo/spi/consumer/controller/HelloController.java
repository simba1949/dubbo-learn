package vip.openpark.dubbo.spi.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.base.IHelloFacade;

/**
 * @author anthony
 * @version 2024/7/25
 * @since 2024/7/25 10:40
 */
@Slf4j
@RestController
@RequestMapping
public class HelloController {
    @DubboReference(group = "dubbo-spi-provider", version = "1.0.0")
    private IHelloFacade helloService;

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name) {
        return helloService.hello(name);
    }
}