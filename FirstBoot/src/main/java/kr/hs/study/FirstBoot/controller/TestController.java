package kr.hs.study.FirstBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody // return 값이 텍스트로 그냥 출력
    public String test() {
        return "test";
    }}
