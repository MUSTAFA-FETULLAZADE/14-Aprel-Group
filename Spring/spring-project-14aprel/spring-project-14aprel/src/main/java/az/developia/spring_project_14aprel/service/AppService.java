package az.developia.spring_project_14aprel.service;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private int appVersion;

    @Value("${app.active}")
    private boolean isAppActive;

 
    @PostConstruct
    public void displayAppProperties() {
        System.out.println("--- Application Properties ---");
        System.out.println("Tətbiqin adı: " + appName);
        System.out.println("Versiyası: " + appVersion);
        System.out.println("Aktivdir: " + isAppActive);
        System.out.println("-------------------------------");
    }
}