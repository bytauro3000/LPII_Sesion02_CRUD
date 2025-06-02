package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Estudiante;

public class InsertaEst {

	EntityManagerFactory factory;
	EntityManager em;

	public void registrarEstudiante(Estudiante data) throws Exception {
		factory = Persistence.createEntityManagerFactory("LPII_Sesion03_CRUD");
		em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
		System.out.println("Estudiante registrado correctamente");
		em.close();
		factory.close();
	}
	
	public static void main(String[] args) {
		InsertaEst p = new InsertaEst();
		try {
		Estudiante student = new Estudiante();
		student.setNombreApe("Roxana Campcha");
		student.setTipoDocumento("DNI");
		student.setNroDocumento("85632541");
		student.setTelefono("987563214");
		student.setCarrera("Cosmetologa");
		p.registrarEstudiante(student);
		
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
