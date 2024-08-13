package kr.hs.study.bootprj.controller;

import kr.hs.study.bootprj.model.ModelDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @PostMapping("/test1")
    public String sum(@RequestParam("num") int num, Model model) {
        model.addAttribute("result", num);
        return "test1";
    }

    @PostMapping("/test/{num}")
    public String sum2(@PathVariable("num") int num, Model model) {
        model.addAttribute("result", num);
        return "test1";
    }

    @PostMapping("/test2")
    public String sum3(@ModelAttribute ModelDTO modelDTO, Model model) {
        model.addAttribute("result", modelDTO);
        return "test2";
    }
}
