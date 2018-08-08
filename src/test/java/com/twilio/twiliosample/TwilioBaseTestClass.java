package com.twilio.twiliosample;

import com.twilio.twiliosample.config.TwilioConfig;
import org.junit.Before;

public class TwilioBaseTestClass {

  @Before
  public void setup() throws Exception {
    new TwilioConfig().twilioInit().run(null);
  }

}
