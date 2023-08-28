package com.example.demo;

import com.example.demo.sevice.KakaoService;
import com.example.demo.sevice.NaverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final KakaoService kakaoService;
    private final NaverService naverService;

//    @RequestMapping(value="/", method= RequestMethod.GET)
    @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("kakaoUrl", kakaoService.getKakaoLogin());
        model.addAttribute("naverUrl", naverService.getNaverLogin());

        return "index";
    }

}