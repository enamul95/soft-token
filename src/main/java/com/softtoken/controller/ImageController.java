package com.softtoken.controller;

import com.google.zxing.WriterException;
import com.softtoken.model.SoftTokenRequest;
import com.softtoken.model.SoftTokenResponse;
import com.softtoken.service.SoftTokenService;
import com.softtoken.util.QRCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private SoftTokenService softTokenService;

    @GetMapping("/qr/{text}")
    public ResponseEntity<byte[]> getMenuImage(@PathVariable String text) throws IOException, WriterException {
        System.out.println("text = " + text);

        QRCodeGenerator qr = new QRCodeGenerator();
        byte[] data = qr.getQRCodeImage(text,250,250);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(data);
    }

    @PostMapping("/test")
    public SoftTokenResponse save(@RequestBody SoftTokenRequest request) {
        System.out.println("request = " + request);
        return softTokenService.save(request);
    }

}
