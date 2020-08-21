/*
 * Copyright 2019-2020 Elypia CIC and Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elypia.example.javaxvalidation;

import org.elypia.commandler.api.Controller;
import org.slf4j.*;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.constraints.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This is a quick mock up of a hotter colder game controller.
 * This isn't made with multiple sessions in mind, it's just for
 * our quick little console application.
 *
 * @author seth@elypia.org (Seth Falco)
 */
@ApplicationScoped
public class HotColdController implements Controller {

    private Logger logger = LoggerFactory.getLogger(HotColdController.class);

    private static final int MAX_VALUE = 100;
    private static final int NO_GAME = -1;

    /**
     * The current value the player must guess, or {@link #NO_GAME}
     * if no game session is currently active.
     */
    private int value;

    /** The distance between the users previous guess and the {@link #value}. */
    private int previousDistance;

    /**
     * Instantiate the controller and initialize
     * the {@link #value} with {@link #NO_GAME} to indicate no game is in progress.
     */
    public HotColdController() {
        value = NO_GAME;
        previousDistance = NO_GAME;
    }

    public String start() {
        if (value != NO_GAME)
            return "A game is already in progress, finish it up to start another.";

        value = ThreadLocalRandom.current().nextInt(MAX_VALUE) + 1;
        logger.debug("Generated the value {} for the user to guess.", value);
        return "I've thought of a number, care to take a guess?";
    }

    /**
     * This is a normal command like any other, but before the command
     * is executed we'll cross-check the parameters provided by the user
     * against the validation mapping configured for javax.validation.
     *
     * @param guess The players guess.
     * @return The message to respond back.
     */
    public String guess(@Min(1) @Max(MAX_VALUE) int guess) {
        if (value == NO_GAME)
            return "A game hasn't been started yet, start one first.";

        int distance = Math.abs(value - guess);

        if (previousDistance == NO_GAME) {
            previousDistance = distance;
            logger.debug("Previous distance is now set to {}.", previousDistance);
            return "You've made your first guess, I'll tell you if you're hotter or colder for now on!";
        }

        if (distance == 0) {
            value = previousDistance = NO_GAME;
            return "You win!";
        }

        if (distance < previousDistance) {
            previousDistance = distance;
            return "You're getting warmer.";
        } else if (distance > previousDistance) {
            previousDistance = distance;
            return "You're getting colder.";
        }

        return "It's around the same temperature.";
    }
}
