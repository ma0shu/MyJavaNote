package Notes;

import java.util.Scanner;

public class ExceptionsCustomDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入用户名：");
        String username=scanner.next();
        System.out.println("输入密码：");
        String password=scanner.next();
        String flag=login(username,password);
        System.out.println("flag{"+flag+"}");
    }
    static String login(String username,String password){
        if(username.equals("admin")) {
            if(password.equals("pass")){
                return "WeakPassw0rd1sDanger0us!";
            }else {
                throw new LoginFailedException("Bad username or password.");
            }
        } else{
            throw new UserNotFoundException("User not found.");
        }
    }
}
class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }
    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
    public BaseException(String message) {
        super(message);
    }
    public BaseException(Throwable cause) {
        super(cause);
    }
}
class UserNotFoundException extends BaseException {
    public UserNotFoundException() {
        super();
    }
    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public UserNotFoundException(String message) {
        super(message);
    }
    public UserNotFoundException(Throwable cause) {
        super(cause);
    }
}
class LoginFailedException extends BaseException {
    public LoginFailedException() {
        super();
    }
    public LoginFailedException(String message, Throwable cause) {
        super(message, cause);
    }
    public LoginFailedException(String message) {
        super(message);
    }
    public LoginFailedException(Throwable cause) {
        super(cause);
    }
}