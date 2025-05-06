package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {

    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // Общая сумма со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double price = item.getAmount() * item.getPrice();
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            total += price * (1 - discount / 100);
        }
        return total;
    }

    // Общая сумма всех вегетарианских продуктов без скидки
    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}