import FoodHub.Restaurant;
import Location.GeoLocation;
import Location.ILocationService;
import OrderP.OrderDetails;
import Route.DeliveryExecutive;
import Route.IRouteOptimizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryExecutiveTest {

    private static final ILocationService START_LOCATION = new GeoLocation(12.934, 77.610);
    private static final ILocationService END_LOCATION = new GeoLocation(12.935, 77.612);
    private static final ILocationService RESTAURANT_A_LOCATION = new GeoLocation(12.935, 77.612);
    private static final ILocationService RESTAURANT_B_LOCATION = new GeoLocation(12.936, 77.615);
    private static final ILocationService CUSTOMER_1_LOCATION = new GeoLocation(12.937, 77.618);
    private static final ILocationService CUSTOMER_2_LOCATION = new GeoLocation(12.940, 77.622);
    private static final String RESTAURANT_A_NAME = "Restaurant A";
    private static final String RESTAURANT_B_NAME = "Restaurant B";
    private static final int RESTAURANT_A_PREP_TIME = 10;
    private static final int RESTAURANT_B_PREP_TIME = 15;

    @Test
    void testTravelTime() {
        IRouteOptimizer deliveryExecutive = new DeliveryExecutive(START_LOCATION);
        double time = deliveryExecutive.travelTime(START_LOCATION, END_LOCATION);
        assertTrue(time > 0, "Travel time should be positive");
    }

    @Test
    void testFindOptimalRoute() {
        IRouteOptimizer deliveryExecutive = new DeliveryExecutive(START_LOCATION);

        Restaurant restaurantA = new Restaurant(RESTAURANT_A_NAME, RESTAURANT_A_LOCATION, RESTAURANT_A_PREP_TIME);
        Restaurant restaurantB = new Restaurant(RESTAURANT_B_NAME, RESTAURANT_B_LOCATION, RESTAURANT_B_PREP_TIME);

        OrderDetails order1 = new OrderDetails(restaurantA, CUSTOMER_1_LOCATION);
        OrderDetails order2 = new OrderDetails(restaurantB, CUSTOMER_2_LOCATION);

        deliveryExecutive.findOptimalRoute(order1, order2);
    }
}