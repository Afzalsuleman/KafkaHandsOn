package zayn.code.springboot_kafka_tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zayn.code.springboot_kafka_tutorial.Kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    @GetMapping("/Publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
      kafkaProducer.sendMessage(message);
      return ResponseEntity.ok("message sent sucessfull");
    }
}
