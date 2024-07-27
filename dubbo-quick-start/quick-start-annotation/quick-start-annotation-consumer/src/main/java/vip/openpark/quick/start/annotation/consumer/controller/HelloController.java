package vip.openpark.quick.start.annotation.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.base.IHelloFacade;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 3:42 PM
 */
@RestController
@RequestMapping
public class HelloController {

	@DubboReference
	private IHelloFacade helloService;

	@GetMapping("hello")
	public String hello(@RequestParam("name") String name) {
		return helloService.hello(name);
	}
}