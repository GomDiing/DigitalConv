package 배열의복사2;
/*
 배열의 깊은 복사를 하는 방법
 arraycopy() : 배열을 복사하는데 사용하는데,
 주로 배열의 공간이 부족해 더 큰 공간을 할당하고자할 때 사용
 arraycopy(src, srcpos, dest, destpos, length)
 copyOf() : 배열을 원하는 길이만큼 새로운 배열로 복사
*/

import java.util.Arrays;

public class ArrayCopyMain {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1, 10);
        for (int e : arr2) System.out.print(e + " ");
    }
}
