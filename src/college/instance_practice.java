package src.college;


public class instance_practice {
    void print_name() {
        System.out.println("저는 김동욱입니다.\n제 주소는 우암동입니다.\n제 학번은 2020011767입니다.");
    }
    public static void main(String[] args) {
        instance_practice me = new instance_practice(); // 저는 instance_practice라는 class를 통해 만들어낼 instance가 될 variable me를 선언합니다.



        me.print_name();

    }
}