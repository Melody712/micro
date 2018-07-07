package cn.mldn.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageAction {
	@ResponseBody
	@RequestMapping("/echo") 
	//@RequestMapping("/echo/{message}") 
//	public String echo(@PathVariable("message") String msg) { 
	public String echo(String msg) { 
		return "【ECHO】msg = " + msg ; 
	}
}
