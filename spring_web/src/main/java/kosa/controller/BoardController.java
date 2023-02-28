package kosa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kosa.model.Board;
import kosa.model.BoardDao;
import kosa.model.Search;

@Controller
public class BoardController {
	@Autowired
	private BoardDao dao;
	
	//@RequestMapping(value = "/board_insert", method = RequestMethod.GET)
	@GetMapping("/board_insert")
	public String board_form(@ModelAttribute("boardCommand") Board board) { // 빈거라도 파라미터 만들어줘야 함
		return "insert_form";
	}
	
	//@RequestMapping(value = "/board_insert", method = RequestMethod.POST)
	@PostMapping("/board_insert")
	public String board_insert(@ModelAttribute("boardCommand") @Valid Board board, BindingResult errors) {
		if(errors.hasErrors()) {
			System.out.println("ERROR!!!!!");
			return "insert_form";
		}
		
		dao.insertBoard(board); // insert update delete 하고 나서 redirect 해라 
		
		return "redirect:board_list";
	}
	
	@GetMapping("/board_list")
	public String board_list(Search search, Model model) {
		//System.out.println(dao.listBoard());
		search.setSearchKey("%" + search.getSearchKey() + "%");
		model.addAttribute("list", dao.listBoard(search));
		
		return "list";
	}
	
	
	@GetMapping("/show_details{seq}")
	public String show_details(@PathVariable int seq, Model model) {
		model.addAttribute("board", dao.showDetails(seq));
		
		return "detail";
	}

}
