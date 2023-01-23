import java.lang.Exception;
class CalcArab {

    static int calcArab(String s, String o, String string) throws Exception {
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(string);
        int result;
        if (a > 10 || a < 1 || b > 10 || b < 1) {
            throw new Exception("Для ввода доступны значения от 1 до 10");
        }


        String op = new String();
        op = o;


        switch (op) {
            case "-":
                result = a - b;
                return result;
            case "/":
                result = a / b;
                System.out.println(result);
                return result;
            case "*":
                result = a * b;
                System.out.println(result);
                return result;
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            default:
                throw new InputException("Не является математическим выражением");
        }
        return result;
    }
}
