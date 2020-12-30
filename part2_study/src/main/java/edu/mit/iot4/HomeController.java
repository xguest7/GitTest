package edu.mit.iot4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/ex05")
	public void ex01() {
		// 1. void 리턴타입일 경우 파라미터이름.jsp 요청
	}
	
	@RequestMapping("/test2")
	public String ex02() {
		
		return "result";
		//2.리턴문자열.jsp 페이지가 호출된다.
		
		//return "redirect:/result"; //새로운 result 요청
	}
	
	@RequestMapping("/result")
	public void ex03() {
		
	}
	
	
	@RequestMapping("/test3")
	public String ex04(Model model) {
		
		model.addAttribute("abc", 1234);
		return "productDetail";
	}
	
	@RequestMapping("/test1")
	public void extest(Model model) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		model.addAttribute("aaa", sum);
		
	}
	
	@RequestMapping("/send")
	public void send() {
		
	}
	
	@RequestMapping("/ex01")
	public void ex01_para(SampleDTO dto) {
		System.out.println("이름은"+dto.getName());
		System.out.println("나이도"+dto.getAge());
		
		//ex01.jsp
	}
	
	@RequestMapping("/test11")
	public String test11() {
		return "test12";
	}
	
	@RequestMapping("/test13")
	public void test13(int a, int b, Model model ) {
		int sum=0;
		for(int i=a; i<=b ; i++) {
			sum+=i;
		}
		model.addAttribute("sum", sum);
	}
	
	@RequestMapping("/ex22")
	public void ex22() {
		
	}
	
	@RequestMapping("/ex02")
	public void ex002(SampleDTO dto, int page,Model model) {
		System.out.println("이름"+dto.getName());
		System.out.println("나이"+dto.getAge());
		System.out.println("페이지"+page);
		model.addAttribute("page", page);
	}
	
	@RequestMapping("/test4")
	public @ResponseBody SampleDTO test4() {
		SampleDTO aaa = new SampleDTO();
		aaa.setName("hong");
		aaa.setAge(99);
		return aaa;
	}
	
}





