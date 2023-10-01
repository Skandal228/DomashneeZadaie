package Kata;

/*Данный код представляет собой программу калькулятора, которая выполняет операции сложения, вычитания,
умножения и деления с целыми числами, как с арабскими, так и с римскими цифрами*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        //Программа считывает выражение с консоли и передает его в метод evaluateExpression для вычисления результата.
        String expression = scanner.nextLine();
        try {
            int result = evaluateExpression(expression);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректные числовые данные!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    /*Метод evaluateExpression разбивает выражение на три части: операнд1, оператор и операнд2.
    Затем он проверяет, являются ли операнды римскими цифрами или арабскими числами.
    Если используются разные системы счисления, выбрасывается исключение.
    Затем числа преобразуются в числовое значение и проверяется их диапазон от 1 до 10 включительно*/

    public static int evaluateExpression(String expression) throws Exception {
        String[] parts = expression.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию – два операнда и один оператор (+, -, /, *)");
        }
        String operand1 = parts[0];
        String operator = parts[1];
        String operand2 = parts[2];
        boolean isRoman1 = isRomanNumeral(operand1);
        boolean isRoman2 = isRomanNumeral(operand2);
        if (isRoman1 != isRoman2) {
            throw new Exception("Ошибка! Используются разные системы счисления!");
        }
        int num1, num2;
        if (isRoman1) {
            num1 = RomanToArabic(operand1);
            num2 = RomanToArabic(operand2);
            if (num1 <= 0 || num2 <= 0) {
                throw new Exception("В римской системе нет отрицательных чисел!!");
            }
        } else {
            num1 = Integer.parseInt(operand1);
            num2 = Integer.parseInt(operand2);
        }
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно!");
        }
        int result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                if (isRoman1 && num1 <= num2) {
                    throw new Exception("В римской системе нет отрицательных чисел!");
                }
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;

            default:
                throw new IllegalArgumentException("Некорректная операция!");
        }
        return result;
    }

    //Метод RomanToArabic преобразует римское число в арабское число, используя карту соответствия символов римских цифр и их числовых значений.
    private static int RomanToArabic(String roman) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(roman.charAt(i));
            if (currentValue < prevValue) {  //в случае возникновения исключений, программа выводит соответствующее сообщение об ошибке.
                result -= currentValue;
            } else { //в противном случае, программа выводит результат вычисления на экран.
                result += currentValue;
                prevValue = currentValue;
            }
        }
        return result;
    }

    //Метод isRomanNumeral проверяет, является ли входная строка римским числом, с помощью регулярного выражения.
    private static boolean isRomanNumeral(String input) {
        return input.matches("^[IVXLCDM]+$");
    }
}