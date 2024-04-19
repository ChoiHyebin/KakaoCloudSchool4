package mycom.test.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("select sysdate from dual")
	public String getTime();
	
	@Select("select * from dual")
	public String getTime2();
	
	public String getTime3();
}
