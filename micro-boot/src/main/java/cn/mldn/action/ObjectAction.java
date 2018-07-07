package cn.mldn.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class ObjectAction {
	@ResponseBody
	@RequestMapping("/object") 
	public Object object(HttpServletRequest request,HttpServletResponse response) {
		Map<String,Object> result = new HashMap<String,Object>() ;
		result.put("content-type", request.getContentType()) ;
		result.put("character-encoding", response.getCharacterEncoding()) ;
		result.put("session-id", request.getSession().getId()) ;
		result.put("real-path", request.getServletContext().getRealPath("/")) ;
		return result ; 
	}
	
	@ResponseBody
	@RequestMapping("/object2") 
	public Object object2() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest() ;
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse() ;
		Map<String,Object> result = new HashMap<String,Object>() ;
		result.put("content-type", request.getContentType()) ;
		result.put("character-encoding", response.getCharacterEncoding()) ;
		result.put("session-id", request.getSession().getId()) ;
		result.put("real-path", request.getServletContext().getRealPath("/")) ;
		return result ; 
	}
}
