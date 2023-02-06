package az.expressbank.notification.service;

public interface SendMailServiceInter {
    void send(String sendTo, String subject, String htmlBody);
}
