package com.elypia.example;

import com.elypia.commandler.api.Controller;

public class UtilityController implements Controller {

    public String ping() {
        return "pong!";
    }
}
