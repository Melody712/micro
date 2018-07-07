package cn.mldn.action;
 
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageAction {
	@Autowired
	private MessageSource messageSource ;
	@ResponseBody
	@RequestMapping("/msg") 
	public String info() {
		return this.messageSource.getMessage("welcome.msg", new Object[] {"高大师"}, Locale.getDefault()) ;
	}
}
