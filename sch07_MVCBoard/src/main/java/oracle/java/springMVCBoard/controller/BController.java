package oracle.java.springMVCBoard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import oracle.java.springMVCBoard.command.BCommand;
import oracle.java.springMVCBoard.command.BContentCommand;
import oracle.java.springMVCBoard.command.BListCommand;
import oracle.java.springMVCBoard.command.BModifyCommand;
import oracle.java.springMVCBoard.command.BReplyCommand;
import oracle.java.springMVCBoard.command.BReplyViewCommand;
import oracle.java.springMVCBoard.command.BWriteCommand;
import oracle.java.springMVCBoard.command.bDeleteCommand;
import scala.remote;

@Controller
public class BController {
	BCommand command = null;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		command = new BListCommand();
		command.execute(model);
		
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		
		return "write_view";
	}
	
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");
		
		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value= "/modify", method = RequestMethod.POST)
	
	public String modify (HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new BModifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view (HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new BReplyViewCommand();
		command.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping(value="/reply" , method = RequestMethod.POST)
	public String reply (HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new BReplyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete (HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new bDeleteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
}
