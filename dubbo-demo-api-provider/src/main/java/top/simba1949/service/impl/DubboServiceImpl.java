package top.simba1949.service.impl;

import top.simba1949.facade.IDubboService;

/**
 * @author Anthony
 * @date 2020/8/4 10:54
 */
public class DubboServiceImpl implements IDubboService {
    public String sayHello(String name) {
        System.out.println("receive parameter {name} is " + name);
        return "Hello, " + name;
    }
}
