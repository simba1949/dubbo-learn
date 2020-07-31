package top.simba1949.service.impl;

import top.simba1949.facade.IDubboService;

/**
 * @author Anthony
 * @date 2020/7/31 11:59
 */
public class DubboServiceImpl implements IDubboService {

    @Override
    public String sayHello(String name) {
        System.out.println("receive parameter {name} is " + name);
        return "Hello, " + name;
    }
}
