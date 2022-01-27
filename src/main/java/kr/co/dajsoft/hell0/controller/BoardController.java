package kr.co.dajsoft.hell0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BoardController {
    @GetMapping("/")
    public String list(){
        return "board/index.html";
    }
    @GetMapping("/portfolioModal1")
    public String post(){
        return "board/list.html";
    }
}
