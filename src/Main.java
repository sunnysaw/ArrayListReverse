/*
Question : Write a program to reverse the given ArrayList.
 */
import java.util.ArrayList;
public class Main {
    static void ReverseList(ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;
        while (i < j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(10);
        a.add(3);
        a.add(5);
        a.add(22);
        a.add(10);
        System.out.println("Original value :" + a);
        ReverseList(a);
        System.out.println("printing the final result :" + a);
    }
}