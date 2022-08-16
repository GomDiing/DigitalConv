package 배열의복사2;

// 배열의 깊은 복사를 하는 방법
// arraycopy() : 배열을 복사하는데 사용하는데,
// 주로 배열의 공간이 부족해 더 큰 공간을 할당하고자할 때 사용
//

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int newLen = 10; // 배열에 길이에대한 변수
        /* 1
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        for (int e : arr2) System.out.print(e + " ");
        */

        int[] arr2 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int e : arr2) System.out.print(e + " ");

    }

}
