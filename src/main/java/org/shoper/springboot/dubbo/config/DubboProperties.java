package org.shoper.springboot.dubbo.config;

import com.alibaba.dubbo.config.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.dubbo")
public class DubboProperties {

    private String            scan;
    @NestedConfigurationProperty
    private ApplicationConfig application;
    @NestedConfigurationProperty
    private RegistryConfig    registry;
    @NestedConfigurationProperty
    private ProtocolConfig    protocol;
    @NestedConfigurationProperty
    private ConsumerConfig consumerConfig;
    @NestedConfigurationProperty
    private MonitorConfig monitorConfig;
    @NestedConfigurationProperty
    private ProviderConfig providerConfig;
    @NestedConfigurationProperty
    private ModuleConfig moduleConfig;

    public String getScan() {
        return scan;
    }

    public ApplicationConfig getApplication() {
        return application;
    }

    public void setApplication(ApplicationConfig application) {
        this.application = application;
    }

    public RegistryConfig getRegistry() {
        return registry;
    }

    public void setRegistry(RegistryConfig registry) {
        this.registry = registry;
    }

    public ProtocolConfig getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolConfig protocol) {
        this.protocol = protocol;
    }

    public void setScan(String scan) {
        this.scan = scan;
    }

    public ConsumerConfig getConsumerConfig() {
        return consumerConfig;
    }

    public void setConsumerConfig(ConsumerConfig consumerConfig) {
        this.consumerConfig = consumerConfig;
    }

    public ModuleConfig getModuleConfig() {
        return moduleConfig;
    }

    public void setModuleConfig(ModuleConfig moduleConfig) {
        this.moduleConfig = moduleConfig;
    }

    public ProviderConfig getProviderConfig() {
        return providerConfig;
    }

    public void setProviderConfig(ProviderConfig providerConfig) {
        this.providerConfig = providerConfig;
    }

    public MonitorConfig getMonitorConfig() {
        return monitorConfig;
    }

    public void setMonitorConfig(MonitorConfig monitorConfig) {
        this.monitorConfig = monitorConfig;
    }
}