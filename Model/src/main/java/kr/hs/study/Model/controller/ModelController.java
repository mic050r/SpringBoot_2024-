package kr.hs.study.Model.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {

    @GetMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("name", "kim");
        model.addAttribute("age", "30");
        return "test2";
    }

}
