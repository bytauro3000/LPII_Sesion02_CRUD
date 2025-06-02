package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Estudiante;

public class BuscarEst {

	EntityManagerFactory factory;
	EntityManager em;
	Estudiante es;
	
	public void buscarTodos() {
		factory = Persistence.createEntityManagerFactory("LPII_Sesion03_CRUD");
		em = factory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Estudiante> q = em.createQuery("select e from Estudiante e", Estudiante.class);
		
		List<Estudiante> res = q.getResultList();
		
		for (Estudiante item : res) {
			System.out.println("IdEst: " + String.valueOf(item.getIdEst())+ ",nombreApe: "+ item.getNombreApe());
			
		}
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	public void buscarEstudianteById(int idEst) {
		factory = Persistence.createEntityManagerFactory("LPII_Sesion03_CRUD");
		em= factory.createEntityManager();
		em.getTransaction().begin();
		
		Estudiante e = em.find(Estudiante.class, idEst);
		
		if (e == null) {
			System.out.println("Estudiante con id: "+ String.valueOf(idEst)+ " no encontrado");
		}else {
			System.out.println("Estudiante con id: " + String.valueOf(idEst)+ " encontrado");
		}
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	public static void main(String[] args) {
		BuscarEst p = new BuscarEst();
		try {
			System.out.println("-------------- LISTA DE TODOS LOS ESTUDIANTES ---------");
			p.buscarTodos();
			System.out.println("");
			System.out.println("-------------- COMPROBACION DE ESTUDIANTE ----------");
			p.buscarEstudianteById(1);
			p.buscarEstudianteById(3);
			p.buscarEstudianteById(8);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
