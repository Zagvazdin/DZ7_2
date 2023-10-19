public class CalculationService {
    public static int calculate(Expression expression) {
        int result = 0;

        switch (expression.getOperator()) {
            case '+':
                result = expression.getOperand1() + expression.getOperand2();
                break;
            case '-':
                result = expression.getOperand1() - expression.getOperand2();
                break;
            case '*':
                result = expression.getOperand1() * expression.getOperand2();
                break;
            case '/':
                result = expression.getOperand1() / expression.getOperand2();
                break;
            default:
                throw new IllegalArgumentException("Некорректный оператор");
        }

        return result;
    }
}
