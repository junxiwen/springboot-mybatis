package com.hyanzz.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/11.
 */
@Slf4j
@Component
@Data
public class MyConfigs {
    @Value("${custom.configs.config}")
    private String configPath;

    private static Map<String, Object> configsMap = null;

    public Map<String, Object> getProperties() {
        try {
            if (MyConfigs.configsMap == null) {
                //读入文件
                MyConfigs.configsMap = new Yaml().loadAs(new FileInputStream(ResourceUtils.getFile(configPath)), Map.class);
            }
            return MyConfigs.configsMap;
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getAge() {
        try {
            return Integer.parseInt(getProperties().get("age").toString());
        } catch (Exception e) {
            log.error("load age error", e);
            return 15;
        }
    }

}
