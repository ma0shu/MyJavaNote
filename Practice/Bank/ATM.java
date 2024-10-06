package Practice.Bank;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    Account loginaccount=new Account();
    Scanner scanner=new Scanner(System.in);
    private ArrayList<Account> accounts=new ArrayList<>();
    public void start(){
        while (true) {
            System.out.println("=======欢迎使用ATM=======");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择：");
            int choice;
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }
    private void createAccount(){
        System.out.println("=======用户开户=======");
        Account account=new Account();
        System.out.println("请输入用户名：");
        String name=scanner.next();
        account.setName(name);
        while (true) {
            System.out.println("请输入密码：");
            String password=scanner.next();
            System.out.println("请再次输入密码：");
            String password2=scanner.next();
            if(password.equals(password2)) {
                account.setPassword(password);
                break;
            }
            else {
                System.out.println("两次密码不一致");
            }
        }
        while (true) {
            System.out.println("请输入性别：");
            char sex = scanner.next().charAt(0);
            if (sex == '男' || sex == '女') {
                account.setSex(sex);
                break;
            } else
                System.out.println("输入错误");
        }
        System.out.println("请输入取现额度：");
        double limit=scanner.nextDouble();
        account.setLimit(limit);
        String cardId=generateCardId();
        account.setCardid(cardId);
        accounts.add(account);
        System.out.println("开户成功，卡号为："+account.getCardid());
    }
    private String generateCardId(){
        String cardId="";
        Random r=new Random();
        for (int i=0;i<8;i++) {
            cardId+=r.nextInt(10);
        }
        if(getAccountByCardId(cardId)!=null)
            return generateCardId();
        return cardId;
    }
    private Account getAccountByCardId(String CardId){
        for(Account account:accounts){
            if(account.getCardid().equals(CardId))
                return account;
        }
        return null;
    }
    private void login(){
        System.out.println("=======用户登录=======");
        if(accounts.size()==0) {
            System.out.println("无用户，请先开户");
            return;
        }
        while(true){
            System.out.println("请输入卡号：");
            String cardID=scanner.next();
            Account account=getAccountByCardId(cardID);
            if(account==null)
                System.out.println("卡号不存在");
            else {
                System.out.println("请输入密码：");
                String password=scanner.next();
                if(password.equals(account.getPassword())){
                    loginaccount=account;
                    System.out.println("登录成功，欢迎"+loginaccount.getName());
                    ShowUserUI();
                    return;
                }
                else
                    System.out.println("密码错误");
                }
        }
    }
    public void ShowUserUI(){
        while (true) {
            System.out.println("=======用户操作=======");
            System.out.println("当前用户:"+loginaccount.getName());
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择：");
            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                    ShowUserInfo();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    updatePassword();
                    return;
                case 6:
                    System.out.println("退出成功");
                    return;
                case 7:
                    if(deleteAccount())
                        return;
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }
    public void ShowUserInfo(){
        System.out.println("=======用户信息=======");
        System.out.println("姓名："+loginaccount.getName());
        System.out.println("性别："+loginaccount.getSex());
        System.out.println("卡号："+loginaccount.getCardid());
        System.out.println("余额："+loginaccount.getMoney());
        System.out.println("取现额度："+loginaccount.getLimit());
    }
    public void deposit(){
        System.out.println("=======存款=======");
        System.out.println("请输入存款金额，输入0取消：");
        double money=scanner.nextDouble();
        if(money<=0)
            return;
        else {
            loginaccount.setMoney(loginaccount.getMoney() + money);
            System.out.println("存款成功，当前余额：" + loginaccount.getMoney());
        }
    }
    public void withdraw(){
        while (true) {
            System.out.println("=======取款=======");
            System.out.println("请输入取款金额，输入0取消：");
            double money=scanner.nextDouble();
            if(money==0)
                break;
            else {
                if (money > loginaccount.getMoney())
                    System.out.println("余额不足");
                else if (money > loginaccount.getLimit())
                    System.out.println("超过取现额度，当前额度："+loginaccount.getLimit());
                else {
                    loginaccount.setMoney(loginaccount.getMoney() - money);
                    System.out.println("取款成功，当前余额：" + loginaccount.getMoney());
                    break;
                }
            }
        }
    }
    public void transferMoney(){
        while (true) {
            System.out.println("=======转账=======");
            if(accounts.size()<2){
                System.out.println("无法转账，用户数不足");
                return;
            }
            if(loginaccount.getMoney()<=0)
            {
                System.out.println("余额不足，无法转账");
                return;
            }
            System.out.println("请输入对方卡号：");
            String cardId=scanner.next();
            Account account2=getAccountByCardId(cardId);
            if(account2==null){
                System.out.println("卡号不存在，请重新输入");
                continue;
            }
            System.out.println("请输入对方姓氏：*"+account2.getName().substring(1));
            char firstName=scanner.next().charAt(0);
            if(firstName==account2.getName().charAt(0)) {
                while (true) {
                    System.out.println("请输入转账金额：");
                    double money=scanner.nextDouble();
                    if(money>loginaccount.getMoney())
                        System.out.println("余额不足");
                    else {
                        loginaccount.setMoney(loginaccount.getMoney() - money);
                        account2.setMoney(account2.getMoney() + money);
                        System.out.println("转账成功，当前余额：" + loginaccount.getMoney());
                        return;
                    }
                }
            }
            else
                System.out.println("姓名不匹配，请重新输入");
        }
    }
    public Boolean deleteAccount(){
        System.out.println("=======注销账户=======");
        System.out.println(loginaccount.getName()+"，您确定要注销账户"+loginaccount.getCardid()+"吗？(Y/N)");
        String choice=scanner.next();
        switch(choice)
        {
            case "Y":
                if(loginaccount.getMoney()>0)
                {
                    System.out.println("账户余额不为0，无法注销");
                    return false;
                }
                else {
                    accounts.remove(loginaccount);
                    System.out.println("注销成功");
                    return true;
                }
            default:
                System.out.println("取消注销");
                return false;
        }
    }
    public void updatePassword(){
        while (true) {
            System.out.println("=======修改密码=======");
            System.out.println("请输入当前密码：");
            String tocheckpassword=scanner.next();
            if(tocheckpassword.equals(loginaccount.getPassword())){
                while(true){
                    System.out.println("请输入新密码：");
                    String newpassword=scanner.next();
                    System.out.println("请再次输入新密码：");
                    String newpassword2=scanner.next();
                    if(newpassword.equals(newpassword2)){
                        loginaccount.setPassword(newpassword);
                        System.out.println("修改成功！");
                        return;
                    }
                    else {
                        System.out.println("两次密码不一致，请重新输入！");
                    }
                }
            }
            else{
                System.out.println("密码错误！");
            }
        }
    }
}
