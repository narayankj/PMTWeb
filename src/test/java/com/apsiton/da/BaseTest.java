package com.apsiton.da;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext-unittest.xml")
@WebAppConfiguration
public class BaseTest {
	static {
		System.setProperty(
				"projMgmt.spring.config.xml.files",
				"E:\\nani\\apsiton\\ProjectMgmtTool\\workspace\\ProjectManagementTool\\src\\main\\resources\\spring\\applicationContext.xml,"
						+ "E:\\nani\\apsiton\\ProjectMgmtTool\\workspace\\ProjectManagementTool\\src\\test\\java\\applicationContext-unittest.xml"
						);
	}
}
