package Distance;

import Location.ILocationService;

/**
 * Creating HaversineCalculator Singleton to make sure that
 * only one instance exists throughout the application.
 * HaversineCalculator calculates the distance between two points
 * using the Haversine formula
 */

//Singleton
public class HaversineCalculator implements IDistanceCalculator {
    private static final double EARTH_RADIUS_KM = 6371;
    private static HaversineCalculator instance;
    private HaversineCalculator() {}

    //Singleton Class
    public static HaversineCalculator getInstance() {
        if (instance == null) {
            synchronized (HaversineCalculator.class) {
                if (instance == null) {
                    instance = new HaversineCalculator();
                }
            }
        }
        return instance;
    }

    @Override
    public double calculateDistance(ILocationService loc1, ILocationService loc2) {
        double lat1 = Math.toRadians(loc1.getLatitude());
        double lon1 = Math.toRadians(loc1.getLongitude());
        double lat2 = Math.toRadians(loc2.getLatitude());
        double lon2 = Math.toRadians(loc2.getLongitude());

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1) * Math.cos(lat2) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return EARTH_RADIUS_KM * c;
    }
}

