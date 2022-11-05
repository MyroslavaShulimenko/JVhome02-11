package level2;

import java.util.Arrays;
import java.util.Scanner;

public class Production  implements TreatmentArray{
    @Override
    public int[] getArray() {
        int[]arr=new int[5];
        System.out.println("Введите 5 целых чисел (по одному)");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
