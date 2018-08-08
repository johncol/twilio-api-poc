package com.twilio.twiliosample.service;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import com.twilio.twiliosample.TwilioBaseTestClass;
import java.time.LocalDateTime;
import org.junit.Test;

public class SmsSenderTest extends TwilioBaseTestClass {

  @Test
  public void shouldSendSmsAndGetNonNullSmsId() {
    SmsSender sender = new SmsSender();

    String smsId = sender.send("Hello from my 'unit' test on " + LocalDateTime.now());

    assertThat(smsId, is(not(nullValue())));
  }

}
