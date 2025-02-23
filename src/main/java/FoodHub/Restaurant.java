package FoodHub;
import Location.ILocationService;
import lombok.Getter;

@Getter
public class Restaurant implements IFoodPreparationHub{
   private final String name;
   private final ILocationService location;
   private final double preparationTime; // in minutes

    public Restaurant(String name, ILocationService location, double preparationTime) {
        this.name = name;
        this.location = location;
        this.preparationTime = preparationTime;
    }
}