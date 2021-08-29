package com.company;

public class ActionService {
    public ActionService() {
    }

    public static String calculate(Number first, Number second, String action) throws Exception {
        byte var5 = -1;
        switch(action.hashCode()) {
            case 42:
                if (action.equals("*")) {
                    var5 = 2;
                }
                break;
            case 43:
                if (action.equals("+")) {
                    var5 = 0;
                }
            case 44:
            case 46:
            default:
                break;
            case 45:
                if (action.equals("-")) {
                    var5 = 1;
                }
                break;
            case 47:
                if (action.equals("/")) {
                    var5 = 3;
                }
        }

        int result;
        switch(var5) {
            case 0:
                result = first.getValue() + second.getValue();
                break;
            case 1:
                result = first.getValue() - second.getValue();
                break;
            case 2:
                result = first.getValue() * second.getValue();
                break;
            case 3:
                result = first.getValue() / second.getValue();
                break;
            default:
                throw new Exception("Не правильно введен символ операции, используйте только +, -, *, /");
        }

        return first.getType() == NumberType.ROMAN ? NumberService.toRomanNumber(result) : String.valueOf(result);
    }
}
