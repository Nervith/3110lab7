public class ResidentialSite{
    public double getBillableAmount(){
        double _units = 1;
        double _rate = 5;
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
