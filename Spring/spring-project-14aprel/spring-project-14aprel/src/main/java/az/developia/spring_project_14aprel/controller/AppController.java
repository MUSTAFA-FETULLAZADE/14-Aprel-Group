package az.developia.spring_project_14aprel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.entity.AppConfig;

@RestController
public class AppController {

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/info")
    public String getAppInfo() {
        return "Tətbiqin adı: " + appConfig.getName() + ", Versiyası: " + appConfig.getVersion();
    }
}