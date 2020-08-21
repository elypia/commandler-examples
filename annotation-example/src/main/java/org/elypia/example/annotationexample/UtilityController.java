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

package org.elypia.example.annotationexample;

import org.elypia.commandler.annotation.*;
import org.elypia.commandler.api.Controller;

import java.util.stream.IntStream;

/**
 * The utility controller, this controller contains multiple commands
 * which are created per method and defined via annotations.
 *
 * @author seth@elypia.org (Seth Falco)
 */
@ControllerData
@Aliases("utils")
@Help(name = "Utilities", description = "Random utilities to add some quick generic functionality.")
public class UtilityController implements Controller {

    /**
     * Creates a static command, just a basic input/output command.
     *
     * @return The text "pong!".
     */
    @Static
    @CommandData
    @Aliases("ping")
    @Help(name = "ping!", description = "Check if the application is still responsive.")
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
    @Static
    @CommandData
    @Aliases("sum")
    @Help(name = "Sum", description = "Add up a bunch of integer numbers.")
    public int sum(@Param @Help(name = "numbers", description = "All the numbers I should sum together.") int[] numbers) {
        return IntStream.of(numbers).sum();
    }
}
