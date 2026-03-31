public class Lasagna {
    int cookingTimeInMinutes = 40;
    int adjustedCookingTime;
    int prepTime;
    int totalTime;
    
    public int expectedMinutesInOven(){
        return cookingTimeInMinutes;
    }

    public int remainingMinutesInOven(int timeInOven){
        adjustedCookingTime = (expectedMinutesInOven() - timeInOven);
        return adjustedCookingTime;
    }

    public int preparationTimeInMinutes(int nbrOfLayers){
        prepTime = (nbrOfLayers * 2);
        return prepTime;
    }

    public int totalTimeInMinutes(int prepTime, int adjustedTime){
        totalTime = (preparationTimeInMinutes(prepTime) + adjustedTime);
        return totalTime;
    }
    
}
