package top.simba1949.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.simba1949.facade.IDubboService;

/**
 * @author Anthony
 * @date 2020/7/31 12:05
 */
@RestController
@RequestMapping("dubbo")
public class DubboController {
    /**
     * 在 dubbo-xml-consumer.xml 中配置
     * <dubbo:reference id="dubboService" interface="top.simba1949.facade.IDubboService" timeout="6000" check="false"/>
     * 会自动将 IDubboService 注册到 spring 容器中，直接直接注入
     */
    @Autowired
    private IDubboService dubboService;

    @GetMapping
    public String sayHello(String name){
        System.out.println("the parameter {name} is " + name);
        String result = dubboService.sayHello(name);
        System.out.println("the response result is " + result);
        return result;
    }
}
