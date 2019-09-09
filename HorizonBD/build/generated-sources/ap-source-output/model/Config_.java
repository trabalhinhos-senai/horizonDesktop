package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Config_Contato;
import model.Config_Endereco;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Config.class)
public class Config_ { 

    public static volatile SingularAttribute<Config, Config_Endereco> config_Endereco;
    public static volatile SingularAttribute<Config, Config_Contato> config_contato;
    public static volatile SingularAttribute<Config, Integer> id;
    public static volatile SingularAttribute<Config, String> nome_empresa;

}