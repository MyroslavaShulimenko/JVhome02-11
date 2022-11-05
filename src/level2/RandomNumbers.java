package level2;

import java.util.Arrays;

public class RandomNumbers implements TreatmentArray{
    @Override
    public int[] getArray() {
        int[] array;
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 12) - 5);
        }
        return array;
    }
}
