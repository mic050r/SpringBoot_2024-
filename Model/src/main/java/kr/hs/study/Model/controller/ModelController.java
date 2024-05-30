package kr.hs.study.Model.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {

    @GetMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("name", "kim");
        model.addAttribute("age", "30");
        return "test2";
    }

    @GetMapping("/test3")
    public String test3(@RequestParam("data1") int data1,
                        @RequestParam("data2") int data2,
                        @RequestParam("data3") int data3,
                        Model model
                        ) {
        System.out.println(data1 + data2 + data3);
        model.addAttribute("d1", data1);
        model.addAttribute("d2", data2);
        model.addAttribute("d3", data3);

        return "test3";
    }
}
