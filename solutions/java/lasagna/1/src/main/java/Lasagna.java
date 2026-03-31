public class Lasagna {
    int cookingTimeInMinutes = 40;
    int adjustedCookingTime;
    int prepTime;
    int totalTime;
    
    public int expectedMinutesInOven(){
        return cookingTimeInMinutes;
    }

    public int remainingMinutesInOven(int timeInOven){
        adjustedCookingTime = (cookingTimeInMinutes - timeInOven);
        return adjustedCookingTime;
    }

    public int preparationTimeInMinutes(int nbrOfLayers){
        prepTime = (nbrOfLayers * 2);
        return prepTime;
    }

    public int totalTimeInMinutes(int prepTime, int cookTime){
        totalTime = ((prepTime*2) + cookTime);
        return totalTime;
    }
    
}
