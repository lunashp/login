package kr.co.dajsoft.hell0.controller;

import kr.co.dajsoft.hell0.dto.PageRequestDTO;
import kr.co.dajsoft.hell0.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@Log4j2
@RequiredArgsConstructor
public class HomeController {
    @GetMapping({"/","board/list"})
    public String index(){
        return "/board/list";
    }
    @GetMapping("board/member")
    public String member(){
        return "/board/member";
    }
    @GetMapping("board/board")
    public String board(){
        return "/board/board";
    }
    @GetMapping("board/basketball")
    public String basketball(){
        return "/board/basketball";
    }
    @GetMapping("board/football")
    public String football(){
        return "/board/football";
    }
}
