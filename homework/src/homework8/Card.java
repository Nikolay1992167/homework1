package homework8;

public class Card {
    private int password;
    private int summoney;
    private String name;

    public Card(int password, int summoney, String name) {
        this.password = password;
        this.summoney = summoney;
        this.name = name;
    }

    public void increaseTheBalance(int money) {
        if (money < 0) {
            throw new ServiceException("Wrong summa money! Negative number");
        }
        this.summoney = summoney + money;
    }

    public void reduceTheBalance(int money) {
        if (money < 0) {
            throw new ServiceException("Wrong summa money! Negative number");
        }
        this.summoney = summoney - money;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getSummoney() {
        return summoney;
    }

    public void setSummoney(int summoney) {
        this.summoney = summoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
