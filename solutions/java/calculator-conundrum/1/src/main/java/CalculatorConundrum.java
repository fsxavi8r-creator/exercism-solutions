class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {
            switch (operation) {
                case "+":
                    return myFormattedAnswer(operand1, operand2, operation, (operand1 + operand2));
                case "-":
                    return myFormattedAnswer(operand1, operand2, operation, (operand1 - operand2));
                case "*":
                    return myFormattedAnswer(operand1, operand2, operation, (operand1 * operand2));
                case "/":
                    return myFormattedAnswer(operand1, operand2, operation, (operand1 / operand2));
                default:
                    throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }

    // helper method
    private static String myFormattedAnswer(int operand1, int operand2, String operation, int answer) {
        return String.format("%d %s %d = %d", operand1, operation, operand2, answer);
    }
}