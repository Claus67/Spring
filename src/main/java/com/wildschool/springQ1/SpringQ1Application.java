package com.wildschool.springQ1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringQ1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringQ1Application.class, args);
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String index() {
		return "Erster Doctor der Serie: John Winston Lennon";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String index2() {
		return "Zweiter Doctor der Serie: Sir James Paul McCartney";
	}       

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String index3() {
		return "Zehnter Doctor der Serie: George Harrison";
	}

	@RequestMapping("/doctor/15")
	@ResponseBody
	public String index4() {
		return "Fünfzehnter Doctor der Serie: Sir Richard Starkey";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index5() {
		String resultString = "<ul> \n" + " 	<li><a href = \"/doctor/1\">Name1 </a></li>\n"
				+ " 	<li><a href = \"/doctor/2\">Name2 </a></li>\n"
				+ "  	<li><a href = \"/doctor/10\">Name3 </a></li>\n"
				+ "  	<li><a href = \"/doctor/15\">Name4 </a></li>\n" + "</ul>";

		return resultString;
	}
}

