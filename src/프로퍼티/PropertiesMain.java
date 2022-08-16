package 프로퍼티;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

/*
 * 프로퍼티? Key와 Value가 String 타입으로 제한된 Map Collection이다.
 * 주로 설정 정보 읽는 용도로 사용
 */
public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 현재 class에서 database.properties 파일의 패스 정보를 가져옴
        String path = PropertiesMain.class
                .getResource("./database.properties")
                .getPath();
        // 한글에대한 정보를 읽어오기위해서 사용
        path = URLDecoder.decode(path, "utf-8");
        // 해당 결로에서 파일을 읽어드림
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("usernane" + username);
        System.out.println("password" + password);
    }
}
