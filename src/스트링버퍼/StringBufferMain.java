package 스트링버퍼;

// StringBuffer() : 문자열을 추가하거나 변경할때 사용

public class StringBufferMain {
    public static void main(String[] args) {

        /*
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("Java");
        sb.append("^^");
        System.out.println(sb);
        */
        /*
        String buff = "";
        buff = "hello";
        buff += " ";
        buff += "Java";
        buff += "^^";
        System.out.println(buff);
        */

        // StringBuilder 성능이 우수하지만 싱글 쓰레드용
        // StringBuffer 멀티 쓰레드용
        // delete() : 전달된 인덱스의 문자열을 제거
        // insert()

        StringBuilder strb = new StringBuilder();
        strb.append("hello");
//        strb.append(" ");
        strb.append("Java");
        strb.append("^^");
        strb.delete(0, 5); // 시작 인덱스에서 끝 인덱스 미만
        strb.insert(0, "Hi^^ ");
        System.out.println(strb);
        System.out.println(strb.subSequence(0, 8)); // 문자열 자르기
    }
}
