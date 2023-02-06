package ch5;

public class cmdLine_argument {
    public static void main(String args[]) {
        System.out.println("Num of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = \"%d\"", i, args[i]);
        }
    }
}
