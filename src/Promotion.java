public interface Promotion {
    double apply(double price);
}

class DiscountPromotion implements Promotion {
    private final double discountPercent;

    public DiscountPromotion(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double apply(double price) {
        return price - (price * discountPercent / 100);
    }
}

//am folosit decoarator deoarece permite configurații de promovare dinamice și flexibile