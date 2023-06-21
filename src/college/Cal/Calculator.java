package src.college.Cal;

import javax.swing.JOptionPane;

public class Calculator {
    String num1;
    String num2;
    String operator;

    public void doOperation() {
        int tmpnum1;
        int tmpnum2;
        int result = 0;
        num1 = JOptionPane.showInputDialog(null, "첫번째 숫자 입력.");
        tmpnum1 = Integer.parseInt(num1);
        num2 = JOptionPane.showInputDialog(null, "두번째 숫자 입력.");
        tmpnum2 = Integer.parseInt(num2);
        operator = JOptionPane.showInputDialog(null, "연산자 숫자 입력.\n(+:더하기,-:빼기,*:곱하기,/:나누기,%:나머지");
        if (operator.equals("+")) {
            result = tmpnum1 + tmpnum2;
        } else if (operator.equals("-")) {
            result = tmpnum1 - tmpnum2;
        } else if (operator.equals("*")) {
            result = tmpnum1 * tmpnum2;
        } else if (operator.equals("/")) {
            result = tmpnum1 / tmpnum2;
        } else if (operator.equals("%")) {
            result = tmpnum1 % tmpnum2;
        } else {
            System.out.println("ERROR!");
        }
        JOptionPane.showMessageDialog(null, num1 + operator + num2 + "결과는 '" + result + "'입니다.");
    }
}
