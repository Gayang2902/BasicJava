package ch4;

public class enhanced_for {
    public static void main(String args[]) {
        // for (type var_name : array or collection)
        // instance변수에 array나 collection의 element를 차례대로 뽑아서 저장해준다
        int array[] = {10, 20, 30, 40, 50};

        for (int i : array) {
            System.out.println(i);
        }
    }
}
