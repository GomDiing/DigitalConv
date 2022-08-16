package 암호체크만들기;

public class CheckPWClass {
    String password;
    void inputPW(String pass) {
        // 패스워드 체크를위해 전달받은 매개변수를 인스턴스필드에 복사
        // 인스턴스 password를 사용하지않는다면 해당 메소드에서 기능 전부를 구현해야함
        password = pass;
//        System.out.println("길이체크 : " + validLength());
//        System.out.println("숫자체크 : " + validNumber());
//        System.out.println("대문자체크 : " + validUpperAphabet());
//        System.out.println("소문자체크 : " + validLowerAphabet());
//        System.out.println("특수문자체크 : " + validRex());

        if (validLength() && validRex() && validNumber() && validLowerAphabet() && validUpperAphabet()) {
            System.out.println("Good password!");
        }

        else {
            System.out.println("Bad password!");
        }
    }

    boolean validLength() {
        if (password.length() >= 10 && password.length() <= 30) return true;
        else return false;
    }

    boolean validNumber() {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }

    boolean validUpperAphabet() {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                return true;
            }
        }
        return false;
    }

    boolean validLowerAphabet() {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                return true;
            }
        }
        return false;
    }

    boolean validRex() {
        String specialLetter = "!%_&#+-*/";
        for (int i = 0; i < specialLetter.length(); i++) {
            for (int j = 0; j < password.length(); j++) {
                if (specialLetter.charAt(i) == password.charAt(j)) return true;
            }
        }
        return false;
    }
}
