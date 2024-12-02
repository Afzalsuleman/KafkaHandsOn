package zayn.code.springboot_kafka_tutorial.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafakConsumer {
    public static final Logger log= LoggerFactory.getLogger(KafkaProducer.class);
    @KafkaListener(topics = "firsttopic",groupId = "myGroup")
    public void  consume(String message){
            log.info("message recieved ->"+message);
    }
}
