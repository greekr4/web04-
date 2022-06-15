package com.tkhospital.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tkhospital.common.testDTO;

@Repository
public class TestDaoImpl implements testDAO {
	private static final String namespace = "com.tkhospital.testMapper";
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<testDTO> selectTest() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".test");
	}

}
