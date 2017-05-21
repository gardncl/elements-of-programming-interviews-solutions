import java.util.Stack;

public class EvaluateRPNExpressions {

    /*
    9.2
    */

    public static Integer eval(String RPNExpression) {
        Stack<Integer> stack = new Stack<>();
        int a, b;
        for (String s : RPNExpression.split(",")) {
            if (s.length() > 1 &&
                    s.charAt(0) == '-' ? s.substring(1).trim().chars().allMatch(Character::isDigit)
                                        : s.trim().chars().allMatch(Character::isDigit))
                stack.push(Integer.parseInt(s));
            else {
                try {
                    a = stack.pop();
                    b = stack.pop();
                } catch (Exception e) {
                    return null;
                }
                switch (s) {
                    case "-":   stack.push(a - b);
                                break;
                    case "+":   stack.push(a + b);
                                break;
                    case "/":   stack.push(a / b);
                                break;
                    case "x":   stack.push(a * b);
                                break;
                    default:    return null;
                }

            }
        }
        return stack.pop();
    }
}
