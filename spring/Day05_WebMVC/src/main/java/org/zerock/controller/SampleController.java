package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping("/s1")
	public void sample() {
		log.info("sample...");
	}
	
	@RequestMapping("/s2")
	public void sample2(@RequestParam("name") String pname,
			@RequestParam("age") int page) {
		
		page += 10;
		log.info("sample2... : " + pname);
		log.info("sample2... : " + page);
	}
	
	@RequestMapping("/s3")
	public void sample3(SampleDTO dto) {
		log.info("sample/s3/.." + dto);
//		/WEB-INF/views/sample/s3.jsp
		
//		request.setAttribute("sampleDTO", dto);
	}
	
	@RequestMapping("/s4")
	public String sample4(SampleDTO dto) {
		
		log.info("sample/s4/.." + dto);
//		/WEB-INF/views/sample/s4.jsp
		return "sample/s4";
	}
	
	@RequestMapping("/s5")
	public String sample5(SampleDTO dto) {
		
		log.info("sample/s5/.." + dto);
		
//		conrtoller를 거쳐서 들어오도록
		return "redirect:/sample/s3";
	}

	@RequestMapping("/s6")
	public void sample6(SampleDTO dto, Model model) {
		log.info("/sample/s6...");
//		service --> dao(MyBatis) : Model
//		View에 Model 전달
		model.addAttribute("mod6", "Model 정보를 전달");
	}
	
//	Object --> JSON Parsing
	
	@RequestMapping("/s7")
	public @ResponseBody SampleDTO sample7() {
		log.info("sample/s7...");
		SampleDTO dto = new SampleDTO();
		dto.setName("bbbb");
		dto.setAge(34);
		
		return dto;
	}
	
}
