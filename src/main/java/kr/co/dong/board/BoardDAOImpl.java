package kr.co.dong.board;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String nameSpace="kr.co.dong.boardMapper";
	
	@Override
	public Map login(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("kr.co.dong.boardMapper.login",map);
	}

	@Override
	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateReadCnt(int bno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardDTO getDetail(int bno) {
		// TODO Auto-generated method stub
		return null;
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
