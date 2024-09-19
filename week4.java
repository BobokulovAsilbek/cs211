class HelloWorld {
    public static String removeDuplicates(String s){
        String a = ""; a += s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            Boolean c = true;
            for(int j = 0; j < a.length(); j++){
                if(a.charAt(j) == s.charAt(i)) c = false;
            }
            if(c == true) a += s.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s = "aabbcc";
        System.out.println(removeDuplicates(s));
    }
}

public class BankAccount {
    private double balance;
    private String accountNumber;
    BankAccount(String accountNumber, double balance){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
}

public class Customer {
    String name;
    BankAccount bankAccount;
    public Customer(String name, BankAccount bankAccount){
        this.name = name;
        this.bankAccount = bankAccount;
    }
    //
    public String getName(){
        return name;
    }
    public BankAccount getBankAccount(){
        return bankAccount;
    }
}

public class ATM {
    Customer currentCustomer;
    public void login(String accountNumber){
        if(accountNumber == this.currentCustomer.getBankAccount().getAccountNumber()){
            System.out.println("Successful login");
        }
        else{
            System.out.println("Wrong login");
        }
    }
    public void deposit(double amount){
        currentCustomer.getBankAccount().deposit(amount);
    }
    public void withdraw(double amount){
        currentCustomer.getBankAccount().withdraw(amount);
    }
    public double checkBalance(){
        return currentCustomer.getBankAccount().getBalance();
    }
    public void logout(){
        System.out.println("Successful logout");
        this.currentCustomer = null;

    }
    public void setCurrentAccount(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }
}


public class TicketMachine {

    private double balance, price;
    TicketMachine(double balance, double price){
        this.balance = balance;
        this.price = price;
    }
    public double getBalance(){
        return this.balance;
    }
    public void double getPrice(){
        return this.price;
    }
    public void insertMoney(double money){
        this.balance += money;
    }
    public void printTicket(){
        if(balance == price){
            System.out.println("Here is your ticket");
        }
        else{
            System.out.println("Incorrect");
        }
    }

}


class HelloWorld {
    public enum UserRole {
        USER(1),
        MODERATOR(2),
        ADMIN(3);
        
        private int permissionLevel;
        UserRole(int permissionLevel) {
            this.permissionLevel = permissionLevel;
        }
        public int getPermissionLevel() {
            return permissionLevel;
        }
    }
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        UserRole role = UserRole.USER;
        System.out.println(role.getPermissionLevel()); // Output: 2
    }
    /*
        String s = "aabbcc";
        System.out.println(removeDuplicates(s));
        */
        /*
        UserRole role = UserRole.USER;
        System.out.println(role.getPermissionLevel());
         */
        /*
        BankAccount myAccount = new BankAccount("123456", 100000);
        Customer customer = new Customer("John", myAccount);
        ATM atm = new ATM();
        atm.login("123456");
        atm.setCurrentAccount(customer);
        atm.deposit(100000);
        System.out.println("Current balance: " + atm.checkBalance());
        atm.logout();
        */
        TicketMachine user = new TicketMachine(0, 100);
        user.getBalance(10);
        System.out.println(user.printTicket());
}
