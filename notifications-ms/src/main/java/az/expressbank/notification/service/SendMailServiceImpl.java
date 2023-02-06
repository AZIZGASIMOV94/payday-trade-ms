package az.expressbank.notification.service;


import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
@RequiredArgsConstructor
public class SendMailServiceImpl implements SendMailServiceInter {

    @Value("${spring.mail.username}")
    private String hostMail;

    private final JavaMailSender javaMailSender;

    @Override
    @SneakyThrows
    public void send(String sendTo, String subject, String htmlBody) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setFrom(hostMail);
        helper.setTo(sendTo);
        helper.setSubject(subject);
        helper.setText(htmlBody, true);
        javaMailSender.send(message);
    }
}
