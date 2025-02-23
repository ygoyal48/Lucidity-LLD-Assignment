package Route;

import Location.ILocationService;
import OrderP.OrderDetails;

public interface IRouteOptimizer {
    void findOptimalRoute(OrderDetails order1, OrderDetails order2);
    double travelTime(ILocationService from, ILocationService to);
}