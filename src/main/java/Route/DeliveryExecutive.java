package Route;

import FoodHub.IFoodPreparationHub;
import Location.ILocationService;
import OrderP.OrderDetails;

import java.util.List;
import java.util.ArrayList;

/**
 * DeliveryExecutive optimizes the time of travel between two restaurants
 * and their respective orders. It finds the optimal delivery route.
 */
public class DeliveryExecutive implements IRouteOptimizer {
    private final ILocationService currentLocation;
    private static final double AVERAGE_SPEED_KMPH = 20.0;
    private static final int MINUTES_PER_HOUR = 60;
    private static final String ROUTE_FORMAT = "Start → %s → %s → Consumer1 → Consumer2";

    public DeliveryExecutive(ILocationService currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public double travelTime(ILocationService from, ILocationService to) {
        double distance = from.distanceTo(to);
        return (distance / AVERAGE_SPEED_KMPH) * MINUTES_PER_HOUR;
    }

    @Override
    public void findOptimalRoute(OrderDetails order1, OrderDetails order2) {
        IFoodPreparationHub restaurant1 = order1.getRestaurant();
        IFoodPreparationHub restaurant2 = order2.getRestaurant();

        ILocationService consumer1 = order1.getConsumerLocation();
        ILocationService consumer2 = order2.getConsumerLocation();

        List<String> routeOptions = new ArrayList<>();
        double timeFirstRoute = calculateTotalTime(currentLocation, restaurant1, restaurant2, consumer1, consumer2, routeOptions);
        double timeSecondRoute = calculateTotalTime(currentLocation, restaurant2, restaurant1, consumer2, consumer1, routeOptions);

        if (timeFirstRoute < timeSecondRoute) {
            printOptimalRoute(routeOptions.get(0), timeFirstRoute);
        } else {
            printOptimalRoute(routeOptions.get(1), timeSecondRoute);
        }
    }

    private double calculateTotalTime(ILocationService start, IFoodPreparationHub firstRestaurant, IFoodPreparationHub secondRestaurant, ILocationService firstConsumer, ILocationService secondConsumer, List<String> routeOptions) {
        double travelToFirstRestaurant = travelTime(start, firstRestaurant.getLocation());
        double travelBetweenRestaurants = travelTime(firstRestaurant.getLocation(), secondRestaurant.getLocation());
        double travelToFirstConsumer = travelTime(secondRestaurant.getLocation(), firstConsumer);
        double travelToSecondConsumer = travelTime(firstConsumer, secondConsumer);

        double totalTime = travelToFirstRestaurant
                + Math.max(firstRestaurant.getPreparationTime(), travelBetweenRestaurants)
                + travelBetweenRestaurants
                + Math.max(secondRestaurant.getPreparationTime(), travelToFirstConsumer)
                + travelToFirstConsumer
                + travelToSecondConsumer;

        routeOptions.add(formatRoute(firstRestaurant, secondRestaurant, firstConsumer, secondConsumer));
        return totalTime;
    }

    private String formatRoute(IFoodPreparationHub firstRestaurant, IFoodPreparationHub secondRestaurant, ILocationService firstConsumer, ILocationService secondConsumer) {
        return String.format(ROUTE_FORMAT, firstRestaurant.getName(), secondRestaurant.getName());
    }

    private void printOptimalRoute(String route, double time) {
        System.out.println("Optimal Route: " + route);
        System.out.println("Total Time: " + time + " minutes");
    }
}