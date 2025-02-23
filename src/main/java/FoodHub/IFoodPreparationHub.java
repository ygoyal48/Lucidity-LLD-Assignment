package FoodHub;

import Location.ILocationService;

/**
 * We can have multiple Food Preparation Hubs in the future.
 * Like Restaurants, we might have Home Kitchens,
 * Cloud Kitchens etc.
 */

public interface IFoodPreparationHub {
    String getName();
    ILocationService getLocation();
    double getPreparationTime();
}
