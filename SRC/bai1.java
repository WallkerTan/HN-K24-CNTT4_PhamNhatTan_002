package SRC;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class bai1 {
    public static void main(String[] args) {
        int n;
        Map<Integer,Integer> A = new HashMap<>();
        Set<Integer> B = new TreeSet<>((y, x) -> {
            return Integer.compare(y, x);
            
        });
        Set<Integer> C = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            int temp;
            temp = sc.nextInt();
            sc.nextLine();
            if(A.containsKey(temp)){
                A.replace(temp, A.get(temp)+1);
            }else{
                A.put(temp, 1);
            }
            C.add(temp);
        };

        B.addAll(C);
        System.out.println("so hoc sinh nhan hoc bong: "+A.size());
        System.out.printf("danh sach da sap sep: ");
        for (Integer x : B) {
            System.out.printf("%d ",x);
        }
        sc.close();
    }
}
