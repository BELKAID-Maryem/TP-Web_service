import ws.BanqueServise;
import ws.BanqueWS;
import ws.Compte;

import java.util.List;

public class CientWS {
    public static void main(String[] args) {
        BanqueServise stubWS=new BanqueWS().getBanqueServisePort();
        System.out.println(stubWS.conversionEuroToDH(1000));
        Compte cp= stubWS.getCompte(2L);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte> cptes=stubWS.listeComptes();
        cptes.forEach(c->{
                    System.out.println("##########");
                    System.out.println(c.getCode());
                    System.out.println(c.getSolde());
                });
    }
}
