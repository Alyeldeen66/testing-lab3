public class Main {
    public static void main(String[] args) {
    coffeeMachine c1 = new coffeeMachine();
    c1.openMachine();
    c1.addMoney(20);
        System.out.println(c1.makeCoffee(5));
    }
}
