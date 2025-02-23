package Distance;

import Location.ILocationService;

/**
 * Currently, we are using Haversine Formula to
 * calculate distance, but in the future, it can be changed
 * to some other formula as well.
 */

public interface IDistanceCalculator {
    double calculateDistance(ILocationService loc1, ILocationService loc2);
}
