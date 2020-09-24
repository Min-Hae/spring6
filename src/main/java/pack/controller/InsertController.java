package pack.controller;


import pack.model.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InsertController {
	@Autowired
	private MemberDao memberDao;
	
	@ModelAttribute("command")
	public MembrBean formBack() {
		return new MembrBean();
	}
	@RequestMapping(value="insert", method=RequestMethod.GET)
	public String form() {
		return "insform";
	}
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public String submit(MembrBean bean) {
		memberDao.insData(bean);
		//return "list"; =>그냥 목록보기를 부르면 ListController가 제대로 작동하지않음.
		return "redirect:/memlist";				
	}
}
