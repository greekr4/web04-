package com.tkhospital.myapp;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.tkhospital.myapp.mapper.TimeMapper;
import com.tkhospital.service.TestService;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MybatisTest {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private TimeMapper timeMapper;
	
	
	
	@Test
	void test() throws Exception {
		logger.info(timeMapper.getClass().getName());
		logger.info(timeMapper.getTime1());
	}

}
