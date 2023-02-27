package kosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosa.service.HelloService;

@Controller
public class HelloContoller {
	@Autowired
	private HelloService service;
	
	
	@RequestMapping("/hello.do")  // 이 메소드를 호출하겠다는 것
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", service.getMessage());
		mav.setViewName("hello");
		
		
		return mav;
	}
	
	@RequestMapping("/hello2.do")
	public String hello2(Model model) {
		model.addAttribute("message", "kang");
		
		return "hello";
	}
}
