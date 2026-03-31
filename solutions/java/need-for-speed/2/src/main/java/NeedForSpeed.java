class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int batteryPercentage = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public int getBatteryDrain(){
        return batteryDrain;
    }
    
    public int getBatteryPercentage(){
        return batteryPercentage;
    }
    
    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;    
    }
    
    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (batteryDrained()) return;
        distanceDriven += speed;
        batteryPercentage -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int drivesPossible = car.getBatteryPercentage() / car.getBatteryDrain();
        int maxDistance = drivesPossible * car.getSpeed();
        return maxDistance >= this.distance;
    }
}
