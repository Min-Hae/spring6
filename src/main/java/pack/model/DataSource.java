package pack.model;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
@Repository
public class DataSource extends DriverManagerDataSource {
	public DataSource() {//aop.xml에 있는 property를 지우고 실행 가능.
		setDriverClassName("org.mariadb.jdbc.Driver");
		setUrl("jdbc:mysql://localhost:3308/test");
		setUsername("root");
		setPassword("123");
	}
}
