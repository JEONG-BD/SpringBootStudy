package me.bootdev.bt06.service;


import lombok.RequiredArgsConstructor;
import me.bootdev.bt06.domain.User;
import me.bootdev.bt06.dto.AddUserRequest;
import me.bootdev.bt06.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository ;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto){
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPossword()))
                .build()).getId();
    }
}
