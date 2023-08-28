package com.example.demo.dto;

import com.example.demo.domain.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyPageDTO {
    private String username;
    private String gender;
    private String email;
    private String mobile; // 휴대폰 번호


    //repository 를 통해 조회한 entity 를 dto 로 변환 용도
    public MyPageDTO(Member entity) {
        this.username = entity.getUsername();
        this.gender = entity.getGender();
        this.email = entity.getEmail();
        this.mobile = entity.getMobile();
    }

}
