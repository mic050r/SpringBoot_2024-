package kr.study.UrlMapping2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("sub/test2")
    public String test2() {
        return "test2";
    }

    @GetMapping("sub/test3")
    public String test3() {
        return "test3";
    }
}
