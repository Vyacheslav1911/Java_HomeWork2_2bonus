import java.sql.SQLOutput;

public class Pay_bonus {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1600;
        int bonus = 0;

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        balance = balance + deposit + bonus;

        System.out.println("Итоговый счет: " + balance + " руб. Бонус: " + bonus + " руб.");
    }
}