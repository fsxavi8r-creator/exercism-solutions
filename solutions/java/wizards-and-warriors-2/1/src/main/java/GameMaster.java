public class GameMaster {

    // TASK 1
    public String describe(Character character){
        return String.format("You're a level %d %s with %d hit points.",
            character.getLevel(),
            character.getCharacterClass(),
            character.getHitPoints());
    };

    // TASK 2
    public String describe(Destination dest){
        return String.format("You've arrived at %s, which has %d inhabitants.",
            dest.getName(),
            dest.getInhabitants());
    };
    
    // TASK 3
    public String describe(TravelMethod travelMethod){
        return String.format("You're traveling to your destination %s",
            switch(travelMethod){
                case HORSEBACK -> "on horseback.";
                case WALKING -> "by walking.";
            });
    };

    // TASK 4
    public String describe(Character character, Destination dest, TravelMethod travelMethod){
        return String.join(" ", describe(character), describe(travelMethod), describe(dest));
    }

    // TASK 5
    public String describe(Character character, Destination dest){
        return describe(character, dest, TravelMethod.WALKING);
    }
}
