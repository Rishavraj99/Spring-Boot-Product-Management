package com.productmanagement.services.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class MailRequestBody {

    private String to;
    private String subject;
    private String body;
}
