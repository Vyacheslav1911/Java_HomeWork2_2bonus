public class PayBonus {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1_600;
        int bonus = 0;
        if (deposit > 1_000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int result = balance + deposit + bonus;

        System.out.println("Итоговый счет: " + result + " руб. Бонус: " + bonus + " руб.");
    }
}