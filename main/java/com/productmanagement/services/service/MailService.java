package com.productmanagement.services.service;

import com.solruf.services.model.MailRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender sender;

    public void sendMail(final MailRequestBody request) {
        final var message = new SimpleMailMessage();
        message.setFrom("support@xyz.com");
        message.setTo(request.getTo());
        message.setSubject(request.getSubject());
        message.setText(request.getBody());
        sender.send(message);
    }
}
