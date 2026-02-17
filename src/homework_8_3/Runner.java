package homework_8_3;

public class Runner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("srednyaya", new String[]{"sir", "pepperoni"});
        Pizza p2 = new Pizza("bolshaya", new String[]{"griby"});
        Pizza p3 = new Pizza("malenkaya", new String[]{"loshad", "Moloko","Yabloko"});
        Pizza[] pizzas = {p1, p2, p3};
        Order order = new Order("EsebiGAga", pizzas);
        order.printCheck();
    }
}
