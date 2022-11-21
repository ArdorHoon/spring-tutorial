package com.hunmo.examplespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 참고: 컨트롤러가 정적 파일보다 우선순위가 높다. (여기서 매핑 되면 바로 출력)
    @GetMapping("/")
    public String Home(){
        return "home";
    }
}
