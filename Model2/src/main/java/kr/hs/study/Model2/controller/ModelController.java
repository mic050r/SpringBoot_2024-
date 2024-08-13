package kr.hs.study.Model2.controller;

import kr.hs.study.Model2.dto.LoginDTO;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ModelController {

    @GetMapping("")
    public String index() {
        return "index";
    }
    @GetMapping("/test1")
    public String test1(Model model) {
        model.addAttribute("name", "kim");
        model.addAttribute("email", "test@gmail.com");
        return "result";
    }

//    @GetMapping("/test2")
//    public String test2(@RequestParam("id") String id,
//                        @RequestParam("pass") String pass,
//                        Model model) {
//        String result = "";
//        if(id.equals("kim") && pass.equals("1111")) {
//            result = "Welcome Kim";
//        } else {
//            result = "Wrong Login";
//        }
//        model.addAttribute("result", result);
//        return "test2";
//    }

    @GetMapping("/test2")
    public String test3(LoginDTO dto, Model model) {
        // @ModelAttribute loginDto dto : 사용자가 입력한 값을 set()을 이용하여 자동으로 dto의 멤버면수에 넣는다.
        String result = "";
        if(dto.getId().equals("kim") && dto.getPass().equals("1111")) {
            result = "Welcome Kim";
        } else {
            result = "Wrong Login";
        }
        model.addAttribute("result", result);
        return "test2";
    }
    @GetMapping("/test4")
    public ModelAndView test4() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("email", "abc");
        mv.addObject("addr", "seoul");
        mv.setViewName("test4");
        return mv;
    }

    //
    @GetMapping("/test5")
    public ModelAndView test5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");
        list.add("kang");
        ModelAndView mv = new ModelAndView();
        mv.addObject("data", list);
        mv.setViewName("test5");
        return mv;
    }
}
