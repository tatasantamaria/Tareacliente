package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="Cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
    private int Iden;
    
    @Column(name="Nombre", length = 40)
    private String nom;
    
    @Column(name="Apellido", length = 40)
    private String ape;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Fecha;
    
    @Column(name="Ciudad", length = 40)
    private String ciu;
    
    @Column(name="Mail", length = 40)
    private String mail;

    @Column(name="Telefono", length = 40)
    private long tel;
    
    @Column(name="Ocupacion", length = 40)
    private String ocu;
    
    @Column(name="Estado", length = 40)
    private String est;

	public int getIden() {
		return Iden;
	}

	public void setIden(int iden) {
		Iden = iden;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getCiu() {
		return ciu;
	}

	public void setCiu(String ciu) {
		this.ciu = ciu;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public String getOcu() {
		return ocu;
	}

	public void setOcu(String ocu) {
		this.ocu = ocu;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getEst() {
		return est;
	}

	public void setEst(String est) {
		this.est = est;
	}

}


	
	
	
	