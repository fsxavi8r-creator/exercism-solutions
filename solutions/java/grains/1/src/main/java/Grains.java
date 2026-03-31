import java.math.BigInteger;

class Grains {
    public static final long DOUBLER = 2;
    public static final int MAX_SQUARES = 64;

    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square > MAX_SQUARES){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.valueOf(DOUBLER).pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        return BigInteger.valueOf(DOUBLER).pow(MAX_SQUARES).subtract(BigInteger.ONE);
    }

}
