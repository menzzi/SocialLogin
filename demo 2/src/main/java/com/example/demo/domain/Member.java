package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long memeber_id;

    private String id;
    private String username;

    private String gender;
    private String age_range;
    private String birthday;

    private String email;
    private String mobile; // 휴대폰 번호
    private String birthyear; // 출생연도


}