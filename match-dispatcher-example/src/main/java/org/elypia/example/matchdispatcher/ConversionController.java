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

package org.elypia.example.matchdispatcher;

import org.elypia.commandler.api.Controller;
import org.elypia.commandler.dispatchers.MatchDispatcher;

import java.util.Objects;

/**
 * The converstion controller uses the {@link MatchDispatcher}
 * to find commands that succesfully match the regular expression
 * defined in command metadata.
 *
 * @author seth@elypia.org (Seth Falco)
 */
public class ConversionController implements Controller {

    /** The number of imperial pounds there are in a metric kilogram. */
    private static final float KG_TO_LBS = 2.20462F;

    /**
     * Convert weight between KGs and lbs.
     *
     * @return A string with the original measurement as it was interpretted
     * by Commandler, with the converstion.
     */
    public String convertWeight(int value, String units) {
        float convertedValue;
        String convertedUnits;

        if (units.equalsIgnoreCase("KG")) {
            convertedValue = value * KG_TO_LBS;
            convertedUnits = "Lbs";
        } else {
            convertedValue = value / KG_TO_LBS;
            convertedUnits = "KG";
        }

        Objects.requireNonNull()

        return value + units + " is equal to " + convertedValue + convertedUnits;
    }
}
