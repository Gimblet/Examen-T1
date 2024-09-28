package entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int id_cliente;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
}
