package com.skilldistillery.jpacrud.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.jpacrud.entities.Center;

@Transactional
@Component
public class CenterDAOImpl implements CenterDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Center> getCenters() {
		String sql = "get c from Center c";
		List<Center> centers = new ArrayList<>();
		centers = em.createQuery(sql, Center.class).getResultList();

		return centers;
	}

	@Override
	public Center getCenterById(int id) {
		Center center = em.find(Center.class, id);

		return center;
	}

	@Override
	public Center addCenter(Center center) {
		em.getTransaction().begin();
		em.persist(center);
		em.flush();
		em.getTransaction().commit();
		return center;
	}

	@Override
	public boolean removeCenter(Center center) {
		em.getTransaction().begin();
		em.remove(center);
		em.flush();
		em.getTransaction().commit();
		if (em.contains(center)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Center updateCenter(Center center) {
		Center managed = em.find(Center.class, center.getId());
		em.getTransaction().begin();
		
		managed.setName(center.getName());
		managed.setDescription(center.getDescription());
		managed.setTradition(center.getTradition());
		managed.setAddress(center.getAddress());
		managed.setCity(center.getCity());
		managed.setState(center.getState());
		managed.setCountry(center.getCountry());
		managed.setPostalCode(center.getPostalCode());
		managed.setMap(center.getMap());
		
		em.flush();
		em.getTransaction().commit();

		return managed;
	}

}
