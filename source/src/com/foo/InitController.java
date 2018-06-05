package com.foo;

import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class InitController {
	private static Logger logger = Logger.getLogger(InitController.class);
	
	@GetMapping("/removeAttribute/{key}")
	public String removeAttribute(HttpServletRequest request, @PathVariable("key") String key) {
		HttpSession session = request.getSession();
		String id = session.getId();
		logger.debug("session id:" + id + " key:" + key + " attempting to remove");
		session.removeAttribute(key);
		return "redirect:/";
	}
	
	@GetMapping("/setAttribute/{key}/{value}")
	public String setAttribute(HttpServletRequest request, @PathVariable("key") String key, @PathVariable("value") String value) {
		HttpSession session = request.getSession();
		String id = session.getId();
		logger.debug("session id:" + id + " key:" + key + " value:" + value + " attempting to add");
		session.setAttribute(key, value);
		return "redirect:/";
	}
	
	@GetMapping("/index")
	public ModelAndView init(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("index");
		HttpSession session = request.getSession();
		String id = session.getId();
		logger.debug("session id:" + id + " grabbing key:value:type from session attributes");
		ArrayList<String> items = new ArrayList<String>();
		for(String key : Collections.list(session.getAttributeNames())){
			String value = "NULL";
			String type = "NULL";
			Object ob = session.getAttribute(key);
			if(ob != null) {
				type = ob.getClass().getCanonicalName();
				value = ob.toString();
			}
			items.add("id:" + id + " type:" + type + " key:" + key + " value:" + value);
		}
		model.addObject("items", items);	
		model.addObject("id", id);
		return model;
	}
}