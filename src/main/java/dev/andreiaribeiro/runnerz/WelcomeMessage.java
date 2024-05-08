package dev.andreiaribeiro.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcome() {
        return "Welcome";
    }
}
