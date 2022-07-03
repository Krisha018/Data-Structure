import java.util.*;

public class replace_number_in_arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int size_array = sc.nextInt();
        int[] a = new int[size_array];
        for (int i = 0; i < size_array; i++) {
            System.out.print("Enter Number" + i + ":");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Old Number:");
        int old_num = sc.nextInt();
        System.out.print("Enter New Number:");
        int new_num = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < size_array; i++) {
            if (a[i] == old_num) {
                a[i] = new_num;
                flag = 1;
            }
        }
        if (flag == 1) {
            for (int i = 0; i < size_array; i++) {
                System.out.print(a[i] + ",");
            }
        } else {
            System.out.print("Number Not Found");
        }
    }

}
