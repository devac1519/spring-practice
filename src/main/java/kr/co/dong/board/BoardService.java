package kr.co.dong.board;

import java.util.List;
import java.util.Map;

public interface BoardService {
	//전체목록을 가져오는 메소드
	public List<BoardDTO> list();
	
	// 상세보기 처리를 위한 메소드(글읽기)
//	public int updateReadCnt(int bno);  //조회수 증가
//	public BoardDTO getDetail(int bno);  //getRead(), getView()
	public int getRead(int bno);  //조회수 증가 및 읽기를 처리하는 메소드

	
	// 글추가 insert
	public int register(BoardDTO boardDTO);
	
	// 글삭제
	public int delete(int bno);
	
	// 슬수정
	public int update(BoardDTO boardDTO);
	
	//로그인 처리를 위한 메소드
	public Map login(Map<String, Object> map);

}
