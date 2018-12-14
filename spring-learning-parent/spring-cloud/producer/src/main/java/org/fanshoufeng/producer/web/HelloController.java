/**
 * 
 */
package org.fanshoufeng.producer.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Michael Fan
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
	
}
