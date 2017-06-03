package no.fint.provider.health;

import java.util.Arrays;
import java.util.List;

/**
 * Add the actions the adapter should support.
 */
public enum Action {
    ;

    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(Action.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }
}