package com.twilio.twiliosample.config;

import com.twilio.Twilio;
import com.twilio.twiliosample.constants.Keys;
import com.twilio.twiliosample.service.PhoneCaller;
import com.twilio.twiliosample.service.SmsSender;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioConfig {

  @Bean
  public ApplicationRunner twilioInit() {
    return args -> Twilio.init(Keys.ACCOUNT_SID, Keys.AUTH_TOKEN);
  }

  @Bean
  public SmsSender smsSender() {
    return new SmsSender();
  }

  @Bean
  public PhoneCaller phoneCaller() {
    return new PhoneCaller();
  }

}
