package com.example.web.configuration;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClients({
        @RibbonClient(name = "${service.user.name:user}", configuration = UserRibbonConfiguration.class)
})
public class RibbonConfiguration {
}
