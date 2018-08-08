package com.twilio.twiliosample.service;

import com.twilio.rest.api.v2010.account.Call;
import com.twilio.twiliosample.constants.Phones;
import java.net.URI;
import java.net.URISyntaxException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PhoneCaller {

  public String call() throws URISyntaxException {
    Call call = Call
        .creator(Phones.TO, Phones.FROM, new URI("http://demo.twilio.com/docs/voice.xml"))
        .create();

    log.info("ID " + call.getSid());

    return call.getSid();
  }

}
