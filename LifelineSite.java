public class LifelineSite extends Site{
    double _units;
    double _rate;
    public void LifelineSite(){
        _units = 1;
        _rate = 5;
    }

    @Override
    public double getBaseAmount(){

        double base = _units * _rate * 0.5;
        return base;

    }

    @Override
    public double getTaxAmount(){

        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;

    }
}
