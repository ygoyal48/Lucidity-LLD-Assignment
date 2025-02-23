package OrderP;
import FoodHub.IFoodPreparationHub;
import Location.ILocationService;
import lombok.Getter;

@Getter
public class OrderDetails {
    private final IFoodPreparationHub restaurant;

    private final ILocationService consumerLocation;

    public OrderDetails(IFoodPreparationHub restaurant, ILocationService consumerLocation) {
        this.restaurant = restaurant;
        this.consumerLocation = consumerLocation;
    }
}