package spring.boot.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class JPARepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;
	
	public String insert(User user) {
			
		entityManager.persist(user);
		return user.getName();
	}
}
