package io.github.azizgasimov94.payday.notification.service;

public interface SendMailServiceInter {
    void send(String sendTo, String subject, String htmlBody);
}
