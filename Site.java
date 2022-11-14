import java.net.http.HttpResponse;
//Nitin Alagu 101190100
abstract class Site{
    public static final double TAX_RATE = 0.5;
    Site resSite = new ResidentialSite();
    Double resSiteBillableAmount = resSite.getBillableAmount();

    Site lifSite = new LifelineSite();
    Double lifSiteBillableAmount = lifSite.getBillableAmount();

    public static void main(String[] args) {

        ResidentialSite resSite = new ResidentialSite();
        Double resSiteBillableAmount = resSite.getBillableAmount();

        LifelineSite lifSite = new LifelineSite();
        Double lifSiteBillableAmount = lifSite.getBillableAmount();

        System.out.println(resSiteBillableAmount);
        System.out.println(lifSiteBillableAmount);

    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    public double getTaxAmount(){
        return 0;
    }

    public double getBaseAmount(){
        return 0;
    }

    
}
