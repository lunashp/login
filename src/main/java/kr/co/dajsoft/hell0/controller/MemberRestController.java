//package kr.co.dajsoft.hell0.controller;
//
//import kr.co.dajsoft.hell0.dto.MemberDTO;
//import kr.co.dajsoft.hell0.service.MemberService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RequiredArgsConstructor
//@RequestMapping("/api")
//@RestController
//public class MemberRestController {
//    private final MemberService memberService;
//
//    @PutMapping("/user")
//    public ResponseEntity<String> modify(@RequestBody MemberDTO memberdto) {
//        memberService.modify(memberdto);
//
//        return new ResponseEntity<>("success", HttpStatus.OK);
//    }
//}
//
//
//
