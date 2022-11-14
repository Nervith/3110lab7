import java.net.http.HttpResponse;

public class Site {
    public static final double TAX_RATE = 0.5;

    public static void main(String[] args) {
        ResidentialSite resSite = new ResidentialSite();
        Double residential = resSite.getBillableAmount();


        LifelineSite lifSite = new LifelineSite();
        Double life = lifSite.getBillableAmount();

    }

    
}
