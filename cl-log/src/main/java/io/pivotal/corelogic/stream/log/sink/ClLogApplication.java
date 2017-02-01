package io.pivotal.corelogic.stream.log.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(org.springframework.cloud.stream.app.log.sink.LogSinkConfiguration.class)
public class ClLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClLogApplication.class, args);
    }
}
