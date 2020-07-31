package top.simba1949.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.simba1949.facade.IDubboService;

/**
 * @author Anthony
 * @date 2020/7/31 16:17
 */
@RestController
@RequestMapping("dubbo")
public class DubboController {

    @DubboReference(check = false)
    private IDubboService dubboService;

    @GetMapping
    public String sayHello(String name){
        System.out.println("the parameter {name} is " + name);
        String result = dubboService.sayHello(name);
        System.out.println("the response result is " + result);
        return result;
    }
}
