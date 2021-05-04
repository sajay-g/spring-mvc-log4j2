package org.example.javaconsole.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Instant;


@Configuration
@EnableScheduling
public class TestSchedular
{

    private static final Logger logger = LoggerFactory.getLogger(TestSchedular.class);
    @Scheduled(fixedDelay = 10 * 1000)
    public void scheduleFixedDelayTask() {
	logger.info("Running for log Check "+ Instant.now().toString());

    }
}
