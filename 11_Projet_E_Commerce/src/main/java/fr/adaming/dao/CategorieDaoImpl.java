package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Categorie;

@Repository
public class CategorieDaoImpl implements ICategorieDao {

	@Autowired // injection du collaborateur sf
	private SessionFactory sf;

	// setter pour l'injection de dépendance
	public void setSf(SessionFactory sf) {
		this.sf = sf;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categorie> getAllCategories() {
		// recupérer la session hibernate
		Session s = sf.getCurrentSession();
		// construire la requete HQL
		String req = "FROM Categorie";

		Query query=s.createQuery(req);
	
		return query.list();
	}

	@Override
	public Categorie addCategorie(Categorie cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie updateCategorie(Categorie cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCategorie(int idCategorie) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Categorie getCategorieByIdOrName(Categorie cat) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
