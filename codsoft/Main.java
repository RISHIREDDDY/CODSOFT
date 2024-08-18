package codsoft;

public class Main {
    public static void main(String[] args)
    {
        BankAccount BALANCE_OBJ = new BankAccount(3423);
        ATM ATM_OBJ = new ATM(BALANCE_OBJ);
        ATM_OBJ.showMenu();

    }
}
