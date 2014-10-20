package pl.us.obslugaZamowienBl;

import org.hibernate.cfg.Environment;
import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by kuba
 */
public abstract class SpringConf {

    private String[] paczkaDomainScan;

    public SpringConf(String[] paczkaDomainScan) {
        this.paczkaDomainScan = paczkaDomainScan;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() {
        return  new LocalContainerEntityManagerFactoryBean().getObject();
    }

    @Bean()
    public DataSource getDataSource() {
        return new DriverManagerDataSource();
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(getDataSource());
        localSessionFactoryBean.setHibernateProperties(getHibernateProperties());
        localSessionFactoryBean.setPackagesToScan(paczkaDomainScan);
        return localSessionFactoryBean;
    }

    public Properties getHibernateProperties() {
        return new Properties();
    }
}

