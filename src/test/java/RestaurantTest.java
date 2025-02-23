import FoodHub.IFoodPreparationHub;
import FoodHub.Restaurant;
import Location.GeoLocation;
import Location.ILocationService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void testRestaurantCreation() {
        ILocationService location = new GeoLocation(12.935, 77.612);
        IFoodPreparationHub restaurant = new Restaurant("Test Restaurant", location, 10);

        assertEquals("Test Restaurant", restaurant.getName());
        assertEquals(10, restaurant.getPreparationTime());
    }
}
