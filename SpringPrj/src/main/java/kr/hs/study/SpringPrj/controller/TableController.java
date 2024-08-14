package kr.hs.study.SpringPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TableController {

    @GetMapping("/table")
    public String table() {
        return "table";
    }

    @PostMapping("/table")
    public String table(@RequestParam("num") int num, Model model) {
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= 9; i++) {
            String val = num + "X" + i + "=" + num*i + "\r\n";
            result.append(val);
        }
        model.addAttribute("result", result.toString());
        return "table";
    }
}
