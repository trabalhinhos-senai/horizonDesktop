package horizonbd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HorizonBD {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("HorizonBDPU");
    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        System.out.println("test");
    }
    public static EntityManager getEm() {
        return em;
    }   
}
