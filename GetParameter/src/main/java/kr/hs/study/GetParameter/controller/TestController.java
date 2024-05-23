package kr.hs.study.GetParameter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("test4/{data1}/{data2}/{data3}")
    public String test(@PathVariable("data1") int data1,
                       @PathVariable("data2") int data2,
                       @PathVariable("data3") int data3) {
        System.out.println("data1 : " + data1);
        int sum = data1+data2+data3;
        System.out.println("int :" + sum);
        return "result";
    }
}
