import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return String.format("NCC-%d", 1000 + random.nextInt(9000));
    }

    double randomStardate() {
        double minimum = 41000.0;
        double maximum = 42000.0;
        return minimum + (random.nextDouble() * (maximum - minimum));
    }
}