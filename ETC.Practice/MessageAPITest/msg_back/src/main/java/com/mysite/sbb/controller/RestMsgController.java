package com.mysite.sbb.controller;


import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@PropertySource("classpath:apikey.properties")
@RestController
public class RestMsgController {

    final DefaultMessageService messageService;

    public RestMsgController(@Value("${coolSms.api.apikey}") String apiKey,  @Value("${coolSms.api.apikey2}") String apiKey2){
        this.messageService = NurigoApp.INSTANCE.initialize(apiKey, apiKey2, "https://api.coolsms.co.kr");
    }

    @PostMapping("/test")
    @ResponseBody
    public SingleMessageSentResponse test(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("text") String text) {
        System.out.println(from + to + text);
        return sendOne(from, to, text);
    }

    @PostMapping("/msg")
    public SingleMessageSentResponse sendOne(String from, String to, String text) {
        try {
            Message msg = new Message();
            msg.setFrom(from);
            msg.setTo(to);
            msg.setText(text);
            //msg.setText("메시지 API 전송 테스트를 합니다.");

            SingleMessageSentResponse response = this.messageService.sendOne(new SingleMessageSendingRequest(msg));
            System.out.println(response);
            return null;
        } catch (Exception e) {
            e.printStackTrace(); // 로그를 출력합니다.
            throw new RuntimeException("메시지 전송 중 오류가 발생했습니다.", e);
        }
    }
}
