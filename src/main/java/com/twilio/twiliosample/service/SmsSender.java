package com.twilio.twiliosample.service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiliosample.constants.Phones;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsSender {

  public String send(String sms) {
    Message message = Message
        .creator(Phones.TO, Phones.FROM, sms)
        .create();

    log.info("ID " + message.getSid());

    return message.getSid();
  }
}
