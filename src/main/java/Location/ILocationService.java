/**
 * We can have any Location Service in future
 */
package Location;
public interface ILocationService {
    double getLatitude();
    double getLongitude();
    double distanceTo(ILocationService other);
}
