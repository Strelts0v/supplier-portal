package com.nivo1.supplier.portal.common.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories(
        entityManagerFactoryRef = "simpleEntityManagerFactory",
        basePackages = {"com.nivo1.supplier.portal.common.api.dao.common"})
public class SimplePersistenceConfig {

    @Autowired
    private Environment env;

    private DataSource getDataSource() {
        return DataSourceBuilder.create()
                .url(env.getProperty("spring.datasource.url") + "supplierportal")
                .password(env.getProperty("spring.datasource.password"))
                .username(env.getProperty("spring.datasource.username"))
                .driverClassName(env.getProperty("spring.datasource.driver-class-name"))
                .build();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean simpleEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();

        em.setDataSource(getDataSource());
        em.setPackagesToScan("com.nivo1.supplier.portal.common.api");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        Map<String, Object> jpaProperties = new HashMap<>();
        em.setJpaPropertyMap(jpaProperties);

        return em;
    }

}
