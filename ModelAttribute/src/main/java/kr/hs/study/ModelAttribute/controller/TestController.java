package kr.hs.study.ModelAttribute.controller;

import kr.hs.study.ModelAttribute.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDTO dto) {
        // 사용자가 입력하면, 입력값을 dto의 멤버변수에 자종으로 넣어준다( set() 이용해서)
        System.out.println("id : " + dto.getId());
        System.out.println("pass : " + dto.getPass());
        return "result";
    }
}
