package kr.hs.study.firstDB.controller;

import kr.hs.study.firstDB.dto.TestDTO;
import kr.hs.study.firstDB.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private TestService service;   //컨테이너에 있는 TestService 객체에 주소를 찾아서 자동으로 service에 대입한다.

    @GetMapping("/add")
    public String add(){
        return "add_form";
    }

    @PostMapping("/add_done")
    public String add_done(TestDTO dto){
        service.insert(dto);
        return "redirect:/";
    }

    @GetMapping("/")
    public String listAll(Model model) {
        List<TestDTO> list = service.listAll();
        model.addAttribute("listA", list);
        return "index";
    }

    @GetMapping("/read/{id}")
    public String read(@PathVariable("id") int id, Model model) {
        TestDTO testDTO = service.read(id);
        model.addAttribute("one", testDTO);
        return "read";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model){
        TestDTO testDTO = service.read(id);
        model.addAttribute("one", testDTO);
        return "read";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
