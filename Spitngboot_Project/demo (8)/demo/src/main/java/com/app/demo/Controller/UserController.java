package com.app.demo.Controller;


import com.app.demo.Controller.vo.LoginRequest;
import com.app.demo.Model.User;
import com.app.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @Autowired
  private UserRepo userRepo;
    @GetMapping("/login")
    public String getLogin(Model model)
    {
        model.addAttribute("loginRequest",new LoginRequest());
        return "loginpage";
    }

    @PostMapping("loginUser")
    public String loginUser(@ModelAttribute("loginRequest") LoginRequest loginRequest,Model model)
    {
User user=userRepo.findByUsernameAndPassword(loginRequest.getUsername(),loginRequest.getPassword());
       if(user!=null)
       {
           model.addAttribute("msg","hi "+loginRequest.getUsername()+" , ");
           return "success";
       }
        System.out.println(loginRequest.toString());
       model.addAttribute("msg","please eneter correct username and password");
          return "loginpage";
    }

}
