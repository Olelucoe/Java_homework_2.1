public class Main {
    public static void main(String[] args) {
        int price = 8000; // стоимость билета в рублях
        int rub = 20; // стоимость одной бонусной мили в рублях
        int bonus = price / rub; // количество начисленных бонусных миль
        System.out.println(bonus);
    }
}
