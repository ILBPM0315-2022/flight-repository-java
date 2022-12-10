package aviation;

import aviation.model.Route;
import common.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution implements Exercises {
    @Override
    public int getMinimumOfDuration(List<Route> routes) {
        return 0; // TODO
    }

    @Override
    public Set<String> getDestinationsByOperator(List<Route> routes, Route.Airline airline) {
        return null; // TODO
    }

    @Override
    public List<Route> getRoutesOrderByDurationDescThenByCountry(List<Route> routes) {
        return null; // TODO
    }

    @Override
    public Map<String, String> getDestinationsByCountries(List<Route> routes) {
        return null; // TODO
    }

    @Override
    public Map<Route.Airline, Set<Route>> getRoutesByOperators(List<Route> routes) {
        return null; // TODO
    }

    @Override
    public Map<Route.Airline, Map<String, Route>> getRoutesByOperatorsAndDestinations(List<Route> routes) {
        return null; // TODO
    }

    public static void main(String[] args) {
        Repository<Route> repository = new Repository<>(Route.class, "routes.json");
        repository.getAll().forEach(System.out::println);
    }
}
