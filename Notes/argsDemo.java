package Notes;

public class argsDemo {
    public static void main(String[] args) { //程序传参
        for(String arg:args){
            if(arg.equals("--ver"))
                System.out.println("version: 1.0.0");
        }
        System.out.println("Hello world!");
    }
}
//运行，然后运行窗口有底下三个点，修改运行配置，程序实参输入--ver，
// 再点三个点左边的运行按钮，就会输出version: 1.0.0