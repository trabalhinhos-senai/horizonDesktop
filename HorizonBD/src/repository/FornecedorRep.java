/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import horizonbd.HorizonBD;
import java.util.List;
import model.Fornecedor_p;

/**
 *
 * @author Aluno
 */
public class FornecedorRep {

    public void addFornecedor(Fornecedor_p fornecedor) {

        HorizonBD.getEm().persist(fornecedor);

        HorizonBD.getEm().getTransaction().begin();
        HorizonBD.getEm().getTransaction().commit();
    }
    public void editFornecedor(Integer linha, String nome) {
//
//        HorizonBD.getEm().merge(fornecedor);
//
//        HorizonBD.getEm().getTransaction().begin();
//        HorizonBD.getEm().getTransaction().commit();
//        
        Fornecedor_p Fornecedor;
        HorizonBD.getEm().getTransaction().begin();

        Fornecedor = HorizonBD.getEm().find(Fornecedor_p.class, linha);
        
        Fornecedor.setNome_fornecedor(nome);
        
        HorizonBD.getEm().merge(Fornecedor);

        HorizonBD.getEm().getTransaction().commit();
    }
    
    public List<Fornecedor_p> getAll() {
        return HorizonBD.getEm().createQuery("select f from Fornecedor_p f").getResultList();
    }

    public void consultarPorId(Integer id) {
        //HorizonBD.getEm().getTransaction().begin();
        Fornecedor_p Fornecedor;

        //Consulta uma pessoa pelo seu ID.
        Fornecedor = HorizonBD.getEm().find(Fornecedor_p.class, id);
        HorizonBD.getEm().close();

    }

    public void excluirFornecedor(Integer linha) {
        Fornecedor_p Fornecedor;
        HorizonBD.getEm().getTransaction().begin();

        Fornecedor = HorizonBD.getEm().find(Fornecedor_p.class, linha);

        HorizonBD.getEm().remove(Fornecedor);

        HorizonBD.getEm().getTransaction().commit();
    }

//    public void salvarModif(Config config) {;
//        if (config.getId() > 0) {
//            HorizonBD.getEm().merge(config);
//        } else {
//            HorizonBD.getEm().persist(config);
//        }
//        
//        HorizonBD.getEm().getTransaction().begin();
//        HorizonBD.getEm().getTransaction().commit();        
//    }
//
//    public List<Config> listar() {
//        List<Config> config = new ArrayList<>();   
//        System.out.println("LOL");
//        return HorizonBD.getEm().createQuery("select c from Config c where c.id = 1").getResultList();
//    }
}
