package 파일입출력스트림;

/*
 * 파일 클래스 : File or Directory 추상화한 Class (가장 많이 사용되는 입출력)
 */

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStreamEx {
    public static void main(String[] args) throws IOException, URISyntaxException {
//        File file = new File("src/문자출력스트림/문자출력0816_01.txt");
        /* 예시
        File dir = new File("src/문자출력스트림"); // 파일 경로만 지정하는 해당 디렉토리에 포함된 목록읇 보여줌
        File file1 = new File("src/문자출력스트림/문자출력0816_01.txt");
        File file2 = new File(new URI("file:/Users/ryute/Study/Lecture/KHAcademy/DigitalConv/src/문자출력스트림/문자출력0816_01.txt"));

        if (!dir.exists()) dir.mkdir(); // Folder 생성 Method
        if (!file1.exists()) file1.createNewFile(); // File 생성
        if (!file2.exists()) file2.createNewFile();
        */

        File tmp = new File("src/문자출력스트림");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        File[] contents = tmp.listFiles();
        System.out.println("날짜         시간          크기    이름");
        System.out.println("---------------------------------------");
        for (File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t" + file.getName());
            } else {
                System.out.print("\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
