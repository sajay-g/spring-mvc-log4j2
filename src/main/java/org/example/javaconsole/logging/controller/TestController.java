package org.example.javaconsole.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestController
{
    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    @GetMapping(value = "/health")
    public String health()
    {
	log.info("****************health**************");
	return "Application is UP!!!"+ LocalDateTime.now().toString();
    }
}
