package entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Productos implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_prod;
	
	@Column(name = "nom_prod", nullable = false)
	private String nom_prod;
	
	@Column(name = "precio", nullable = false)
	private int precio;
	
	@Column(name = "stock_actual", nullable = false)
	private int stock_actual;
}
