package com.sun.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.service.BaseHello;

/**
 * 通过@FeignClient注解指定服务名来绑定服务，这里的服务名字不区分大小写
 * 然后再通过@RequestMapping来绑定服务下的rest接口
 * @author Sunxf
 *
 */
@FeignClient(name="hello-service")
public interface FeignConsumerService extends BaseHello{
	
	@RequestMapping("/hello")
    public void hello();
}
