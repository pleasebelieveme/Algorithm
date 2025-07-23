package alco;

import java.util.Arrays;

/**
 * 파이썬의 리스트는 애초에 동적배열이기에 따로 구현해줄 필요가 없다.
 */
public class L4_DynamicArray {
    public static void main(String[] args) {
        int[] original = {27, 36, 45, 44, 21, 24, 82, 11};
        int[] result = new int[original.length+1];

        int insertIndex = 2;
        int insertValue = 10;

        for(int i=0; i<insertIndex; i++){
            result[i] = original[i];
        }

        result[insertIndex] = insertValue;

        for(int i=insertIndex; i<original.length; i++){
            result[i+1] = original[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
