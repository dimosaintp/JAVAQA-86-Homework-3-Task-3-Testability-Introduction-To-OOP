//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int year1 = 1;
        int year2 = 2;
        int year3 = 3;
        int result1;
        int result2;
        int result3;
        int amount = 1_000_000;

        result1 = service.Credit(year1, amount);
        System.out.println("Ежемесячный платёж при сроке кредита 1 год: " +  result1);
        result2 = service.Credit(year2, amount);
        System.out.println("Ежемесячный платёж при сроке кредита 2 года: " + result2);
        result3 = service.Credit(year3, amount);
        System.out.println("Ежемесячный платёж при сроке кредита 3 года: " + result3);
    }
}