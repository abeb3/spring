package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
/*
 * javaConfig
 * ContextConfiguration(Classes = {org.zerock.config.RootConfig.class})
 * */
@Log4j
public class BoardMapperTests {
	@Setter(onMethod_ = {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	
	//insert문
//	@Test
//	public void TestInsert() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글 select key");
//		board.setContent("새로 작성하는 내용 select key");
//		board.setWriter("root");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
	
	//select문
	@Test
	public void testRead() {
		//존재하는 게시물 번호로 테스트
		BoardVO board = mapper.read(23L);
		
		log.info(board);
	}
	
	//update문
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		board.setBno(24L);
//		board.setTitle("수정된 제목");
//		board.setContent("수정된 내용");
//		board.setWriter("수정된 작가");
//		
//		int count  = mapper.update(board);
//		log.info("UPDATE COUNT:" + count);
//	}
	
	//delete문
//	@Test
//	public void testDelete() {
//		
//		log.info("DELETE COUNT:" + mapper.delete(23L));
//	}
	

}
	