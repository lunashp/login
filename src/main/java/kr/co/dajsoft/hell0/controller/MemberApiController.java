//package kr.co.dajsoft.hell0.controller;
//
//import kr.co.dajsoft.hell0.dto.MemberDTO;
//import kr.co.dajsoft.hell0.service.MemberService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RequiredArgsConstructor
//@RequestMapping("/api")
//@RestController
//public class MemberApiController {
//    private final MemberService memberService;
//    private final AuthenticationManager authenticationManager;
//
//    @PutMapping("/user")
//    public ResponseEntity<String> modify(@RequestBody MemberDTO memberdto){
//        memberService.modify(memberdto);
//
//        //변경된 세션 등록
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(memberdto.getMemberEMAIL(), memberdto.getMemberPW()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        return new ResponseEntity<>("success", HttpStatus.OK);
//    }
//}
