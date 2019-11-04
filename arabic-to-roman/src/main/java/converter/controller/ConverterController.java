package converter.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import converter.domain.*;

@RestController
@RequestMapping("/converter")
public class ConverterController {
protected ObjectMapper mapper;
	
	@GetMapping
	public String converterToRoman( @RequestParam double num) {
		return  Converter.converterToRoman(num);
	}
}
