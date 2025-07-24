package alco;

/**
 * 같은 타입의 데이터를 연속적인 메모리 공간에 저장하는 자료구조
 * 인덱스로 데이터를 찾으면 시간복잡도는 O(1)이다. 보통 알고리즘은 시간복잡도를 위주로 학습.
 */
public class L2_Array {
    /**
     * Demonstrates basic array operations and their time complexities, including direct access, modification, iteration, and linear search.
     *
     * Initializes integer arrays, accesses and modifies elements by index, prints array contents, and performs a linear search for a specific value.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // 시간복잡도 O(1)
        int[] arr = {27, 36, 45, 44, 21, 24, 82, 11};
        System.out.println(arr[3]); // 44
        arr[5] = 16;
        for (int value : arr) {
            System.out.print(value + " ");
        } // 27, 36, 45, 44, 21, 16, 82, 11


        // 시간복잡도O(n) -> 최악의 경우를 기준으로 계산
        int[] arr2 = {27, 36, 45, 44, 21, 24, 82, 11};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 45) {
                System.out.print(arr2[i] + " ");
                break;
            }
        }
    }
}
