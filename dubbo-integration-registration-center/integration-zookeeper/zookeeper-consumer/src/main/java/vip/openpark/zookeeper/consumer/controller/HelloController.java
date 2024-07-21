package vip.openpark.zookeeper.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.base.IHelloService;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 8:55 PM
 */
@RestController
@RequestMapping
public class HelloController {

	@DubboReference(group = "zookeeper", version = "1.0.0")
	private IHelloService helloService;

	@GetMapping("hello")
	public String hello(@RequestParam("name") String name) {
		return helloService.hello(name);
	}
}