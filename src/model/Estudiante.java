package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="estudiantes")
@NamedQuery (name="Estudiante.findAll", query="SELECT e FROM Estudiante e")
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idEst;
	
	@Column (name = "carrera")
	private String carrera;
	
	@Column (name = "nombreApe")
	private String nombreApe;
	
	@Column (name = "nroDocumento")
	private String nroDocumento;
	
	@Column  (name= "telefono")
	private String telefono;
	
	@Column (name = "tipoDocumento")
	private String tipoDocumento;
	
	public Estudiante () {
		
	}

	public int getIdEst() {
		return idEst;
	}

	public void setIdEst(int idEst) {
		this.idEst = idEst;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getNombreApe() {
		return nombreApe;
	}

	public void setNombreApe(String nombreApe) {
		this.nombreApe = nombreApe;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumneto) {
		this.nroDocumento = nroDocumneto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
}
