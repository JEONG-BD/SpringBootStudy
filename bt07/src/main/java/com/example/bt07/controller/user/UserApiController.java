package com.example.bt07.controller.user;

import com.example.bt07.dto.user.AddUserRequest;
import com.example.bt07.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
@Slf4j
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String singUp(AddUserRequest request){

        userService.save(request);
        return "redirect:/login";
    }

}
