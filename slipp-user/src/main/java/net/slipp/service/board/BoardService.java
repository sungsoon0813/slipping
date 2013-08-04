package net.slipp.service.board;

import java.sql.SQLException;
import java.util.List;

import net.slipp.dao.board.BoardDao;
import net.slipp.domain.board.Board;
import net.slipp.service.user.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoardService {

	private static Logger log = LoggerFactory.getLogger(UserService.class);

	public List<Board> getList() {
		BoardDao boardDao = new BoardDao();
		return boardDao.getList();
	}
	
	public List<Board> addBoard(Board board) throws SQLException {
		BoardDao boardDao = new BoardDao();
		boardDao.insert(board);
		return boardDao.getList();
	}
	
}
