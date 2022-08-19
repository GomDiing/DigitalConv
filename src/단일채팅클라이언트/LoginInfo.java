package 단일채팅클라이언트;

public class LoginInfo {
    private static LoginInfo loginInfo;
    private String id;
    private String password;

    private LoginInfo() {}

    public static LoginInfo getInstance() {
        if (LoginInfo.loginInfo == null) {
            LoginInfo.loginInfo = new LoginInfo();
        }
        return LoginInfo.loginInfo;
    }

    public String getId() {
        return loginInfo.id;
    }

    public void setId(String id) {
        loginInfo.id = id;
    }

    public String getPassword() {
        return loginInfo.password;
    }

    public void setPassword(String password) {
        loginInfo.password = password;
    }
}
