import FoodHub.IFoodPreparationHub;
import FoodHub.Restaurant;
import Location.GeoLocation;
import Location.ILocationService;
import OrderP.OrderDetails;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testOrderCreation() {
        IFoodPreparationHub restaurant = new Restaurant("Restaurant A", new GeoLocation(12.935, 77.612), 10);
        ILocationService consumerLocation = new GeoLocation(12.937, 77.618);

        OrderDetails order = new OrderDetails(restaurant, consumerLocation);

        assertEquals(restaurant, order.getRestaurant());
        assertEquals(consumerLocation, order.getConsumerLocation());
    }
}
