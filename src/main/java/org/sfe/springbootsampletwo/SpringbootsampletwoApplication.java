package org.sfe.springbootsampletwo;

import kotlin.collections.SetsKt;
import org.sfe.springbootsampletwo.model.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class SpringbootsampletwoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsampletwoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Account a = new Account("a", BigDecimal.ONE, LocalDateTime.now(), null, SetsKt.emptySet());
        Account b = new Account("a", BigDecimal.ONE, LocalDateTime.now(), null, SetsKt.emptySet());


    }
}
