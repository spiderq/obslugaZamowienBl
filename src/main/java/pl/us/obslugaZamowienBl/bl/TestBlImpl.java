package pl.us.obslugaZamowienBl.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pl.us.obslugaZamowienBl.dao.TestDao;
import pl.us.obslugaZamowienBl.domain.TestDomain;

/**
 * Created by kuba
 */
@Service("TestBl")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TestBlImpl implements TestBl {

    @Autowired
    TestDao dao;


    @Override
    public TestDomain getDomain(String param) {
        return dao.getDomain(param);
    }
}
