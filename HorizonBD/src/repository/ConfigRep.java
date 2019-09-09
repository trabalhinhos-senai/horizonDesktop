package repository;
import horizonbd.HorizonBD;
import java.util.ArrayList;
import java.util.List;
import model.Config;

public class ConfigRep {

    public void salvarModif(Config config) {
        if (config.getId() > 0) {
            HorizonBD.getEm().merge(config);
        } else {
            HorizonBD.getEm().persist(config);
        }
        
        HorizonBD.getEm().getTransaction().begin();
        HorizonBD.getEm().getTransaction().commit();        
    }

    public List<Config> listar() {
        List<Config> config = new ArrayList<>();   
        System.out.println("LOL");
        return HorizonBD.getEm().createQuery("select c from Config c where c.id = 1").getResultList();
        
    }
}
