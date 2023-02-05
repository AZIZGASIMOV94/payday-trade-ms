package az.expressbank.notification.config.service;

public interface SendMailServiceInter {
    void send(String sendTo, String subject, String htmlBody);
}
