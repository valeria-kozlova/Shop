public class User {
    private String login;
    private String password;
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public Basket inTheBasket() {
        return Basket.purchasedGoods();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        System.out.println(login);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String setLoginAndPassword() {
        return "login: " + this.login + "\n" + "password: "+ this.password ;
    }
}
