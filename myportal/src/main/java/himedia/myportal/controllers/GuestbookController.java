package himedia.myportal.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/guestbook")
public class GuestbookController {

	@GetMapping({"", "/", "/list"})
	public String list(Model model) {
		return "guestbook/list";
	}
}
