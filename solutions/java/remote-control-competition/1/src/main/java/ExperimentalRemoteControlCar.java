public class ExperimentalRemoteControlCar implements RemoteControlCar {

  int ercDistance = 0;

  public void drive() {
    ercDistance += 20;
  }

  public int getDistanceTravelled() {
    return ercDistance;
  }
}