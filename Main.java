import java.util.Scanner;
import java.lang.Exception;

public class Main {
    public static void main(String[] args) throws Exception {
        String sCalc = new String();
        calc(sCalc);
    }


    public static String calc(String input) throws Exception {
        System.out.println("Введите уравнение");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        String[] strings = str.split(" ", 3);
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                spaceCount++;
            }
        }
        if (spaceCount != 1) {
            throw new InputException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }



        try {
            boolean secondIsArabian = IsIntegerCheck.isIntegerCheck(strings[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не является математическим выражением");
        }

        boolean firstIsArabian = IsIntegerCheck.isIntegerCheck(strings[0]);
        boolean secondIsArabian = IsIntegerCheck.isIntegerCheck(strings[2]);

        if (firstIsArabian && secondIsArabian) {
            CalcArab.calcArab(strings[0], strings[1], strings[2]);
        } else if (!firstIsArabian && !secondIsArabian) {
            int result = CalcRoman.calcRoman(strings[0], strings[1], strings[2]);
            System.out.println(RomanNumber.values()[result]);

        } else if(firstIsArabian!=secondIsArabian){
    throw new InputException("Т.к. разные системы счисления");
        }

        return str;
    }
}

