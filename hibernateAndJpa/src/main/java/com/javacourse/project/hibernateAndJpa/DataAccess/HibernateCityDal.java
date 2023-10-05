package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.javacourse.project.hibernateAndJpa.Entities.City;
//JPA - ORM 
@Repository
public class HibernateCityDal implements ICityDal {
	private  EntityManager entityManager;
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	//AOP - Aspect Oriented Programming
	@Override
	@Transactional
	public List<City> getAll() {
		
		Session session=entityManager.unwrap(Session.class);
	
		List<City> cities = session.createQuery("from City",City.class).getResultList();
		
		/*for(City city:cities) {
			System.out.println(city.getName());
		}
		*/
		
		return cities;
	}

	
	@SuppressWarnings("deprecation")
	@Override
	public void add(City city) {
		Session session= entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void update(City city) {
		Session session= entityManager.unwrap(Session.class);
		session.merge(city);
		
	}

	@Override
	public void delete(City city) {
		Session session= entityManager.unwrap(Session.class);
		City cityToDelete=session.get(City.class, city.getId());
		session.remove(cityToDelete);
		
	}
	@Override
	public City getbyId(int id) {
		Session session= entityManager.unwrap(Session.class);
		City city=session.get(City.class, id);
		return city;
	}

}
