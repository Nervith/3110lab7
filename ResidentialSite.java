public class ResidentialSite extends Site {
    double _units;
    double _rate;

    public void ResidentialSite(){
        _units = 1;
        _rate = 5;
    }
    @Override
    public double getBaseAmount(){

        double base = _units * _rate;
        return base;

    }

    @Override
    public double getTaxAmount(){

        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE;
        return tax;

    }
}
