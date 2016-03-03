package com.apsiton.da;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.apsiton.web.vo.UserVO;

public class UserActionServiceTest extends BaseTest {

	
	  private MediaType contentType = new
	  MediaType(MediaType.APPLICATION_JSON.getType(),
	  MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
	 
	
	private MockMvc mockMvc;

	@SuppressWarnings("rawtypes")
	private HttpMessageConverter mappingJackson2HttpMessageConverter;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() throws Exception {
		this.mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@SuppressWarnings("unchecked")
	protected String json(Object o) throws IOException {
		MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
		this.mappingJackson2HttpMessageConverter.write(o,
				MediaType.APPLICATION_JSON, mockHttpOutputMessage);
		return mockHttpOutputMessage.getBodyAsString();
	}

	/*@Test
	public void addUser() throws Exception {
		UserVO user = new UserVO();

		user.setUserName("nkumar");
		user.setFirstName("Narayan");
		user.setLastName("Kumar");
		user.setEmail("nkumar@apsiton.com");
		user.setPassword("apsiton");
		user.setCreateDate(new Date(System.currentTimeMillis()));
		user.setCreatedBy("Apsiton");
		user.setId(123);
		
		this.mockMvc
				.perform(
						post("/user/v1/add").contentType(
								contentType).content(json(user)))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType));
	}*/
	
	@Test
	public void getUser() throws Exception {
		//UserVO user = new UserVO();

		/*user.setUserName("nkumar");
		user.setFirstName("Narayan");
		user.setLastName("Kumar");
		user.setEmail("nkumar@apsiton.com");
		user.setPassword("apsiton");
		user.setCreateDate(new Date(System.currentTimeMillis()));
		user.setCreatedBy("Apsiton");
		user.setId(123);*/
		
		this.mockMvc
				.perform(
						get("/user/v1/getall"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType));
	}

}
