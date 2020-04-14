package com.rest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

@Data
@ConfigurationProperties
@Repository
public class Properties {
    private CountryData countries;
}
