public class Main {
    public static void main(String[] args) {
        int account = 1600;
        int replenishment = 1300;

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
            int total = account + replenishment + bonus;
            System.out.println("Общий счет: " + total);
            System.out.println("Бонус: " + bonus);

        }
    }
