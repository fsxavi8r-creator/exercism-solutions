public class CarsAssemble {

    private static final int RAW_CARS_PER_HOUR = 221;
    private double adjustedCarsPerHour = 0.0;

    public double productionRatePerHour(int speed) {
        adjustedCarsPerHour = (RAW_CARS_PER_HOUR * speed) * getSuccessPct(speed);
        return adjustedCarsPerHour;
    }

    public int workingItemsPerMinute(int speed) {
        int itemsPerMin;
        itemsPerMin = (int)((RAW_CARS_PER_HOUR * speed) * getSuccessPct(speed)) / 60;
        return itemsPerMin;
    }

    public double getSuccessPct(int speed){
        double successRate = 0.0;
        if (speed <= 0 ) {
            successRate = 0.0;
        } else if (speed > 0 && speed <= 4){
            successRate = 1.0;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9){
            successRate = 0.8;
        } else if (speed == 10){
            successRate = 0.77;
        }
        return successRate;
    }
    
}
