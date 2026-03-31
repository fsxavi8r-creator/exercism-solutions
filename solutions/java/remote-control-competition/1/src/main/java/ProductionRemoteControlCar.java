class ProductionRemoteControlCar
  implements RemoteControlCar, Comparable<ProductionRemoteControlCar>
{

  private int prcDistance = 0;
  private int nbrVictories;

  public void drive() {
    prcDistance += 10;
  }

  public int getDistanceTravelled() {
    return prcDistance;
  }

  public int getNumberOfVictories() {
    return this.nbrVictories;
  }

  public void setNumberOfVictories(int numberOfVictories) {
    this.nbrVictories = numberOfVictories;
  }

  @Override
  public int compareTo(ProductionRemoteControlCar prc) {
    return Integer.compare(this.nbrVictories, prc.nbrVictories);
  }
}