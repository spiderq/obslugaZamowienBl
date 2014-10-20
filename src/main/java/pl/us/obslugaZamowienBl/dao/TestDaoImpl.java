package pl.us.obslugaZamowienBl.dao;

import org.springframework.stereotype.Repository;
import pl.us.obslugaZamowienBl.domain.TestDomain;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by kuba
 */
@Repository("TestDao")
public class TestDaoImpl implements TestDao {
    @PersistenceContext
    private EntityManager em;


    @Override
    public TestDomain getDomain(String param) {
        String hql = "select t from TestDomain t where t.username=:param";
        Query query = em.createQuery(hql);
        query.setParameter("param", param);
        try {
            return (TestDomain) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
