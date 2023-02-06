package ch5;

public class arraycopy {
    public static void main(String args[]) {
        char[] abc = new char[] {'A', 'B', 'C', 'D'};
        char[] num = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // 새로운 배열을 만들고 arraycopy를 이용해 abc, num배열의 elements를 편리하게 복사
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
