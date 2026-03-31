class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {
            String answer = switch (operation) {
                case "+" -> myFormattedAnswer(operand1, operand2, operation, (operand1 + operand2));
                case "-" -> myFormattedAnswer(operand1, operand2, operation, (operand1 - operand2));
                case "*" -> myFormattedAnswer(operand1, operand2, operation, (operand1 * operand2));
                case "/" -> myFormattedAnswer(operand1, operand2, operation, (operand1 / operand2));
                default ->
                    throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            };
            return answer;
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }

    // helper method
    private static String myFormattedAnswer(int operand1, int operand2, String operation, int answer) {
        return String.format("%d %s %d = %d", operand1, operation, operand2, answer);
    }
}
