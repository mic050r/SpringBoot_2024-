package kr.hs.study.GetParameter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1(HttpServletRequest http) {
        String d1 = http.getParameter("data1");
        String d2= http.getParameter("data2");
        String d3 = http.getParameter("data3");
        System.out.println("data1 : " + d1);
        System.out.println("data2 : " + d2);
        System.out.println("data3 : " + d3);

        return "test1";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest http) {
        String d1 = http.getParameter("data1"); // 단일 값 가져오기
        String d3[] = http.getParameterValues("data3"); // 배열 값 가져오기

        for(String s : d3) System.out.println(s);

        return "result";
    }

    @GetMapping("/test3")
    public String test3(WebRequest http) {
        String d1 = http.getParameter("data1"); // 단일 값 가져오기
        String d3[] = http.getParameterValues("data3"); // 배열 값 가져오기

        for(String s : d3) System.out.println(s);

        return "result";
    }

    @GetMapping("/test4/{data1}/{data2}/{data3}")
    public String test(@PathVariable("data1") int data1,
                       @PathVariable("data2") int data2,
                       @PathVariable("data3") int data3) {
        System.out.println("data1 : " + data1);
        int sum = data1+data2+data3;
        System.out.println("int :" + sum);
        return "result";
    }

    @GetMapping("/test5")
    public String test(@RequestParam("data1") String data1,
                       @RequestParam("data2") String data2,
                       @RequestParam("data3") String[] data3,
                        @RequestParam(value = "data4", required = false, defaultValue = "initial") String data4) {
        // required = false : 값이 없을 때 자동으로 null을 넣어줌
        // defaultValue="22" : 초기값을 지정해줌
        for(String s : data3) {
            System.out.println("data3 : " + s);
        }

        System.out.println("data4 : " + data4);
        return "result";
    }

    @PostMapping("/form")
    public String form(@RequestParam("id") String id,
                       @RequestParam("name") String name,
                       @RequestParam("email") String email) {
        System.out.println("id : " + id + ", name : " + name + ", email : " + email);
        return "index";
    }
}
