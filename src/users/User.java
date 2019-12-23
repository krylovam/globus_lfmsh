package users;

public class User {
    private String FirstName;
    private String LastName;
    private String MiddleName;
    private String login;
    private String password;
    private int balance;


    static String Symbols = "abcdefghijklmnopqrstuvwxyz0123456789";
    static int initialBalance = 120;
    public static String generatePassword(){
        int n = 8;
        String newPassword = "";
        while (newPassword.length() <= n){
            newPassword += Symbols.charAt((int)(Math.random()*Symbols.length()));
        }
        return newPassword;
    }
    public User(String firstName, String lastName, String middleName) {
        FirstName = firstName;
        LastName = lastName;
        MiddleName = middleName;
        this.login = lastName.toLowerCase()+firstName.toLowerCase().charAt(0)+middleName.toLowerCase().charAt(0);
        this.password = generatePassword();
        this.balance = initialBalance;
        System.out.println(this.getFirstName()+" "+this.getLastName() +" is added\nlogin: "+this.getLogin()+"\npassword: "+this.getPassword());
    }
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
