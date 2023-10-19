import java.util.Scanner;

public class UserInterfaceService {
    public static void main(String[] args) {
        System.out.println("Калькулятор может :a+b,a-b,a*b,a/b.");
        System.out.println("Результатом операции остаток отбрасывается.");
        System.out.println("<<<--------- END для выхода ------------>>>");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" ");
            System.out.print("Введите выражение: ");
            String input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            }



            Expression expression = ExpressionParserService.parse(input);
            int result = CalculationService.calculate(expression);

            System.out.println("Результат = " + result);
        }
    }
}
