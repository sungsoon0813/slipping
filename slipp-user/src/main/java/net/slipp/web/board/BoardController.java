package net.slipp.web.board;

import net.slipp.domain.board.Board;
import net.slipp.service.board.BoardService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static Logger log = LoggerFactory.getLogger(BoardController.class);
	
	private BoardService userService = new BoardService();

	@RequestMapping("/list")
	public String boardList(Model model) throws Exception {
		model.addAttribute("boards", userService.getList());
		return "board/list";
	}
	
	@RequestMapping("/form")
	public String joinForm(Model model) throws Exception {
		model.addAttribute("board", new Board());
		return "board/form";
	}
	
//	@RequestMapping("/add")
//	public String addBoard(Model model) throws Exception {
//		userService.addBoard(board);
//		model.addAttribute("boards", userService.getList());
//		return "board/list";
//	}
	
	
}
