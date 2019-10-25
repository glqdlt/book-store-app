package com.glqdlt.bookstore.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
@Controller
public class RootController {
    @GetMapping(value = "")
    public String getRoot() {
        return "index.html";
    }
}
