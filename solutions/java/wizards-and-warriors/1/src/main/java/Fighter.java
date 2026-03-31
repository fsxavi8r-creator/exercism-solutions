class Fighter {
  private String playerClass;

    public String toString() {
        return this.playerClass;
    }
    
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

  @Override
  public String toString() {
    return "Fighter is a Warrior";
  }

  @Override
  boolean isVulnerable() {
    return false;
  }

  @Override
  int getDamagePoints(Fighter fighter) {
    int result = (fighter.isVulnerable()) ? 10 : 6;
    return result;
  }
}

class Wizard extends Fighter {
  private boolean hasSpellPrepared = false;

  @Override
  public String toString() {
    return "Fighter is a Wizard";
  }

  public boolean prepareSpell() {
    this.hasSpellPrepared = true;
    return hasSpellPrepared;
  }

  @Override
  boolean isVulnerable() {
    boolean result = (hasSpellPrepared) ? false : true;
    return result;
  }

  @Override
  int getDamagePoints(Fighter fighter) {
    int dmgResult = (hasSpellPrepared) ? 12 : 3;
    return dmgResult;
  }
}

