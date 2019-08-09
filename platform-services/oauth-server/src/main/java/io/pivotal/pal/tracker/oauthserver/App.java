package io.pivotal.pal.tracker.oauthserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class App extends AuthorizationServerConfigurerAdapter {

    public static void main(String[] args) {
        run(App.class, args);
    }
}