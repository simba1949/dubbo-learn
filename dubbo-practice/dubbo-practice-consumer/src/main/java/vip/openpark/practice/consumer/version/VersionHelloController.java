package vip.openpark.practice.consumer.version;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.base.IHelloFacade;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:36
 */
@Slf4j
@RestController
@RequestMapping("version")
public class VersionHelloController {
    @DubboReference(version = "1.0.0")
    private IHelloFacade helloFacadeVersion1;
    @DubboReference(version = "2.0.0")
    private IHelloFacade helloFacadeVersion2;
    /**
     * version = "*" 不区分版本，系统选择某一个版本服务进行调用
     */
    @DubboReference(version = "*")
    private IHelloFacade helloFacadeNoVersion;

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name) {
        String resultV1 = helloFacadeVersion1.hello(name);
        log.info("resultV1:{}", resultV1);
        String resultV2 = helloFacadeVersion2.hello(name);
        log.info("resultV2:{}", resultV2);

        String resultNoVersion = helloFacadeNoVersion.hello(name);
        log.info("resultNoVersion:{}", resultNoVersion);
        return "SUCCESS";
    }
}