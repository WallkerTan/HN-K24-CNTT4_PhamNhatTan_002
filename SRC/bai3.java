package SRC;

import java.util.Scanner;
import java.util.Stack;

public class bai3 {
    static boolean checkone(String str){
        return str.equals("(") || str.equals("[") || str.equals("{");
    }
    static boolean checktwo(String str1,String str2){
       return str1.equals(")") && str2.equals("(") || str1.equals("]") && str2.equals("[") ||str1.equals("}") && str2.equals("{");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("-> ");
        str = sc.nextLine();
        Stack st = new Stack<String>();
        for (char c : str.toCharArray()) {
            String temp = String.valueOf(c);
            if(checkone(temp)){
                st.add(temp);
            }else{
                if(checktwo(temp, st.peek().toString())){
                    st.pop();
                }else{
                    continue;
                }
            }
        }
        if(st.empty()){
            System.out.println("hop le");
        }else{
            for (Object s : st) {
                System.out.println(s.toString());
            }
            System.out.println("khong hop le");
        }
        sc.close();
    }
}
