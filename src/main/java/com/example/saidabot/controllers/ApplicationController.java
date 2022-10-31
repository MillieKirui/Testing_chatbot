package com.example.saidabot.controllers;


import com.example.saidabot.Model.NotificationPayload.Payload;
import com.example.saidabot.Services.PayLoadValidation;
import com.example.saidabot.Services.WhatsappTokenVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class ApplicationController {


    @Autowired
    PayLoadValidation payloadValidate;

    @GetMapping("/webhook")
    public ResponseEntity<String> challengeresponse(HttpServletRequest request) {
        String challenge = request.getParameter("hub.challenge");
        String token = request.getParameter("hub.verify_token");
        String mode = request.getParameter("hub.mode");
        return WhatsappTokenVerification.verify_token(challenge,token,mode);


    }

//    //@RequestMapping(path="/webhook", method = RequestMethod.POST)
    @PostMapping( value = "/webhook")
    public ResponseEntity<Payload>  postBody(@RequestBody Payload payload) throws IOException {

        return payloadValidate.validate_payload(payload);
    }
//    public String postBody(@RequestBody String message)  {
//        System.out.println(message);
//        return message;
//    }


}
