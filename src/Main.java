public class Main {
    public static void main(String[] args) {
        int startingAccount = 2000;
        int income = 4000;
        int bonus = 100;

        if(startingAccount > 1000) {
            int finalBonus = income / bonus;
            int finalAccount = startingAccount + income + finalBonus;
            System.out.println(finalBonus);
            System.out.println(finalAccount);
        } else {
            int finalBonus = 0;
            int finalAccount = startingAccount + income;
            System.out.println(finalBonus);
            System.out.println(finalAccount);
        }
    }
}
