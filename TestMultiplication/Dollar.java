public class Dollar {
    public Dollar(int amount) {
        this.amount= amount;
    }

    public void times(int multiplier) {
        amount= amount * multiplier;
    }

    public int amount;
}
