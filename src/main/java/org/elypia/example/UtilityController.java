package org.elypia.example;

import org.elypia.commandler.api.Controller;

import java.util.stream.IntStream;

public class UtilityController implements Controller {

    /**
     * @return The text "pong!".
     */
    public String ping() {
        return "pong!";
    }

    /**
     * @param numbers An array of numbers to sum.
     * @return All of the numbers summed together.
     */
    public int sum(int[] numbers) {
        return IntStream.of(numbers).sum();
    }
}
