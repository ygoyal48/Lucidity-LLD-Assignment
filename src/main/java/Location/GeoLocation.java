package Location;
import Distance.HaversineCalculator;
import lombok.Getter;

@Getter
public class GeoLocation implements ILocationService{
    private final double latitude;
    private final double longitude;

    public GeoLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public double distanceTo(ILocationService other) {
        return HaversineCalculator.getInstance().calculateDistance(this, other);
    }
}