package Notes;

import java.util.Optional;

public class ExceptionofNullPtrDemo {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.toLowerCase());
        } catch (NullPointerException e) {
            e.printStackTrace();//不要用catch{}直接隐藏异常
        }
        //好习惯：1.初始化s="";空串而非null
        //public String[] readLinesFromFile(String file) {
        //    if (getFileSize(file) == 0) {
        //        return new String[0];
        //    } // 2.返回空数组而不是null
        //}
        //3.如果调用方一定要根据null判断，e.g.返回null表示文件不存在，
        // 考虑返回Optional<T>,这样调用方必须通过Optional.isPresent()判断是否有结果。
//        public Optional<String> readFromFile(String file) {
//            if (!fileExist(file)) {
//                return Optional.empty();
//            }
//        }
    }
}
