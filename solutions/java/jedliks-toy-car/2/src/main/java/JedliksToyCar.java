public class JedliksToyCar {
    private Integer distanceInMeters = 0;
    private Integer batteryPwr = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceInMeters.toString() + " meters";
    }

    public String batteryDisplay() {
        if (batteryPwr <= 0){
            return "Battery empty";
        }
        return "Battery at " + batteryPwr.toString() + "%";
    }

    public void drive() {
        if (batteryPwr >= 1){
            distanceInMeters += 20;
            batteryPwr -= 1;
        }
    }
}
