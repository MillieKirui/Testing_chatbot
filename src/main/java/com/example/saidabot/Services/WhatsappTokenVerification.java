package com.example.saidabot.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WhatsappTokenVerification {

    //Inject token value
    @Value("${webhook_verification.token}")
    private static String verification_token;

    //Method to verify whatsapp token for webhook verification
    public static ResponseEntity<String> verify_token(String challenge, String token, String mode) {

        if ((token==null) || (challenge==null) || (mode==null)){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        else{
            if(mode.equals("subscribe")){

                if(token.equals(verification_token)){

                    System.out.println(mode);
                    return new ResponseEntity<>(mode, HttpStatus.OK);

                }
                else{
                    return new ResponseEntity<>(HttpStatus.FORBIDDEN);
                }

            }
            else{
                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
            }


        }
    }

}
