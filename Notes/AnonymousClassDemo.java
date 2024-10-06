package Notes;
//TBH�е�û̫���ף��Ժ���˵��
import java.awt.event.ActionListener;

interface Greeting {
    void greet();
}
public class AnonymousClassDemo {
    public static void main(String[] args) {
        Greeting ChineseGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("���");
            }
        };
        Greeting EnglishGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        };
        ChineseGreeting.greet();
        EnglishGreeting.greet();
    }
}
//=======Example2=======
class Button {
    public void click() {
        new ActionListener(){
            public void onAction() {
                System.out.println("Button clicked");
            }
        }.onAction();
    }
    public interface ActionListener {
        void onAction();
    }
    public static void main(String[] args) {
        Button button = new Button();
        button.click();
    }
}