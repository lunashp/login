package kr.co.dajsoft.hell0.controller;

import kr.co.dajsoft.hell0.dto.MemberDTO;
import kr.co.dajsoft.hell0.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

//    // 메인 페이지
//    @GetMapping("/board/login")
//    public String index() {
//        return "/index";
//    }

    // 회원가입 페이지
    @GetMapping("/login/signup")
    public String dispSignup() {
        return "/login/signup";
    }

    // 회원가입 처리
    @PostMapping("/login/signup")
    public String execSignup(MemberDTO memberdto) {
        memberService.joinUser(memberdto);

        return "redirect:/login/login";
    }

    // 로그인 페이지
    @GetMapping("/login/login")
    public String dispLogin() {
        return "/login/login";
    }

    // 로그인 결과 페이지
    @GetMapping("/login/login/result")
    public String dispLoginResult() {
        return "/login/loginSuccess";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/login/logout/result")
    public String dispLogout() {
        return "/login/logout";
    }

    // 접근 거부 페이지
    @GetMapping("/login/denied")
    public String dispDenied() {
        return "/login/denied";
    }

    // 내 정보 페이지
    @GetMapping("/login/info")
    public String dispMyInfo() {
        return "/login/myinfo";
    }

    // 어드민 페이지
    @GetMapping("/admin")
    public String dispAdmin() {
        return "/login/admin";
    }
}
