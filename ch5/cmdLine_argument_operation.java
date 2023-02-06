package ch5;

public class cmdLine_argument_operation {
    public static void main(String args[]) {
        if (args.length != 3) {
            System.out.println("Not enough arguments");
            System.exit(0);
        }

        int num1= Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Unspported operation;");
        }
        System.out.println("Result: " + result);
    }
}
