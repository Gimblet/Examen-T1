package entidad;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "detallefact")
public class Detallefact {
	
	@Id
	private int nro_factura;
	
	@Id
	private int id_prod;
	
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
}
