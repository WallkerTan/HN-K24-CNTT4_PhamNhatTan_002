package SRC;

import java.util.*;

public class bai2 {

    static void output(String[] str) {
        Map<Integer, List<String>> M = new HashMap<>();

        for (String x : str) {

            x = x.replaceAll("[,;.!?]", "");

            if (x.isEmpty()) continue;

            int z = x.length();

            M.putIfAbsent(z, new ArrayList<>());
            if(!M.get(z).contains(x)){
                M.get(z).add(x);
            }
        }

        for (Map.Entry<Integer, List<String>> entry : M.entrySet()) {
            System.out.printf("%d ki tu: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] A = str.toLowerCase().split(" ");

        output(A);

        sc.close();
    }
}