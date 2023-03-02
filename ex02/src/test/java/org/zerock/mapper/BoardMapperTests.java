package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Autowired
	BoardMapper mapper;
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로운 내용");
		board.setContent("새로 작성한 내용");
		board.setWriter("user01");
		
		mapper.insert(board);
		
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("새로운 내용2");
		board.setContent("새로 작성한 내용2");
		board.setWriter("user02");
		
		mapper.insertSelectKey(board);
		
		log.info(board);
	}
	
	@Test
	public void testGetList() {
		List<BoardVO> list = mapper.getList();
		list.forEach(board -> log.info(board));
	}
}