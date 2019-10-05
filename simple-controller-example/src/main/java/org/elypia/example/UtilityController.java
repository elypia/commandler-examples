/*
 * Copyright 2019-2019 Elypia CIC
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

package org.elypia.example;

import org.elypia.commandler.api.Controller;

import java.util.stream.IntStream;

/**
 * The utility controller, this controller contains multiple commands
 * which are created per method and defined in the application.yml file.
 *
 * @author seth@elypia.org (Syed Seth)
 */
public class UtilityController implements Controller {

    /**
     * Creates a static command, just a basic input/output command.
     *
     * @return The text "pong!".
     */
    public String ping() {
        return "pong!";
    }

    /**
     * Utilizes Commandler lists, a list is a single parameter which
     * is comma seperated rather than space seperated.
     *
     * @param numbers An array of numbers to sum.
     * @return All of the numbers summed together.
     */
    public int sum(int[] numbers) {
        return IntStream.of(numbers).sum();
    }
}
