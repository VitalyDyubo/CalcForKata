import java.lang.Exception;
class CalcRoman {
    static int calcRoman(String s, String o, String string) throws Exception {


        RomanNumber ar = RomanNumber.valueOf(s);
        RomanNumber br = RomanNumber.valueOf(string);

        int a1 = ar.getArab();
        int b1 = br.getArab();
        int result;

        if (a1 > 10 || a1 < 1 || b1 > 10 || b1 < 1) {
            throw new Exception("Для ввода доступны значения от I до X");
        }

        String op = new String();
        op = o;


        switch (op) {
            case "-":
                result = a1 - b1;
                if (result < 0) {
                    throw new Exception("В римской системе отсутствут отрицательные числа");
                }
                if (result == 0) {
                    throw new Exception("В римской системе отсутствует ноль");
                }
                return result;
            case "/":
                result = a1 / b1;
                return result;
            case "*":
                result = a1 * b1;
                return result;
            case "+":
                result = a1 + b1;
                return result;
            default:
                throw new InputException("Не является математическим выражением");


        }
    }
}
