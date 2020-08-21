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

package org.elypia.example.prefix;

import org.elypia.commandler.api.Controller;

/**
 * The utility controller, this controller contains multiple commands
 * which are created per method and defined in the application.yml file.
 *
 * @author seth@elypia.org (Seth Falco)
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
}
