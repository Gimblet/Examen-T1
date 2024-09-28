package entidad;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "factura")
public class Factura{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nro_factura;
	
	@Transient
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "iestado")
	private Enum<EstadoFact> estado;
	
	@Column(name = "d_cliente", nullable = false)
	private int d_cliente;
	
	@Column(name = "total", nullable = false)
	private int total;
}
