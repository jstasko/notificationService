package sk.stasko.notificationService.mail;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MailRepository extends MongoRepository<MailDto, String> {
}
