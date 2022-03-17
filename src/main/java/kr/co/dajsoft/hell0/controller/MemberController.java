package kr.co.dajsoft.hell0.controller;

import kr.co.dajsoft.hell0.dto.MemberDTO;
import kr.co.dajsoft.hell0.loginuser.LoginUser;
import kr.co.dajsoft.hell0.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
@AllArgsConstructor
//@RequiredArgsConstructor
public class MemberController {
    private MemberService memberService;

    @GetMapping("/login/signup")
    public String dispSignup(MemberDTO memberdto) {
        return "/login/signup";
    }

    @PostMapping("/login/signup")
    public String execSignup(@Valid MemberDTO memberdto, Errors errors, Model model) {
        if (errors.hasErrors()) {
            // 회원가입 실패시, 입력 데이터를 유지
            model.addAttribute("memberdto", memberdto);

            // 유효성 통과 못한 필드와 메시지를 핸들링
            Map<String, String> validatorResult = memberService.validateHandling(errors);
            for (String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
            }

            return "/login/signup";
        }

        memberService.joinUser(memberdto);
        return "/login/login";
    }

    @GetMapping("/login/login")
    public String displogin() {
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

    // 정보 수정 페이지
    @GetMapping("/login/modify")
    public String Modify() {
        return "/login/modify";
    }

//    /* 회원정보 수정 */
//    @GetMapping("/login/modify")
//    public String modify(@LoginUser MemberDTO memberdto, Model model) {
//        if (memberdto != null) {
//            model.addAttribute("member", memberdto.getMemberEMAIL());
//            model.addAttribute("memberdto", memberdto);
//        } return "/login/modify"; }

    // 회원 탈퇴 페이지
    @GetMapping("/login/delete")
    public String dispDelete() {
        return "/login/delete";
    }
}
