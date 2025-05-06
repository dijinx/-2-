import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        model.Food[] products = new model.Food[]{meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount());
    }

}