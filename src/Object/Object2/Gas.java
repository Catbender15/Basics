package Object.Object2;

public class Gas {
    private double litrai;
    private double price;

    public Gas(double litrai, double price) {
        this.litrai = litrai;
        this.price = price;
    }

    public double getLitrai() {
        return litrai;
    }

    public double getPrice() {
        return price;
    }
    public double getTotalprice() {return  price * litrai;}


}
