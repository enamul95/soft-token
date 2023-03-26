package com.softtoken.controller;

import com.google.zxing.WriterException;
import com.softtoken.model.SoftTokenRequest;
import com.softtoken.util.QRCodeGenerator;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;


@Controller
@RequestMapping("/")
public class TokenController {



//    @GetMapping("/")
//    public String hello() {
//        System.out.printf("---caling test");
//        return "test";
//    }
    @GetMapping("")
    public String index() {
        System.out.printf("---caling test");
        return "login";
    }

    @PostMapping("/registration")
    public String staffSave(SoftTokenRequest softTokenRequest, BindingResult result, Model model) {
        System.out.println("softTokenRequest = " + softTokenRequest);

        if (result.hasErrors()) {
            return "login";
        }

        model.addAttribute("softToken", "25252252");
        model.addAttribute("email", "ehaque95@gmail.com");
        model.addAttribute("name", "Enamul Haque");
        model.addAttribute("qrData", "000101");

        return "token_scan";
    }





    }
