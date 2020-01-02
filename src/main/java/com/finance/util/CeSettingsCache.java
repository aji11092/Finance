package com.finance.util;


import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CeSettingsCache {
    private ConcurrentHashMap<String, HashMap<String, String>> groupSettings = new ConcurrentHashMap<>();

    @Cacheable(value = "ceSettings", key = "#groupName", unless = "#result == null")

    public Map<String, String> getCeSettings(String groupName) {
        return groupSettings.get(groupName);
    }

    @CachePut(value = "ceSettings", key = "#groupName")
    public Map<String, String> saveCeSettings(String groupName, HashMap<String, String> settings) {
        groupSettings.put(groupName, settings);
        return settings;
    }


    @CacheEvict(value = "ceSettings", key = "#groupName")
    public void deleteCeSettings(String groupName) {
        groupSettings.remove(groupName);
    }

}