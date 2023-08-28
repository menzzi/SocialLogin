package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class KakaoDTO {

    private long id;
    private String email;
    private String nickname;

    private String gender;
    private String age_range;
    private String birthday;

}