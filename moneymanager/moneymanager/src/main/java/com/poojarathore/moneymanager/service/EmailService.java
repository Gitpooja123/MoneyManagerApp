package com.poojarathore.moneymanager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    //private final JavaMailSender mailSender;

   // @Value("${spring.mail.properties.mail.smtp.from}")
//    private String fromEmail;

   // public void sendEmail(String to, String subject , String body){
        //Implementation for sending email
        //This could use JavaMailSender to send the email
    //  try{
         // SimpleMailMessage message= new SimpleMailMessage();
        //  message.setFrom(fromEmail);
       //   message.setTo(to);
      //    message.setSubject(subject);
       //   message.setText(body);
       //   mailSender.send(message);
    //  }catch (Exception e) {
        //   throw new RuntimeException(e.getMessage());

    //  }

   // }
   private final BrevoEmailService brevoEmailService; // New Brevo service injected

    @Value("${spring.mail.properties.mail.smtp.from}")
    private String fromEmail;

    public void sendEmail(String to, String subject, String body) {
        try {
            // Now using Brevo REST API instead of JavaMailSender
            brevoEmailService.sendEmail(to, subject, body);
        } catch (Exception e) {
            throw new RuntimeException("Email sending failed: " + e.getMessage());
        }
    }


}
