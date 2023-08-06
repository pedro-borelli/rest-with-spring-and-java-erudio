package com.restwithspringbootandjavaerudio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController  // agrega response body e controller para facilitar a construção de REST
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting") // ele vai mapear uma requisição para um método e tornar isso um endereço HTTP
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")
                             String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }



}
