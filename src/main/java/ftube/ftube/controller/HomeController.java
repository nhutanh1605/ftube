//package ftube.ftube.controller;
//
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HomeController {
//
//    @GetMapping("/")
//    public String home(){
//        return "Hello, Home!";
//    }
//
//    @GetMapping("/secured")
//    public String secured(){
//        DefaultOidcUser user = (DefaultOidcUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        return "Hello " + user.getEmail() + "<br>Fullname: " + user.getFullName() +
//                "<br><img src='"+user.getPicture()+"'></img>";
//    }
//}
