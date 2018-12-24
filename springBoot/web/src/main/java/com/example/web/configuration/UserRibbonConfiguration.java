package com.example.web.configuration;


import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;

public class UserRibbonConfiguration {
    @Value("${services.user.host:localhost:8010}")
    private String userServer;

    @Bean
    public ServerList<Server> serverList() {
        return new StaticServerList<>(new Server(userServer));
    }
}
