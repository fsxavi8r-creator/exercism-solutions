import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitPoints;
    private final int baseHitPoints = 10;

    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
        hitPoints = baseHitPoints + modifier(constitution);
    }

    int ability(List<Integer> scores) {
        // this was the hardest one to work through
        // definitely read more about the Stream object
        return scores.stream()
            .sorted(Collections.reverseOrder())
            .limit(3)
            .mapToInt(Integer::intValue)
            .sum();
    }

    List<Integer> rollDice() {
        Random rand = new Random();
        // create a list object to store the scores
        List<Integer> scores = new ArrayList<>();
        // roll those dice (4d6)!
        for (int i = 0; i < 4; i++) {
            scores.add(rand.nextInt(6) + 1);
        }
        return scores;
    }

    int modifier(int input) {
        return Math.floorDiv(input - baseHitPoints, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitPoints;
    }
}
