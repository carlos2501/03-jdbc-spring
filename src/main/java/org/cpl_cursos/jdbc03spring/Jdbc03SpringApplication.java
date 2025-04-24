package org.cpl_cursos.jdbc03spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class Jdbc03SpringApplication {

    private static final Logger log = LoggerFactory.getLogger(Jdbc03SpringApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext contexto = SpringApplication.run(Jdbc03SpringApplication.class, args);
        DataSource ds = contexto.getBean(DataSource.class);
        log.info("Implementación de DataSource -> {}", ds.getClass().getSimpleName());
    }

}
