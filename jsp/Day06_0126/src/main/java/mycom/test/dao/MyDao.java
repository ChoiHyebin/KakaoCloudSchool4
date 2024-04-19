package mycom.test.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import mycom.test.domain.MemberInfo;

public interface MyDao {
	// CRUD
	
	public void insert(MemberInfo mem) throws SQLException;
	
	public MemberInfo selectOne(int mid) throws SQLException;
	
	public ArrayList<MemberInfo> selectList() throws SQLException;
	
	public int update(MemberInfo mem) throws SQLException;
	
}
