import Location.GeoLocation;
import Location.ILocationService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeoLocationTest {

    @Test
    void testDistanceTo() {
        ILocationService loc1 = new GeoLocation(12.934, 77.610);
        ILocationService loc2 = new GeoLocation(12.935, 77.612);

        double distance = loc1.distanceTo(loc2);
        assertTrue(distance > 0, "Distance should be positive");
    }
}
