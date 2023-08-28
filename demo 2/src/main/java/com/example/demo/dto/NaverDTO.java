package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Data
@Getter
public class NaverDTO {

    private String id;
    private String email;
    private String name;
    private String password;
    private String mobile; // 휴대폰 번호
    private String gender;
    private String birthday;
    private String birthyear; // 출생연도


}