package com.exempel;

public class Price extends Books{

    private int priceId;
    private double price;

    public Price(int bookId, String title, int priceId, double price) {
        super(bookId, title);

        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Price can not have a negative value");
        }
        this.priceId = priceId;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }else {
            System.out.println("The Price that you added have negative values, please try again!");
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "priceId=" + priceId +
                ", price=" + price +
                '}';
    }
}


