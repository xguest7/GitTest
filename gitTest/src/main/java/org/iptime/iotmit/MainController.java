package org.iptime.iotmit;

/* 글자수 세기 프로그램
http://127.0.0.1/strcount
글자박스나오고
글입력하고
개수세기 버튼을 누르면
url이 유지되면서
총글자는 몇글자입니다. 라고 나오도록 만들어봅시다. */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/strcount")
	public void aa() {
		//->strcount.jsp
	}
	
	@PostMapping("/strcount")
	public String bb(String content, Model model) {
		
		model.addAttribute("count", content.replaceAll(" ","").replaceAll("\r\n","").length());
		return "count";
		
	}
}
