package config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.hibernate.SessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.qfedu")
@MapperScan("com.qfedu.mapper")
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/hr?useUnicode=true&characterEncoding=utf8");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		dataSource.setMinIdle(10);
		dataSource.setInitialSize(10);
		dataSource.setMaxActive(100);
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		return bean.getObject();
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setPackagesToScan("com.qfedu.domain");
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		bean.setHibernateProperties(hibernateProperties);
		return bean;
	}
	
	@Bean
	public HibernateTransactionManager getTxManager(SessionFactory sessionFactory, DataSource dataSource) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		txManager.setDataSource(dataSource);
		return txManager;
	}
}
