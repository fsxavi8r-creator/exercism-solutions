public class Secrets {

    /**
     * Shifts the bits of the specified integer value back (to the right) by a given amount.
     *
     * @param value    the integer value to be shifted
     * @param amount   the number of bit positions to shift
     * @return         the resulting shifted integer
     */
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    /**
     * Sets the bits in the value that are specified by the mask.
     *
     * @param value   the original integer value
     * @param mask    the bitmask indicating which bits to set to 1
     * @return        the value after the bitwise OR operation
     */
    public static int setBits(int value, int mask) {
        return value | mask;
    }

    /**
     * Inverts the bits in the value that are specified by the mask.
     *
     * @param value   the original integer value
     * @param mask    the bitmask indicating which bits to toggle
     * @return        the value after the bitwise XOR operation
     */
    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    /**
     * Clears the bits in the value that are specified by the mask.
     *
     * @param value   the original integer value
     * @param mask    the bitmask indicating which bits to set to 0
     * @return        the value after the bitwise AND operation with the negated mask
     */
    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}