package kr.hs.study.FirstBoot.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    /* GET 방식으로 / 에 접속했을 때 home()를 실행하라
       home() 메소드 : boot가 자동으로 html 확장자를 붙여줌 (index.html)
                      template 폴더 밑에서 index.html을 찾아서 실행
     */
    @GetMapping("/")
    public String home() {
        return "index";
    }


}
