package com.twilio.twiliosample.dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SmsMessage implements Serializable {

  private static final long serialVersionUID = -6715298015059159087L;

  @NotNull
  private String message;

}
