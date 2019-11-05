package converter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import converter.domain.*;

@RestController
public class ConverterController {
	protected ObjectMapper mapper;

	@RequestMapping("/converter/{num}")
	@GetMapping
	public String converterToRoman( @PathVariable double num) {
		return  Converter.converterToRoman(num);
	}
	
	@RequestMapping
    public String index() {
        return "Conversor numeros arabigos a romanos. Ingrese el numero entero (entre 1 y 999) que desea convertir a romano con el siguiente query: /converter/{num}";
    }
}
