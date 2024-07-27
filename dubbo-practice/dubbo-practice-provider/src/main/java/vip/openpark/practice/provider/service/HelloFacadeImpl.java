package vip.openpark.practice.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IHelloFacade;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:12
 */
@DubboService
public class HelloFacadeImpl implements IHelloFacade {
    @Override
    public String hello(String name) {
        return "[dubbo-practice-provider] hello " + name;
    }
}