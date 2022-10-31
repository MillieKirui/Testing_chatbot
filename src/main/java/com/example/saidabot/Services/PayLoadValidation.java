package com.example.saidabot.Services;

import com.example.saidabot.Model.NotificationPayload.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class PayLoadValidation {
    @Autowired
    MessageCheck messagevalidation;

    Logger logger = LoggerFactory.getLogger(MessageCheck.class);

    //Validating the Payload Notification
    public ResponseEntity<Payload> validate_payload(Payload payload) throws IOException {

        if(((payload.getEntry().get(0).getChanges()).isEmpty())==false){

            if(((payload.getEntry().get(0).getChanges().get(0).getValue().getMessages()).isEmpty())==false){

                return messagevalidation.check_received_message(payload);

            }
            else if(((payload.getEntry().get(0).getChanges().get(0).getValue().getStatuses()).isEmpty())==false){

                logger.info("Status:",payload.getEntry().get(0).getChanges().get(0).getValue().getStatuses());
            }
            else if(((payload.getEntry().get(0).getChanges().get(0).getValue().getErrors()).isEmpty())==false){

                logger.info("Errors:",payload.getEntry().get(0).getChanges().get(0).getValue().getErrors());

            }

        }
        return null;
    }

}
