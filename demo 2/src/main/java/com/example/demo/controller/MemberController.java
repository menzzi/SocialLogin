package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/myPage")
    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();


        HttpSession session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        String user_name = member.getUsername();
        String user_email = member.getEmail();
        String user_gender = member.getGender();


        session.setAttribute("isLogon", true);
        session.setAttribute("login.name", user_name);
        session.setAttribute("login.email", user_email);
        session.setAttribute("login.gender", user_gender);


        out.print("<html><body>");
        out.print("안녕하세요 " + user_name + "님!!!<br>");
        out.print("<a href='show'>회원정보보기</a>");
        out.print("</body></html>");

    }

    @GetMapping("/show")
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String name = "", email="",gender="";

        HttpSession session = request.getSession();
        session.setAttribute("isLogon", true);

        name = (String)session.getAttribute("login.name");
        email = (String)session.getAttribute("login.email");
        gender = (String)session.getAttribute("login.gender");
        out.print("<html><body>");
        out.print("이름: " + name+"<br>");
        out.print("이메일: " + email+"<br>");
        out.print("성별: " + gender+"<br>");
        out.print("</body></html>");

    }
}
