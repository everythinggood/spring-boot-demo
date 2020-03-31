package com.learning.springboot.nacos;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.context.annotation.Configuration;

@Configuration
@NacosConfigurationProperties(dataId = "springboot2-nacos-config",autoRefreshed =true)
public class NacosConfig {

    @NacosValue(value = "${nacos.test.propertie:123}", autoRefreshed = true)
    private String testProperties;


    public String getTestProperties(){
        return this.testProperties;
    }
}
