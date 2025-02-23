import Distance.HaversineCalculator;
import Location.GeoLocation;
import Location.ILocationService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HaversineCalculatorTest {

    @Test
    void testCalculateDistance() {
        ILocationService loc1 = new GeoLocation(12.934, 77.610);
        ILocationService loc2 = new GeoLocation(12.935, 77.612);

        double distance = HaversineCalculator.getInstance().calculateDistance(loc1, loc2);
        assertTrue(distance > 0, "Distance should be greater than 0");
    }
}
