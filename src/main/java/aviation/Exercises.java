package aviation;

import aviation.model.Route;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Defines exercises.
 */
public interface Exercises {

    /**
     * Returns the least (minimum) value of duration.
     *
     * @param routes the list of routes
     * @return the minimum of duration
     */
    int getMinimumOfDuration(
            List<Route> routes);


    /**
     * Returns the destination of each flight that is operated by the given airline.
     *
     * @param routes  the list of routes
     * @param airline the airline
     * @return the destinations
     */
    Set<String> getDestinationsByOperator(
            List<Route> routes,
            Route.Airline airline);

    /**
     * Returns the list of routes ordered by:
     *
     * <ol>
     *     <li>the length of duration (descending)
     *     <li>the country of destination (ascending)
     * </ol>
     *
     * @param routes the list of routes
     * @return the sorted list of routes
     */
    List<Route> getRoutesOrderByDurationDescThenByCountry(
            List<Route> routes);

    /**
     * Returns a dictionary that maps each destination to its country.
     *
     * @param routes the list of routes
     * @return the dictionary
     */
    Map<String, String> getDestinationsByCountries(
            List<Route> routes);

    /**
     * Returns a dictionary that groups the routes by their operators.
     *
     * @param routes the list of routes
     * @return the dictionary
     */
    Map<Route.Airline, Set<Route>> getRoutesByOperators(
            List<Route> routes);

    /**
     * Returns a dictionary that groups the routes by their operators, then maps their destinations to them..
     *
     * @param routes the list of routes
     * @return the dictionary
     */
    Map<Route.Airline, Map<String, Route>> getRoutesByOperatorsAndDestinations(
            List<Route> routes);
}
