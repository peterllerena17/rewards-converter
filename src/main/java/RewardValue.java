public class RewardValue {

    int cash;
    double miles;

    public RewardValue(int cash) {
        this.cash = cash;
    }
    public RewardValue(double miles){
        this.miles = miles;
    }

    public int getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles * 0.0035;
    }
}
