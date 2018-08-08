package com.twilio.twiliosample.controller;

import com.twilio.twiliosample.constants.Resources;
import com.twilio.twiliosample.dto.SmsMessage;
import com.twilio.twiliosample.service.SmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping(Resources.SMS)
public class SmsController {

  private final SmsSender smsSender;

  @Autowired
  public SmsController(SmsSender smsSender) {
    this.smsSender = smsSender;
  }

  @PostMapping
  public void sendSms(@RequestBody SmsMessage sms) {
    smsSender.send(sms.getMessage());
  }

}



