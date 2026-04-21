public class GameMaster {

    // TASK 1
    public String describe(Character character){
        return "You're a level " + 
            character.getLevel() + " " +
            character.getCharacterClass() + " with " +
            character.getHitPoints() + " hit points.";
    };

    // TASK 2
    public String describe(Destination dest){
        return "You've arrived at " +
            dest.getName() + ", which has " +
            dest.getInhabitants() + " inhabitants.";
    };
    
    // TASK 3
    public String describe(TravelMethod travelMethod){
        return "You're traveling to your destination " + 
            switch(travelMethod){
                case HORSEBACK -> "on horseback.";
                case WALKING -> "by walking.";
            };
    };

    // TASK 4
    public String describe(Character character, Destination dest, TravelMethod travelMethod){
        return describe(character) + " " +
            describe(travelMethod) + " " +
            describe(dest);
    }

    // TASK 5
    public String describe(Character character, Destination dest){
        return describe(character, dest, TravelMethod.WALKING);
    }
}
