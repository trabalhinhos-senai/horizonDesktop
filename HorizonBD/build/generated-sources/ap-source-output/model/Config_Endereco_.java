package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cidade;
import model.Config;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Config_Endereco.class)
public class Config_Endereco_ { 

    public static volatile SingularAttribute<Config_Endereco, Config> configurcao;
    public static volatile SingularAttribute<Config_Endereco, Cidade> cidade;
    public static volatile SingularAttribute<Config_Endereco, String> endereco_config;
    public static volatile SingularAttribute<Config_Endereco, String> bairro_config;
    public static volatile SingularAttribute<Config_Endereco, Integer> ID;

}