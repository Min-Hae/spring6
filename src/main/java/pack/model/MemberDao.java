package pack.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import pack.controller.MembrBean;


@Repository
public class MemberDao extends JdbcDaoSupport{ //ȸ�� ��ü �ڷ� �б�
	//dataSource�� memberDao�� �ƴ� JdbcDaoSupport�� �������Ѿ� �ϹǷ� ���� �����ڷ� �������� �Ѵ�.
	//private DataSource dataSource;
	@Autowired
	public MemberDao(DriverManagerDataSource dataSource) {
		setDataSource(dataSource); 
	}
	public List<MemberDto> getMemberAll(){
		String sql = "select * from membertab";
		//getJdbcTemplate���� select�� query, �� �ܴ̿� �� update�̴�.
		List<MemberDto> list = getJdbcTemplate().query(sql, new RowMapper(){
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemberDto dto = new MemberDto();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setReg_date(rs.getString("reg_date"));
				return dto;
			}	
		});
		return list;
	}
	public void insData(MembrBean bean) {//�߰�
		String sql = "insert into membertab values(?,?,?,now())";
		Object[] params = {bean.getId(), bean.getName(), bean.getPasswd()};
		getJdbcTemplate().update(sql, params);
	}
}