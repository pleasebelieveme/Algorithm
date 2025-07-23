package alco;

import java.util.Arrays;

/**
 * 배열은 크기가 고정되기 때문에 요소를 삭제하면 앞으로 당겨지고 빈 공간이 생긴다. -> 시간복잡고 O(n) why? 뒤에 있는 요소를 끌어당겨야하기 떄문에
 */
public class L3_StaticArray {
    public static void main(String[] args) {
        // 값 삭제 => 시간복잡도 O(n)
        Integer[] arr = {27, 36, 45, 44, 21, 24, 82, 11};
        for(int i=5; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = null; // Integer여서 null값 추가 가능
        System.out.println(Arrays.toString(arr));

        // 값 추가 => 시간복잡도 O(n)
        for(int i=arr.length-1; i>1; i--){
            arr[i] = arr[i-1];
        }
        arr[1] = 33;
        System.out.println(Arrays.toString(arr));
    }
}
