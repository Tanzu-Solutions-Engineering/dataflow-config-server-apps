package io.pivotal.corelogic.stream.time.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(org.springframework.cloud.stream.app.time.source.TimeSourceConfiguration.class)
public class ClTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClTimeApplication.class, args);
    }
}
