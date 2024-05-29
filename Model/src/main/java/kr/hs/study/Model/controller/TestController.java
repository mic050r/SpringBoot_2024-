package kr.hs.study.Model.controller;

import kr.hs.study.Model.dto.ModelDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    @PostMapping("/test1")
    public String test1(@ModelAttribute ModelDTO dto) {
        // @ModelAttribute ModelDTO dto : 사용자의 입력값이 자동으로 dto에 들어간다
        System.out.println(dto.getNum());
        return "test1"; // view
    }
}
