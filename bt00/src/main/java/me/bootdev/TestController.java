package me.bootdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    // 프레젠테이션 계층
    @Autowired
    TestService testService;
//    @GetMapping("/test1")
//    public String test(){
//        return "Hello World";
//    }

    @GetMapping("test")
    public List<Member> getAllMembers(){
        List<Member> members = testService.getAllMembers();

        return members;
    }

}
