package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food implements Discountable {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // яблоки - вегетарианские
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}