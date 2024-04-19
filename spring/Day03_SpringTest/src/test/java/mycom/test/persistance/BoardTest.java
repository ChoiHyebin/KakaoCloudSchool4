package mycom.test.persistance;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import mycom.test.domain.BoardVO;
import mycom.test.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardTest {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testBoard() {
		BoardVO vo = new BoardVO();
		vo.setTitle("두번쨰 글");
		vo.setContent("내용을 채워봅니다 두번쨰");
		vo.setWriter("길기동");
		mapper.insert(vo);
	}

	@Test
	public void testGetList() {
		List<BoardVO> list = mapper.getList();
		log.info("************************");
		log.info(list);
	}
}
