package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Config;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-09T19:36:58")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, Config> configuracao;
    public static volatile SingularAttribute<Login, String> senha_login;
    public static volatile SingularAttribute<Login, String> usuario;
    public static volatile SingularAttribute<Login, Integer> id;
    public static volatile SingularAttribute<Login, Integer> permissao_login;

}