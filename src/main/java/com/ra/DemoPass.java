package com.ra;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class DemoPass {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}