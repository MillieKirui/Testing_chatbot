package com.example.saidabot.Services;

//import com.project.achatbot.Model.ReceivedMessage.Contact;
//import com.project.achatbot.Model.ReceivedMessage.CustomerMessage;
//import com.project.achatbot.Model.ReceivedMessage.Entry;
import com.example.saidabot.Model.NotificationPayload.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MessageCheck {

    @Autowired
            ResponseMessage responseMessage;

    Logger logger = LoggerFactory.getLogger(MessageCheck.class);


    public ResponseEntity<Payload> check_received_message(Payload payload) throws IOException {

        String type = payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0).getType();

        String from = payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0).getFrom();


        if(type.equals("text")){

            return responseMessage.send_response(from);

        }
        else {
            logger.info(type);

        }
        return null;
    }


}