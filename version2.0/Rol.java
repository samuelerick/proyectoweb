package pw2;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Rol {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idRol;
	
	@Persistent
	String rol;
	
	@Persistent
	boolean state;
	
	public Rol(){};
	public Rol(String rol){
		this.rol = rol;
	}

	public String getIdRol(){
		return KeyFactory.keyToString(idRol);
	}
	
	public void setIdRol(String idRol){
		Key keyCurso = KeyFactory.stringToKey(idRol);
		this.idRol = KeyFactory.createKey(keyCurso, Usuario.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}
	
	public String getRol(){
		return this.rol;
	}
	
	public void setRol(String rol){
		this.rol = rol;
	}
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	

}
