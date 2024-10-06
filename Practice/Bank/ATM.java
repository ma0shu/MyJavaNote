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
            System.out.println("=======��ӭʹ��ATM=======");
            System.out.println("1.�û���¼");
            System.out.println("2.�û�����");
            System.out.println("��ѡ��");
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
                    System.out.println("�������");
            }
        }
    }
    private void createAccount(){
        System.out.println("=======�û�����=======");
        Account account=new Account();
        System.out.println("�������û�����");
        String name=scanner.next();
        account.setName(name);
        while (true) {
            System.out.println("���������룺");
            String password=scanner.next();
            System.out.println("���ٴ��������룺");
            String password2=scanner.next();
            if(password.equals(password2)) {
                account.setPassword(password);
                break;
            }
            else {
                System.out.println("�������벻һ��");
            }
        }
        while (true) {
            System.out.println("�������Ա�");
            char sex = scanner.next().charAt(0);
            if (sex == '��' || sex == 'Ů') {
                account.setSex(sex);
                break;
            } else
                System.out.println("�������");
        }
        System.out.println("������ȡ�ֶ�ȣ�");
        double limit=scanner.nextDouble();
        account.setLimit(limit);
        String cardId=generateCardId();
        account.setCardid(cardId);
        accounts.add(account);
        System.out.println("�����ɹ�������Ϊ��"+account.getCardid());
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
        System.out.println("=======�û���¼=======");
        if(accounts.size()==0) {
            System.out.println("���û������ȿ���");
            return;
        }
        while(true){
            System.out.println("�����뿨�ţ�");
            String cardID=scanner.next();
            Account account=getAccountByCardId(cardID);
            if(account==null)
                System.out.println("���Ų�����");
            else {
                System.out.println("���������룺");
                String password=scanner.next();
                if(password.equals(account.getPassword())){
                    loginaccount=account;
                    System.out.println("��¼�ɹ�����ӭ"+loginaccount.getName());
                    ShowUserUI();
                    return;
                }
                else
                    System.out.println("�������");
                }
        }
    }
    public void ShowUserUI(){
        while (true) {
            System.out.println("=======�û�����=======");
            System.out.println("��ǰ�û�:"+loginaccount.getName());
            System.out.println("1.��ѯ");
            System.out.println("2.���");
            System.out.println("3.ȡ��");
            System.out.println("4.ת��");
            System.out.println("5.�޸�����");
            System.out.println("6.�˳�");
            System.out.println("7.ע���˻�");
            System.out.println("��ѡ��");
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
                    System.out.println("�˳��ɹ�");
                    return;
                case 7:
                    if(deleteAccount())
                        return;
                    break;
                default:
                    System.out.println("�������");
            }
        }
    }
    public void ShowUserInfo(){
        System.out.println("=======�û���Ϣ=======");
        System.out.println("������"+loginaccount.getName());
        System.out.println("�Ա�"+loginaccount.getSex());
        System.out.println("���ţ�"+loginaccount.getCardid());
        System.out.println("��"+loginaccount.getMoney());
        System.out.println("ȡ�ֶ�ȣ�"+loginaccount.getLimit());
    }
    public void deposit(){
        System.out.println("=======���=======");
        System.out.println("�������������0ȡ����");
        double money=scanner.nextDouble();
        if(money<=0)
            return;
        else {
            loginaccount.setMoney(loginaccount.getMoney() + money);
            System.out.println("���ɹ�����ǰ��" + loginaccount.getMoney());
        }
    }
    public void withdraw(){
        while (true) {
            System.out.println("=======ȡ��=======");
            System.out.println("������ȡ�������0ȡ����");
            double money=scanner.nextDouble();
            if(money==0)
                break;
            else {
                if (money > loginaccount.getMoney())
                    System.out.println("����");
                else if (money > loginaccount.getLimit())
                    System.out.println("����ȡ�ֶ�ȣ���ǰ��ȣ�"+loginaccount.getLimit());
                else {
                    loginaccount.setMoney(loginaccount.getMoney() - money);
                    System.out.println("ȡ��ɹ�����ǰ��" + loginaccount.getMoney());
                    break;
                }
            }
        }
    }
    public void transferMoney(){
        while (true) {
            System.out.println("=======ת��=======");
            if(accounts.size()<2){
                System.out.println("�޷�ת�ˣ��û�������");
                return;
            }
            if(loginaccount.getMoney()<=0)
            {
                System.out.println("���㣬�޷�ת��");
                return;
            }
            System.out.println("������Է����ţ�");
            String cardId=scanner.next();
            Account account2=getAccountByCardId(cardId);
            if(account2==null){
                System.out.println("���Ų����ڣ�����������");
                continue;
            }
            System.out.println("������Է����ϣ�*"+account2.getName().substring(1));
            char firstName=scanner.next().charAt(0);
            if(firstName==account2.getName().charAt(0)) {
                while (true) {
                    System.out.println("������ת�˽�");
                    double money=scanner.nextDouble();
                    if(money>loginaccount.getMoney())
                        System.out.println("����");
                    else {
                        loginaccount.setMoney(loginaccount.getMoney() - money);
                        account2.setMoney(account2.getMoney() + money);
                        System.out.println("ת�˳ɹ�����ǰ��" + loginaccount.getMoney());
                        return;
                    }
                }
            }
            else
                System.out.println("������ƥ�䣬����������");
        }
    }
    public Boolean deleteAccount(){
        System.out.println("=======ע���˻�=======");
        System.out.println(loginaccount.getName()+"����ȷ��Ҫע���˻�"+loginaccount.getCardid()+"��(Y/N)");
        String choice=scanner.next();
        switch(choice)
        {
            case "Y":
                if(loginaccount.getMoney()>0)
                {
                    System.out.println("�˻���Ϊ0���޷�ע��");
                    return false;
                }
                else {
                    accounts.remove(loginaccount);
                    System.out.println("ע���ɹ�");
                    return true;
                }
            default:
                System.out.println("ȡ��ע��");
                return false;
        }
    }
    public void updatePassword(){
        while (true) {
            System.out.println("=======�޸�����=======");
            System.out.println("�����뵱ǰ���룺");
            String tocheckpassword=scanner.next();
            if(tocheckpassword.equals(loginaccount.getPassword())){
                while(true){
                    System.out.println("�����������룺");
                    String newpassword=scanner.next();
                    System.out.println("���ٴ����������룺");
                    String newpassword2=scanner.next();
                    if(newpassword.equals(newpassword2)){
                        loginaccount.setPassword(newpassword);
                        System.out.println("�޸ĳɹ���");
                        return;
                    }
                    else {
                        System.out.println("�������벻һ�£����������룡");
                    }
                }
            }
            else{
                System.out.println("�������");
            }
        }
    }
}
