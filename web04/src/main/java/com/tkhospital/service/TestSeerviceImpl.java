package com.tkhospital.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tkhospital.common.testDTO;
import com.tkhospital.dao.testDAO;
@Service
public class TestSeerviceImpl implements TestService {
	
	@Inject
	private testDAO dao;
	
	@Override
	public List<testDTO> selectTest() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectTest();
	}

}
