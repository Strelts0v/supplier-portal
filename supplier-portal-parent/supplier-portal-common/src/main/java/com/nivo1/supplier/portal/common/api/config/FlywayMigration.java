package com.nivo1.supplier.portal.common.api.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Migrate sql scripts before application run.
 */
@Order(1)
@Component
public class FlywayMigration implements ApplicationRunner {

    @Value("${flyway.url}")
    private String dataBaseUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${flyway.schemas}")
    private String schemas;

    @Value("${flyway.locations}")
    private String locations;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        Flyway flyway = new Flyway();
        flyway.setLocations(locations);
        flyway.setDataSource(dataBaseUrl, username, password);
        flyway.setSchemas(schemas);
        flyway.migrate();
    }

}