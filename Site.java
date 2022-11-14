import java.net.http.HttpResponse;
//Nitin Alagu 101190100
public class Site {
    public static final double TAX_RATE = 0.5;

    public static void main(String[] args) {
        ResidentialSite resSite = new ResidentialSite();
        Double residential = resSite.getBillableAmount();

        LifelineSite lifSite = new LifelineSite();
        Double life = lifSite.getBillableAmount();

    }

    
}
