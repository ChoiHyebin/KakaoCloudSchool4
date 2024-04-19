package org.zerock.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;

import lombok.extern.log4j.Log4j;
import oracle.net.ano.Service;

@RestController
@RequestMapping("")
@Log4j
public class SampleController {

	@GetMapping(value="/getText", produces="text/plain; charset=UTF-8")
	public String getText() {
		return "<h1>ㅎㅇ</h1>";
	}
	
//	http://localhost:8282/sample/getXML
//	http://localhost:8282/sample/getXML.json
	@GetMapping(value="/getXML", produces= {
			MediaType.APPLICATION_JSON_UTF8_VALUE,
			MediaType.APPLICATION_XML_VALUE
	})
	public SampleVO getXMLandJSON() {

		SampleVO vo = new SampleVO(1, "스타", "길동");
		
		return vo;
	}
}
