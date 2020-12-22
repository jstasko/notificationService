package sk.stasko.notificationService.mail;

import javax.mail.MessagingException;

public interface MailService {
    Mail sendMail(Mail mail) throws MessagingException;
}
