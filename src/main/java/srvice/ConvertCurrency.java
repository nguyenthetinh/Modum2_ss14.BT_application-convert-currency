package srvice;

public class ConvertCurrency implements Currency {
    @Override
    public double currency(double rate , double usd) {
        double vnd=rate*usd;
        return vnd;
    }
}
