public class ExpressionParserService {
    public static Expression parse(String expression) {
        char operator = getOperator(expression);
        String[] operands = getOperands(expression, operator);

        return new Expression(operator, Integer.parseInt(operands[0]), Integer.parseInt(operands[1]));
    }

    private static char getOperator(String expression) {
        char[] symbols = { '+', '-', '*', '/' };

        for (char symbol : symbols) {
            int index = expression.indexOf(symbol);
            if (index != -1) {
                return symbol;
            }
        }

        throw new IllegalArgumentException("Некорректный оператор");
    }

    private static String[] getOperands(String expression, char operator) {
        String[] operands = expression.split("\\" + operator);
        if (operands.length != 2) {
            throw new IllegalArgumentException("Некорректное выражение");
        }
        return operands;
    }
}



