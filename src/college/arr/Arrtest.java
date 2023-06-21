package src.college.arr;

public class Arrtest {
    public static void main(String[] args) {
        ObjArrTest1 obj1 = new ObjArrTest1();
        obj1.setName("홍길동");
        obj1.setScore(90);

        ObjArrTest1 obj2 = new ObjArrTest1();
        obj2.setName("이순신");
        obj2.setScore(99);

        ObjArrTest1 obj3 = new ObjArrTest1();
        obj3.setName("아무개");
        obj3.setScore(60);

        ObjArrTest1[] arr = new ObjArrTest1[3];
        arr[0] = obj1;
        arr[1] = obj2;
        arr[2] = obj3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name + " / " + arr[i].score);
        }
    }
}
