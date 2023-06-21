// 수업에서 HashSet, Iterator, ArrayList, HashMap 등을 다룸

package src.Project.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        // HashSet이 중복 데이터를 허용하지 않음을 확인
        hs.add("홍길동");
        hs.add("아무개");
        hs.add("김길동");
        hs.add("김길동");
        hs.add("아무개");

        // Object[] arr = hs.toArray();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // // Iterator를 이용해서 hasNext, next를 이용해 데이터 접근
        // Iterator it = hs.iterator();
        // while (it.hasNext()) {
        //     // System.out.println(it.next());
        // }

        // ArrList가 중복 데이터를 허용함을 확인
        ArrayList list = new ArrayList<>();
        list.add("홍길동");
        list.add("아무개");
        list.add("이순신");
        list.add("아무개");
        list.add("홍길동");

        // Iterator listIt = list.iterator();
        // while (listIt.hasNext()) {
        //     System.out.println(listIt.next());
        // }

        HashMap hMap = new HashMap<>();
        hMap.put(1, "홍길동");
        hMap.put(2, "아무개");
        hMap.put(3, "김길동");
        hMap.put(4, "이길동");

        // 키 값만을 뽑아내기 위해 set로 변환하여 iterator로 바꿈
        Set keyset = hMap.keySet();
        Iterator hMapIt = keyset.iterator();

        while (hMapIt.hasNext()) {
            int key = (int)hMapIt.next();
            System.out.println(hMap.get(key));
        }
    }
}