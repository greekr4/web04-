package com.tkhospital.dao;
import java.util.List;

import com.tkhospital.common.testDTO;
public interface testDAO {
	
	public List<testDTO> selectTest() throws Exception;
}
