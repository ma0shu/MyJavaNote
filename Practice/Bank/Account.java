package Practice.Bank;

public class Account {
    private String Cardid;
    private String Name;
    private char Sex;
    private String Password;
    private double Money;
    private double limit;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCardid() {
        return Cardid;
    }

    public void setCardid(String cardid) {
        Cardid = cardid;
    }

    public char getSex() {
        return Sex;
    }

    public void setSex(char sex) {
        Sex = sex;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
