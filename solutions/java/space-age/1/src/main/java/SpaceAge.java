class SpaceAge {

    private static final double EARTH_YEAR_SECONDS = 31557600.0;
    // WHERE EARTH = 1.0
    private static final double MERCURY_REL_TO_EARTH = 0.2408467;
    private static final double VENUS_REL_TO_EARTH = 0.61519726;
    private static final double MARS_REL_TO_EARTH = 1.8808158;
    private static final double JUPITER_REL_TO_EARTH = 11.862615;
    private static final double SATURN_REL_TO_EARTH = 29.447498;
    private static final double URANUS_REL_TO_EARTH = 84.016846;
    private static final double NEPTUNE_REL_TO_EARTH = 164.79132;

    private final double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / EARTH_YEAR_SECONDS;
    }

    double onMercury() {
        return onEarth() / MERCURY_REL_TO_EARTH;
    }

    double onVenus() {
         return onEarth() / VENUS_REL_TO_EARTH;
    }

    double onMars() {
        return onEarth() / MARS_REL_TO_EARTH;
    }

    double onJupiter() {
        return onEarth() / JUPITER_REL_TO_EARTH;
    }

    double onSaturn() {
        return onEarth() / SATURN_REL_TO_EARTH;
    }

    double onUranus() {
        return onEarth() / URANUS_REL_TO_EARTH;
    }

    double onNeptune() {
        return onEarth() / NEPTUNE_REL_TO_EARTH;
    }

}
