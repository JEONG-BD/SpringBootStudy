package me.bootdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {
    // 비즈니스 계층

    // Bean 주입
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        return memberRepository.findAll();

    }

    public void test() {

        memberRepository.save(new Member(1L, "A"));

        Optional<Member> member = memberRepository.findById(1L);
        List<Member> allMembers = memberRepository.findAll();

        memberRepository.deleteById(1L);
    }
}
