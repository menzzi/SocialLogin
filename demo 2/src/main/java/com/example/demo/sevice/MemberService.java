package com.example.demo.sevice;

import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor    //final or NonNull 옵션 필드를 전부 포함한 생성자 만들어줌
@Service
public class MemberService {

    private final MemberRepository memberRepository;

}
