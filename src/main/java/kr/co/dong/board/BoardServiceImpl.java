package kr.co.dong.board;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO boardDAO; 
	
	@Override
	public Map login(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return boardDAO.login(map);
	}

	@Override
	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRead(int bno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int register(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

}
