public class Main {
    public static void main(String[] args) {
        Slice_o_Heaven pizzeria = new Slice_o_Heaven("Slice - o - Heaven", "***City", "12345678@qq.com", 123456789L, "***");
        pizzeria.pizzaPrice = 10.0;
        pizzeria.takeOrder();
        pizzeria.specialOfTheDay("111", "Coke", "$10.00");
    }
    
}
