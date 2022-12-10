package aviation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

/**
 * Represents a route.
 */
@Builder
@Value
@With
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Route {

    /**
     * destination (city) of the route (unique key)
     */
    @EqualsAndHashCode.Include
    String destination;
    /**
     * country of the destination
     */
    String country;
    /**
     * duration of the flights
     */
    int duration;
    /**
     * operator of the route
     */
    Airline operator;
    /**
     * flights of the route
     */
    List<Flight> flights;

    /**
     * Represents a flight.
     */
    @Builder
    @Value
    @With
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
    public static class Flight {
        /**
         * number of the flight (unique key)
         */
        String number;
        /**
         * registration of the flight's aircraft
         */
        String registration;
        /**
         * delay of the flight
         */
        int delay;
    }

    /**
     * Represents airlines.
     */
    public enum Airline {

        /**
         * Represents theme City.
         */
        @JsonProperty("Lufthansa") DLH,

        /**
         * Represents theme Harry Potter.
         */
        @JsonProperty("Wizz Air") WZZ,

        /**
         * Represents theme Star Wars.
         */
        @JsonProperty("Ryanair") RYR,

        /**
         * Represents theme Creator Expert.
         */
        @JsonProperty("KLM") KLM
    }
}
