public class CreditPaymentService {
    public int Credit (int year, int amount ) {
        double percent_m, k, a, a1, b, b1;
        int month, x;
        double percent = 0.0999;
        percent_m = percent / 12; // считаем месячную процентную ставку
        month = year * 12; // срок кредита в месяцах
        /*
        К = (М * (1 + М) ^ S) / ((1 + М) ^ S — 1)
        а = (1 + М)
        а1 = (1 + М) ^ S)
        b = (1 + М)
        b1 = ((1 + М) ^ S — 1)
         */
        a = 1 + percent_m;
        a1 = Math.pow(a, month);
        b = 1 + percent_m;
        b1 = Math.pow(b, month);
        k = (percent_m * a1) / (b1 - 1);
        x = (int) (amount * k);
        return x;
    }
}
