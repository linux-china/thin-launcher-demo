package org.mvnsearch;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * portal controller
 *
 * @author linux_china
 */
@RestController
public class PortalController {

    @GetMapping("/")
    public String info() {
        return StringUtils.replace("Hello Jacky", "hello", "你好");
    }
}
