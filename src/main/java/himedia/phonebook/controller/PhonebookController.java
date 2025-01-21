package himedia.phonebook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhonebookController {
	private static final Logger logger = LoggerFactory.getLogger(PhonebookController.class);
	
	@GetMapping("/")
	public String list() {
		logger.debug("PHONEBOOK LIST:");
		return "phonebook/list";
	}
}
