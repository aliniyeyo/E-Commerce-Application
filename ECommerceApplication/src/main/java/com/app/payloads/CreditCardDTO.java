package com.app.payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCardDTO {
    private String cardNo;
    private String cvc;
}
