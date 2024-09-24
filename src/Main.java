//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cardBalance = 5000;
        double interestRate = 0.17;
        double interestRateOne = cardBalance * interestRate;
        double monthOne = cardBalance + interestRateOne;
        double interestRateTwo = monthOne * interestRate;
        double monthTwo = monthOne + interestRateTwo;
        System.out.println("You owe $" + monthOne + " for your first month");
        System.out.println("You owe $" + monthTwo + " for your second month");
    }
}