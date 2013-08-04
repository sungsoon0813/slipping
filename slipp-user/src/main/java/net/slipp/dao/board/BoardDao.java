package net.slipp.dao.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.slipp.domain.board.Board;

public class BoardDao {

	// 게시물들을 저장하는 ArrayList
	private static List<Board> boards = new ArrayList<Board>();
	
	public List<Board> getList() {
		
		List<Board> tempBoards = new ArrayList<Board>();  
		
		for (int i = 0; i < boards.size(); i++) {
			
			if (boards.get(i).getId() == boards.get(i).getOriginNo()) {
				tempBoards.add(boards.get(i));
			}
			
		}
		
		return tempBoards;
	}
	
	public void insert(Board board) throws SQLException {
		boards.add(board);
	}

	public Board findByBoardId(int id) throws SQLException {
		return boards.get(id);
	}
	
	
}
