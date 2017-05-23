package pw2;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.datanucleus.annotations.Unowned;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Usuario {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idUsuario;
	
	@Persistent
	private String nombre;
	
	@Persistent
	private String apellido;
	
	@Persistent
	private String email;
	
	@Persistent 
	private boolean state;
	
	@Persistent
	@Unowned
	private String rol;
	
	public Usuario(){}
	public Usuario(String nombre,String apellido,String email,boolean state, String rol){
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.state = state;
		this.rol = rol;
		
	}
	
	public String getIdUsuario(){
		return KeyFactory.keyToString(idUsuario);
	}
	
	public void setIdUsuario(String idUsuario){
		Key keyUsuario = KeyFactory.stringToKey(idUsuario);
		this.idUsuario = KeyFactory.createKey(keyUsuario,Usuario.class.getSimpleName(),java.util.UUID.randomUUID().toString());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getRol(){
		return this.rol;
	}
	public void setRol(String rol){
		this.rol = rol;
	}
	

}
