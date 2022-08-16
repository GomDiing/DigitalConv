package 문자열다루기;
/*
 * equals() : 문자열을 비교함 (대소문자 구분)
 * equalsIgnoreCase() : 문자열을 비교함 (대소문자 구분안함)
 * indexOf() : 문자열에서 특정 문자/문자열이 시작하는 인덱스를 반환
 * contains() : 문자열에서 특정 문자열이 포함되어있는지 확인 (true / false)
 * charAt() : 문자열에서 인덱스 위치의 문자를 반환
 * replaceAll() : 문자열 중 특정 문자열을 다른 문자열로 변경 (특정 묹자열을 지울 때도 사용)
 * replace() : 문자열 중 특정 문자열을 다른 문자열로 변경 (특정 문자열을 지울 때도 사용)
 * subString(5) : 문자열 중 특정 문자열을 뽑아낼 때 사용 (해당 인덱스부터 끝까지 ...)
 * subString(5, 8) : 5에서 8 미만까지 문자열을 뽑아냄
 * toUpperCase() / toLowerCase() : 문자열을 모두 대문자 / 소문자로 변경
 * trim() : 문자열의 앞/뒤의 공백을 제거 (가운데 공백은 제거하지 못한다)
 * split() : 문자열을 특정 구분자로 분리하는 메서드
 * 문자열 포매팅 : String.format()와 System.out.printf()
 * String.format() : 서식으로 문자열을 구성해서 결과를 반환하는 메서드
 * System.out.printf() : 서식으로 문자열을 구성해서 결과를 출력하는 메서드
 * toCharArray() : 문자열의 문자 배열로 반환
 */
public class StringMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(a.equals(b));            // a와 b의 문자열의 내용이 같은지 확인
        System.out.println(a.equalsIgnoreCase(b));  // a와 b의 문자열의 내용이 같은지 확인 (대소문자 구분안함)
        System.out.println(a == b);                 // 참조가 같은지를 확인

        String name = "Hello Java Java";
        System.out.println(name.indexOf("Java"));

        System.out.println(name.contains("Java"));

        System.out.println(name.substring(6,9));
        System.out.println(name.trim());

        String nameSplit = "23:45:12";
        String[] namesSplit = nameSplit.split(":");
        for (String e : namesSplit)
            System.out.println(e);

        String nameF = "five";
        String nameFormat = String.format("I eat %s apples.", nameF);
        System.out.printf("I eat %s apples.", nameF);
        System.out.println(nameFormat);

        String nameCharArray = "Seoul City";
        char[] arrNameCharArray = nameCharArray.toCharArray();
        for (int i = 0; i < arrNameCharArray.length; i++) {
            System.out.println(arrNameCharArray[i] + " ");
        }
    }
}
