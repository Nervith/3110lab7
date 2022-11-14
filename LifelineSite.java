public class LifelineSite{
    public double getBillableAmount(){
        double _units = 1;
        double _rate = 5;
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
