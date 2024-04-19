package mycom.test.sample;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class RestaurantTest {

	@Setter(onMethod_ = @Autowired)
	private Restaurant rest;
	
	@Before
	public void beforeTest() {
		log.info("--작성자: 개발자 --");
	}
	
	@Test
	public void sampleTest() {
		
		assertNotNull(rest);
		
		log.info(rest);
		log.info(rest.getChef());
	}
	
	@Test
	public void sampleTest2() {
		log.info("Test2........");
	}
	
	@After
	public void afterTest() {
		Date d = new Date();
		log.info(d + ": 테스트 완료");
	}
}
