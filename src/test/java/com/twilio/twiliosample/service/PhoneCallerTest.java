package com.twilio.twiliosample.service;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import com.twilio.twiliosample.TwilioBaseTestClass;
import java.net.URISyntaxException;
import org.junit.Test;

public class PhoneCallerTest extends TwilioBaseTestClass {

  @Test
  public void shouldPerformCallAndGetNonNullCallId() throws URISyntaxException {
    PhoneCaller phoneCaller = new PhoneCaller();

    String callId = phoneCaller.call();

    assertThat(callId, is(not(nullValue())));
  }

}
