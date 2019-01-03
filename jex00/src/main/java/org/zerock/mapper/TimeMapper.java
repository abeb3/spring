package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELET sysdate FROM dual")
	public String getTime();
}
