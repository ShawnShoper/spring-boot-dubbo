package org.shoper.springboot.dubbo.config;

import com.alibaba.dubbo.config.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

///**
// * Created by ShawnShoper on 16/7/8.
// */
@Configuration
@EnableConfigurationProperties(org.shoper.springboot.dubbo.config.DubboProperties.class)
public class DubboConfig {

    @Autowired
    private org.shoper.springboot.dubbo.config.DubboProperties dubboProperties;

    @Bean
    @ConditionalOnMissingBean
    public ApplicationConfig requestApplicationConfig() {
        ApplicationConfig application = dubboProperties.getApplication();
        return Objects.isNull(application) ? new ApplicationConfig() : application;
    }

    @Bean
    @ConditionalOnMissingBean
    public RegistryConfig requestRegistryConfig() {
        RegistryConfig registry = dubboProperties.getRegistry();
        return Objects.isNull(registry) ? new RegistryConfig() : registry;
    }

    @Bean
    @ConditionalOnMissingBean
    public ProtocolConfig requestProtocolConfig() {
        ProtocolConfig protocol = dubboProperties.getProtocol();
        return Objects.isNull(protocol) ? new ProtocolConfig() : protocol;
    }

    @Bean
    @ConditionalOnMissingBean
    public ConsumerConfig requestConsumerConfig() {
        ConsumerConfig consumerConfig = dubboProperties.getConsumerConfig();
        return Objects.isNull(consumerConfig) ? new ConsumerConfig() : consumerConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public ProviderConfig requestProviderConfig() {
        ProviderConfig protocolConfig = dubboProperties.getProviderConfig();
        return Objects.isNull(protocolConfig) ? new ProviderConfig() : protocolConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public MonitorConfig monitorConfig() {
        MonitorConfig monitorConfig = dubboProperties.getMonitorConfig();
        return Objects.isNull(monitorConfig) ? new MonitorConfig() : monitorConfig;
    }

}
