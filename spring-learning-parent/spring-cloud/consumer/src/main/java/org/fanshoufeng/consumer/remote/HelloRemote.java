/**
 * 
 */
package org.fanshoufeng.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Michael Fan
 *
 */
@FeignClient(name= "producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

	@RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
	
}
