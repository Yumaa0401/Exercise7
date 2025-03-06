import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Slice_o_Heaven {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;
    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public static final double DEF_ORDER_TOTAL = 15.00;
    public static final long BLACKLISTED_NUMBER = 12345678901234L;

    public Slice_o_Heaven() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = null;
        this.drinks = null;
    }

    public Slice_o_Heaven(String storeName, String storeAddress, String storeEmail, long storePhone, String storeMenu, String orderID, String pizzaIngredients, double orderTotal) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        this.storeMenu = storeMenu;
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }

    public Slice_o_Heaven(String storeName, String storeAddress, String storeEmail, long storePhone, String storeMenu) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        this.storeMenu = storeMenu;
    }

    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        String ing1, ing2, ing3;
        int ingChoice1 = 0, ingChoice2 = 0, ingChoice3 = 0;
        boolean validIngredients = false;
        while (!validIngredients) {
            System.out.println("Please pick any three of the following ingredients:");
            System.out.println("1. Mushroom");
            System.out.println("2. Paprika");
            System.out.println("3. Sun - dried tomatoes");
            System.out.println("4. Chicken");
            System.out.println("5. Pineapple");
            System.out.println("Enter any three choices (1, 2, 3,…) separated by spaces:");
            ingChoice1 = scanner.nextInt();
            ingChoice2 = scanner.nextInt();
            ingChoice3 = scanner.nextInt();
            if ((ingChoice1 >= 1 && ingChoice1 <= 5) && (ingChoice2 >= 1 && ingChoice2 <= 5) && (ingChoice3 >= 1 && ingChoice3 <= 5)) {
                validIngredients = true;
            } else {
                System.out.println("Invalid choice(s). Please pick only from the given list:");
            }
        }
        switch (ingChoice1) {
            case 1:
                ing1 = "Mushroom";
                break;
            case 2:
                ing1 = "Paprika";
                break;
            case 3:
                ing1 = "Sun - dried tomatoes";
                break;
            case 4:
                ing1 = "Chicken";
                break;
            case 5:
                ing1 = "Pineapple";
                break;
            default:
                ing1 = "";
        }
        switch (ingChoice2) {
            case 1:
                ing2 = "Mushroom";
                break;
            case 2:
                ing2 = "Paprika";
                break;
            case 3:
                ing2 = "Sun - dried tomatoes";
                break;
            case 4:
                ing2 = "Chicken";
                break;
            case 5:
                ing2 = "Pineapple";
                break;
            default:
                ing2 = "";
        }
        switch (ingChoice3) {
            case 1:
                ing3 = "Mushroom";
                break;
            case 2:
                ing3 = "Paprika";
                break;
            case 3:
                ing3 = "Sun - dried tomatoes";
                break;
            case 4:
                ing3 = "Chicken";
                break;
            case 5:
                ing3 = "Pineapple";
                break;
            default:
                ing3 = "";
        }
        this.pizzaIngredients = ing1 + ", " + ing2 + ", " + ing3;

        int sizeChoice = 0;
        String pizzaSize;
        boolean validSize = false;
        while (!validSize) {
            System.out.println("What size should your pizza be?");
            System.out.println("1. Large");
            System.out.println("2. Medium");
            System.out.println("3. Small");
            System.out.println("Enter only one choice (1, 2, or 3):");
            sizeChoice = scanner.nextInt();
            if (sizeChoice >= 1 && sizeChoice <= 3) {
                validSize = true;
            } else {
                System.out.println("Invalid choice. Please pick from the given list.");
            }
        }
        switch (sizeChoice) {
            case 1:
                pizzaSize = "Large";
                break;
            case 2:
                pizzaSize = "Medium";
                break;
            case 3:
                pizzaSize = "Small";
                break;
            default:
                pizzaSize = "";
        }

        System.out.println("Do you want extra cheese (Y/N):");
        String extraCheese = scanner.next();

        int sideDishChoice = 0;
        String sideDish;
        boolean validSideDish = false;
        while (!validSideDish) {
            System.out.println("Following are the side dish that go well with your pizza:");
            System.out.println("1. Calzone");
            System.out.println("2. Garlic bread");
            System.out.println("3. Chicken puff");
            System.out.println("4. Muffin");
            System.out.println("5. Nothing for me");
            System.out.println("What would you like? Pick one (1, 2, 3,…):");
            sideDishChoice = scanner.nextInt();
            if (sideDishChoice >= 1 && sideDishChoice <= 5) {
                validSideDish = true;
            } else {
                System.out.println("Invalid choice. Please pick from the given list.");
            }
        }
        switch (sideDishChoice) {
            case 1:
                sideDish = "Calzone";
                break;
            case 2:
                sideDish = "Garlic bread";
                break;
            case 3:
                sideDish = "Chicken puff";
                break;
            case 4:
                sideDish = "Muffin";
                break;
            case 5:
                sideDish = "Nothing for me";
                break;
            default:
                sideDish = "";
        }
        this.sides = sideDish;

        int drinkChoice = 0;
        boolean validDrink = false;
        while (!validDrink) {
            System.out.println("Choose from one of the drinks below. We recommend Coca Cola:");
            System.out.println("1. Coca Cola");
            System.out.println("2. Cold coffee");
            System.out.println("3. Cocoa Drink");
            System.out.println("4. No drinks for me");
            System.out.println("Enter your choice:");
            drinkChoice = scanner.nextInt();
            if (drinkChoice >= 1 && drinkChoice <= 4) {
                validDrink = true;
            } else {
                System.out.println("Invalid choice. Please pick from the given list.");
            }
        }
        switch (drinkChoice) {
            case 1:
                this.drinks = "Coca Cola";
                break;
            case 2:
                this.drinks = "Cold coffee";
                break;
            case 3:
                this.drinks = "Cocoa Drink";
                break;
            case 4:
                this.drinks = "No drinks for me";
                break;
            default:
                this.drinks = "";
        }

        System.out.println("Would you like the chance to pay only half for your order? (Y/N):");
        String wantDiscount = scanner.next();

        this.orderTotal = pizzaPrice;
        if (!this.sides.equals("Nothing for me")) {
            orderTotal += 10;
        }
        if (!this.drinks.equals("No drinks for me")) {
            orderTotal += 5;
        }
        if (extraCheese.equalsIgnoreCase("Y")) {
            orderTotal += 3;
        }

        System.out.println("Order " + orderID + " accepted!");
        makePizza();

        if (wantDiscount.equalsIgnoreCase("Y")) {
            isItYourBirthday();
        } else {
            makeCardPayment();
        }
        System.out.println(this);
    }

    public void makePizza() {
        System.out.println("Making pizza with " + pizzaIngredients);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.println("Pizza making was interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
        System.out.println("Pizza is ready!");
    }

    public String toString() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("********RECEIPT********\n");
        receipt.append("Store Name: ").append(storeName).append("\n");
        receipt.append("Order ID: ").append(orderID).append("\n");
        receipt.append("Pizza Ingredients: ").append(pizzaIngredients).append("\n");
        if (!sides.equals("Nothing for me")) {
            receipt.append("Sides: ").append(sides).append("\n");
        }
        if (!drinks.equals("No drinks for me")) {
            receipt.append("Drinks: ").append(drinks).append("\n");
        }
        receipt.append("Order Total: $").append(orderTotal).append("\n");
        receipt.append("***********************");
        return receipt.toString();
    }

    public void processCardPayment(long cardNumber, String expiryDate, int cvv) {
        String cardStr = Long.toString(cardNumber);
        int cardLength = cardStr.length();
        while (cardLength != 14 || cardNumber == BLACKLISTED_NUMBER) {
            System.out.println("Invalid card number. Please enter a 14 - digit non - blacklisted card number:");
            Scanner scanner = new Scanner(System.in);
            cardNumber = scanner.nextLong();
            cardStr = Long.toString(cardNumber);
            cardLength = cardStr.length();
        }
        System.out.println("Card accepted");

        int firstCardDigit = Integer.parseInt(cardStr.substring(0, 1));
        System.out.println("First digit of the card: " + firstCardDigit);

        int lastFourDigits = Integer.parseInt(cardStr.substring(cardLength - 4));
        System.out.println("Last four digits of the card: " + lastFourDigits);

        String cardNumberToDisplay = cardStr.charAt(0) +
                "*".repeat(cardLength - 5) +
                cardStr.substring(cardLength - 4);
        System.out.println("Card number to display: " + cardNumberToDisplay);
    }

    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        StringBuilder special = new StringBuilder();
        special.append("Today's Special:\n")
               .append("Pizza: ").append(pizzaOfTheDay).append("\n")
               .append("Side: ").append(sideOfTheDay).append("\n")
               .append("Price: ").append(specialPrice).append("\n");
        System.out.println(special.toString());
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void isItYourBirthday() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date birthdate = null;
        boolean validDate = false;
        while (!validDate) {
            System.out.println("Enter your birthday (MM/dd/yyyy):");
            String birthdateStr = scanner.next();
            try {
                birthdate = sdf.parse(birthdateStr);
                Calendar cal = Calendar.getInstance();
                int currentYear = cal.get(Calendar.YEAR);
                cal.setTime(birthdate);
                int birthYear = cal.get(Calendar.YEAR);
                int age = currentYear - birthYear;
                if (age < 5 || age > 120) {
                    System.out.println("Invalid date. You are either too young or too dead to order.");
                    System.out.println("Please enter a valid date:");
                } else {
                    validDate = true;
                }
            } catch (ParseException e) {
                System.err.println("Invalid date format. Please use MM/dd/yyyy.");
            }
        }

        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH) + 1;
        int currentDay = cal.get(Calendar.DAY_OF_MONTH);

        cal.setTime(birthdate);
        int birthYear = cal.get(Calendar.YEAR);
        int birthMonth = cal.get(Calendar.MONTH) + 1;
        int birthDay = cal.get(Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        if (age < 18 && currentMonth == birthMonth && currentDay == birthDay) {
            System.out.println("Congratulations! You pay only half the price for your order");
            orderTotal /= 2;
        } else {
            System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
        }
        makeCardPayment();
    }

    public void makeCardPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card number:");
        long cardNumber = scanner.nextLong();
        System.out.println("Enter the card’s expiry date (MM/yyyy):");
        String expiryDate = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        Date currentDate = new Date();
        boolean validExpiry = false;
        while (!validExpiry) {
            try {
                Date expDate = sdf.parse(expiryDate);
                if (expDate.before(currentDate)) {
                    System.out.println("Invalid expiry date. Please enter a future date:");
                    expiryDate = scanner.next();
                } else {
                    validExpiry = true;
                }
            } catch (ParseException e) {
                System.err.println("Invalid date format. Please use MM/yyyy.");
                expiryDate = scanner.next();
            }
        }
        System.out.println("Enter the card’s cvv number:");
        int cvv = scanner.nextInt();
        processCardPayment(cardNumber, expiryDate, cvv);
    }

    public static void main(String[] args) {
        Slice_o_Heaven pizzeria = new Slice_o_Heaven("Slice - o - Heaven", "***City", "12345678@qq.com", 123456789L, "***");
        pizzeria.pizzaPrice = 10.0;
        pizzeria.takeOrder();
        pizzeria.specialOfTheDay("111", "Coke", "$10.00");
    }
}

class UserAuthentication {

    private String username = "SuperUser";
    private String suppliedUsername;

    public UserAuthentication(String username) {
        suppliedUsername = username;
    }

    public void authenticate() {
        if (suppliedUsername.equals(username)) {
            System.out.println("Username already exists. Choose a different username.");
        } else {
            System.out.println("A new user has been created with the username " + suppliedUsername);
        }

        if (suppliedUsername == username) {
            System.out.println("Same memory location");
        } else {
            System.out.println("Different memory location");
        }
    }
}