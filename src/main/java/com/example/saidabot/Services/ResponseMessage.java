package com.example.saidabot.Services;

import com.example.saidabot.Model.CustomerCare100.Level0;
import com.example.saidabot.Model.NotificationPayload.Payload;
import com.example.saidabot.Model.ResponseMessage.Language;
import com.example.saidabot.Model.ResponseMessage.Reply;
import com.example.saidabot.Model.ResponseMessage.Text;
import com.example.saidabot.Repository.Level0_Repository;
import com.google.gson.Gson;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ResponseMessage {

    @Autowired
    Level0_Repository level0Repository;

    public ResponseEntity<Payload> send_response(String from) throws IOException {

        Language language = new Language();
        language.setCode("en_us");

        Iterable<Level0> level0 = level0Repository.findAll();

        Text text = new Text();
        text.setBody(String.valueOf(level0));

        Reply reply = new Reply();
        reply.setMessagingProduct("whatsapp");
        reply.setTo(from);
        reply.setText(text);

        String finalreply =new Gson().toJson(reply);

        System.out.println(finalreply);

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody response_body = RequestBody.create(mediaType,finalreply);
        Request request = new Request.Builder()
                .url("https://graph.facebook.com/v15.0/100508679524191/messages")
                .method("POST", response_body)
                .addHeader("Authorization", "Bearer EAAGojcZBEnm8BACKbj0ng5JxvqznX3pZCBUGLOwKeFvbTXsxFthVPuPrjJtWuStMw8a33ZCJCLvrt6gIYgk3VjKZC9vyvjZAQIGYZCZAJVptqXI1kuZC7pGArwTO6frDv4uhPVXUEfZBx8iIZAcNlWXoCkx2f6XTpXeXDevmbzSaiOmZA5dLWuBuCmm7NLQRSHZAtZB7brYmy5ZCzU4SZBBEvp5aSE4")
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
