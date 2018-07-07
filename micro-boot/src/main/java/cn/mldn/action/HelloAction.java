package cn.mldn.action;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloAction {
	@ResponseBody
	@RequestMapping("/") 
	public String info() {
		System.out.println(10 / 0);
		return "www.mldn.cn" ;
	}
}
