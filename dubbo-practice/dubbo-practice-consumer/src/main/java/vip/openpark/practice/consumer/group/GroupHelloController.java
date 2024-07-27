package vip.openpark.practice.consumer.group;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.base.IGroupMergerFacade;
import vip.openpark.base.IHelloFacade;

import java.util.List;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:16
 */
@Slf4j
@RestController
@RequestMapping("group")
public class GroupHelloController {

    @DubboReference(group = "group-a")
    private IHelloFacade helloFacadeGroupA;
    @DubboReference(group = "group-b")
    private IHelloFacade helloFacadeGroupB;

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name) {
        String resultA = helloFacadeGroupA.hello(name);
        log.info("resultA:{}", resultA);
        String resultB = helloFacadeGroupB.hello(name);
        log.info("resultB:{}", resultB);
        return "SUCCESS";
    }

    /**
     * group = "*" 表示搜索所有的组，或者多个分组使用 "," 分割
     * merger = "true" 表示合并结果
     */
    @DubboReference(group = "*", merger = "true")
    private IGroupMergerFacade groupMergerFacade;

    @GetMapping("fetchMenu")
    public List<String> fetchMenu() {
        List<String> menus = groupMergerFacade.fetchMenu(1L);
        menus.forEach(menu -> log.info("menu:{}", menu));
        return menus;
    }
}