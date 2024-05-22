package kr.study.UrlMapping2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sub")
public class TestController {

    @GetMapping("test1")
    @ResponseBody // 굳이 화면을 만들지 않아도 텍스트로 화면에 출력
    public String test1() {
        return "test1";
    }

    @GetMapping("test2")
    public String test2() {
        return "test2";
    }

    @GetMapping("test3")
    public String test3() {
        return "test3";
    }
}
