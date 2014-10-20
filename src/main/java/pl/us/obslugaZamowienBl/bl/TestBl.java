package pl.us.obslugaZamowienBl.bl;

import pl.us.obslugaZamowienBl.dao.TestDao;
import pl.us.obslugaZamowienBl.dao.TestDaoImpl;
import pl.us.obslugaZamowienBl.domain.TestDomain;

/**
 * Created by kuba
 */
public interface TestBl {
    public TestDomain getDomain(String param);

}
