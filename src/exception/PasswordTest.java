package exception;

public class PasswordTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException{
        if (password == null) {
            throw new PasswordException("비밀번호는 null이면 안됩니다.");
        } else if (!isContainsNumber(password)) {
            throw new PasswordException("비밀번호는 문자열로만 구성할 수 없습니다.");
        } else if (password.length() <= 5) {
            throw new PasswordException("비밀번호는 6자 이상이어야 합니다.");
        }
        this.password = password;
    }

    private boolean isContainsNumber(String password) {
        int len = password.length();
        for(int i = 0; i < len; i++) {
            char ch = password.charAt(i);
            if(Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PasswordTest passwordTest = new PasswordTest();
        String pw = null;

        try {
            passwordTest.setPassword(pw);
        } catch(PasswordException e) {
            System.out.println(e.getMessage());
        }

        pw = "abcde";
        try {
            passwordTest.setPassword(pw);
        } catch(PasswordException e) {
            System.out.println(e.getMessage());
        }

        pw = "123b";
        try {
            passwordTest.setPassword(pw);
        } catch(PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
