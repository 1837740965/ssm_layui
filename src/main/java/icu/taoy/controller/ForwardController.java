package icu.taoy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author javakiller宇
 * @decription hello
 */
@Controller
public class ForwardController {

    @RequestMapping({"/"})
    public String index() {
        return "index";
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }
}
