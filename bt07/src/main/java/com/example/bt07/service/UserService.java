package com.example.bt07.service;

import com.example.bt07.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    //bprivate final BCryptPasswordEncoder bCryptPasswordEncoder;

}
