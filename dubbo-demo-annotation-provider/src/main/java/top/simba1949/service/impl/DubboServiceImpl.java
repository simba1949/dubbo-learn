package top.simba1949.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import top.simba1949.facade.IDubboService;

/**
 * @author Anthony
 * @date 2020/7/31 16:11
 */
@DubboService()
public class DubboServiceImpl implements IDubboService {
    @Override
    public String sayHello(String name) {
        System.out.println("receive parameter {name} is " + name);
        return "Hello, " + name;
    }
}
