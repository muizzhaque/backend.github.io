//package com.register.springboot.studentdetails.login;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//
//@Controller
//@SessionAttributes("name")
//public class LoginController {
//	private AuthenticationService authenticationService;
////	private Logger logger = LoggerFactory.getLogger(getClass());
//	///login => com.in28minutes.springboot.myfirstwebapp.login.LoginController => login.jsp
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}
//	@RequestMapping( value="login", method = RequestMethod.GET)
////	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//		public String gotoLoginPage() {
////		model.put("name", name);
////		logger.debug("RequestParam is {}",name);
////		logger.info("this ois printed at info level");
////		logger.warn("This is printed at warn level");
////		System.out.println("Request param is " + name); //NOT RECOMMENDED FOR PROD CODE
//		return "login";
//	}
//	@RequestMapping( value="login", method = RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap map) {
//		if(authenticationService.authenticate(name, password)) {
//		map.put("name", name);
//		map.put("password", password);
//		return "welcome";
//	}
//		return "login";
//	}
//	
//}
