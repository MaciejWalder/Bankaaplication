

public class User {

    private String name;
    private String surename;
    private String login;
    private int pesel;
    private int accaunt;
    private double balance ;

    public User(String name,String surename, int pesel){
        this.name=name;
        this.surename =surename;
        this.pesel=pesel;
        this.loginGenerator(name, surename);
        this.balance=100;
        this.accaunt =1;

    }

    public String loginGenerator(String name, String surename) {
        return(name.substring(0,3)+surename.substring(0,3));

    }


}




