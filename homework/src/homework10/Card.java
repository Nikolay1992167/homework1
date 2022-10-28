package homework10;

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
        this.summoney += money;
    }

    public void reduceTheBalance(int money) {
        this.summoney -= money;
    }

    public int getPassword() {
        return this.password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getSummoney() {
        return this.summoney;
    }

    public void setSummoney(int summoney) {
        this.summoney = summoney;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

