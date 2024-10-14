package Notes;

public class ExceptionThrowsDemo {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
//          throw new IllegalArgumentException();
            throw new IllegalArgumentException(e);
        }//收到process2的Number..Exception后，
        // 抛出IllegalArgumentException
        //但如果在后面不传入e，就看不到原始异常信息了，找不到根本原因
        finally{
            System.out.println("finally!");
        }//throw异常，不会影响finally先执行
        //如果在finally里throw异常，会覆盖/屏蔽原异常
        //应用：保存所有的异常信息：
        //先用origin变量保存原始异常
        // Exception origin = null;
        // ...orgin=e;throw e;
        // 然后finally调用
        // if(origin!=null)e.addSuppressed(origin)
        // 把原始异常添加进来，最后抛出：throw e
    }
    static void process2() {
        throw new NullPointerException();
    }
}
