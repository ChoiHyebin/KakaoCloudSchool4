package mycom.mytest.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// http://localhost:8080/exam
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;
import mycom.mytest.exam.model.SampleVO;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping("/")
	public void sample() {
		log.info("SampleController: sample()......");
	}
	
	@RequestMapping("/s2")
	public void sample2() {
		log.info("SampleController: sample2()......");
	}
	
	@RequestMapping("/s3")
	public String sample3() {
		log.info("SampleController: sample3()......");
		
		return "/WEB_INF/views/sample/s3";
	}
	
	@RequestMapping("/s4p")
	public void sample4p(@RequestParam("name") String n, @RequestParam("age") int age) {
		log.info("/s4p/name = " + n);
		log.info("/s4p/age = " + age);
	}
	
	// http://localhost:8080/exam/sample/s4?name=aaa&age=30
	@RequestMapping("/s4")
	public void sample4(SampleVO vo) {
		log.info("/s4..............." + vo);
	}
	
//	@RequestMapping("/s5")
//	public void sample5(Model my) {
//		log.info("/s5.............." + my);
//	}
	
}
