package org.romit.learning.cloud.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limites")
public class Configuration {
    private int minimum;
    private int maximum;
}
