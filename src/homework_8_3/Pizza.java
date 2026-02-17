package homework_8_3;

public class Pizza {
    String size;
    double price;
    String[] ingredients;

    public Pizza(String size, String[] ingredients) {
        this.size = size;
        this.ingredients = ingredients;
    }

    public double calculatePrice() {
        price = switch (size) {
            case "malenkaya" -> 300;
            case "srednyaya" -> 500;
            case "bolshaya" -> 700;
            default -> 0;
        };
        price += ingredients.length * 50;
        return price;
    }

    public void showOrder() {
        System.out.print(size + " [");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.print(ingredients[i]);
            System.out.print(" ");
        }
        System.out.println("] " + calculatePrice());
    }
}

class Order {
    String customerName;
    Pizza[] pizzas;

    public Order(String customerName, Pizza[] pizzas) {
        this.customerName = customerName;
        this.pizzas = pizzas;
    }

    public double totalPrice() {
        double total = 0;
        for (Pizza p : pizzas) {
            total += p.calculatePrice();
        }
        if (pizzas.length > 3) {
            total *= 0.9;
        }
        return total;
    }

    public void printCheck() {
        System.out.println(customerName);
        for (Pizza p : pizzas) {
            p.showOrder();
        }
        System.out.println(totalPrice());
    }
}

