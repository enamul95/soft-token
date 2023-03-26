package com.softtoken.controller;

import com.google.zxing.WriterException;
import com.softtoken.model.SoftTokenRequest;
import com.softtoken.model.SoftTokenResponse;
import com.softtoken.service.SoftTokenService;
import com.softtoken.util.QRCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
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

@Autowired
private SoftTokenService softTokenService;
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
        SoftTokenResponse response =  softTokenService.save(softTokenRequest);

        model.addAttribute("softToken", response.getSoftToken());
        model.addAttribute("email", response.getEmail());
        model.addAttribute("name", response.getName());
        model.addAttribute("qrData", response.getQr());

        return "token_scan";
    }





    }
