package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi") // URL 요청 접수
    public String niceToMeetYou(Model model) // model 객체 받아오기
    {
        // model 객체가 "우진"값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username", "WOOJIN");
        model.addAttribute("username", "우진");
        return "greetings"; // greetings.mustache 파일 변환
    }
}
