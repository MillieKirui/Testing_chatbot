package com.example.saidabot.Services;

import com.example.saidabot.Model.NotificationPayload.Payload;
import com.example.saidabot.Model.ResponseMessage.Language;
import com.example.saidabot.Model.ResponseMessage.Reply;
import com.example.saidabot.Model.ResponseMessage.Text;
import com.google.gson.Gson;
import okhttp3.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ResponseMessage {

    public ResponseEntity<Payload> send_response(String from) throws IOException {

        Language language = new Language();
        language.setCode("en_us");

        Text text = new Text();
        text.setBody("Hi there I am Saida, what can I help you with?");

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
                .addHeader("Authorization", "Bearer EAAGojcZBEnm8BAFnsZBX4NKWyiFW6mGvhnzP9vbkNIXvZBh8zsK9SaOlqSxUWbJ1N85bl7P2vnr4uTCF7e2S8DshaLMdbCPMYrbPz0ZAURQoe9IN4vCu4B00c4cdh897MZBg0K4QwuRZBATt639D9Oltg9a79RMyfZAJhkZB8zwcV6uRZC1aRMYXSEN6Ay0Yj6xOox4shRaFSyM2eqhZC1IOid")
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
