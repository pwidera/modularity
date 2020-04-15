package pl.moduleApp.moduleConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.moduleApp.moduleConsumer.service.UserService;

@RestController
public class CustomerController {

	@Autowired
	UserService userService;

	@PostMapping(value = "customer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addCustomer(@RequestBody String email) {
		userService.processNewUser(email);
		return ResponseEntity.ok().build();
	}

}
