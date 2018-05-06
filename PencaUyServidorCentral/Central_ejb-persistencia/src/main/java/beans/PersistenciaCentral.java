package beans;

import beans.interfaces.PersistenciaCentralLocal;
import beans.interfaces.PersistenciaCentralRemote;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Session Bean implementation class PersistenciaCentral
 */
@Singleton
@Startup
public class PersistenciaCentral implements PersistenciaCentralRemote, PersistenciaCentralLocal {

    /**
     * Default constructor. 
     */
    public PersistenciaCentral() {
        
    }
    
    @PostConstruct
    public void inicializaciones() {
    	
    }

}
