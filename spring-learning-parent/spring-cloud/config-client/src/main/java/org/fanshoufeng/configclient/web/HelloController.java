/**
 * 
 */
package org.fanshoufeng.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Michael Fan
 *
 */
@RestController
public class HelloController {

	@Value("${democonfigclient.message}")
    private String hello;

	@RequestMapping("/")
    public String home() {
        return hello;
    }
}
