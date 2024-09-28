package Vista;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidad.EstadoFact;
import entidad.Factura;

public class registroApellido {

	EntityManagerFactory factory;
	EntityManager em;
	Factura factura;

	public void registrarEstudiante(Factura data) throws Exception {
		factory = Persistence.createEntityManagerFactory("Minimarket-MASS");
		em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
		em.close();
		factory.close();

		System.out.println("Factura registrada correctamente");
	}

	public static void main(String[] args) {
		registroApellido p = new registroApellido();
		try {
			Factura factura = new Factura();
			Date fecha = new Date(0);
			fecha = new Date(fecha.getDate());
			factura.setNro_factura(4);
			factura.setFecha(fecha);
			factura.setEstado(EstadoFact.EMITIDO);
			factura.setD_cliente(1);
			factura.setTotal(150);
			p.registrarEstudiante(factura);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
