//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int account = 400;
        int topAmount = 2300;
        int oneBonus = 100;
        int totalBonus;
        int total;

        if (topAmount > 1000) {
            total = topAmount / oneBonus + (topAmount + account);
            totalBonus = topAmount / oneBonus;
        } else {
            total = topAmount + account;
            totalBonus = 0;
        }
        System.out.println("Количество бонусов: " + totalBonus);
        System.out.println("Итоговый счет: " + total);

    }
}