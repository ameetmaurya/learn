package com.app.demo.Controller;

import com.app.demo.Controller.vo.LoginRequest;
import com.app.demo.Model.Transaction;
import com.app.demo.Model.User;
import com.app.demo.Model.profileUser;
import com.app.demo.dto.FDRequest;
import com.app.demo.dto.FundRequest;
import com.app.demo.dto.HomeMessageDTO;
import com.app.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.app.demo.dto.withdrawRequest;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("loginRequest", new LoginRequest());
        return "loginpage";
    }

    @PostMapping("/loginUser")
    public String loginUser(@ModelAttribute("loginRequest") LoginRequest loginRequest, Model model) {
        User user = userRepo.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        if (user != null) {
            model.addAttribute("msg", "Hi " + loginRequest.getUsername() + ", ");
            return "success";  // This could be dashboard.html
        }

        model.addAttribute("msg", "Please enter correct username and password");
        return "loginpage";
    }

    @Controller
    public class HomeController {

        @GetMapping("/")
        public String showHomePage(Model model) {
            HomeMessageDTO homeMessageDTO = new HomeMessageDTO("Spend, save and manage your money all in one place. Open a full bank from your phone for free");
            model.addAttribute("message", homeMessageDTO.getMessage());
            return "index"; // This maps to index.html
        }
    }
    @GetMapping("/addFunds")
    public String showAddFundsPage(Model model) {
        model.addAttribute("fundRequest", new FundRequest());
        return "addFunds";
    }

    @PostMapping("/processFunds")
    public String processFundRequest(@ModelAttribute FundRequest fundRequest, Model model) {
        // You can process/store fundRequest data here

        model.addAttribute("amount", fundRequest.getAmount());
        return "fundSuccesspage"; // Thymeleaf success HTML page
    }




    @GetMapping("/withdrawFunds")
    public String showWithdrawPage(Model model) {
        model.addAttribute("withdrawRequest", new withdrawRequest());
        return "withdrawFunds";
    }

    @PostMapping("/processWithdraw")
    public String processWithdraw(@ModelAttribute withdrawRequest withdrawRequest, Model model) {
        System.out.println("Withdraw Amount: " + withdrawRequest.getAmount());
        System.out.println("Withdraw Method: " + withdrawRequest.getMethod());

        model.addAttribute("msg", "₹" + withdrawRequest.getAmount() + " withdrawn successfully via " + withdrawRequest.getMethod());
        return "withdrawSuccesspage";
    }

    @Controller
    public class FDController {

        @GetMapping("/fixedDeposit")
        public String showFDPage(Model model) {
            model.addAttribute("fdRequest", new FDRequest());
            return "fixedDeposit";
        }

        @PostMapping("/processFD")
        public String processFixedDeposit(@ModelAttribute FDRequest fdRequest, Model model) {
            double p = fdRequest.getAmount();
            int n = fdRequest.getDuration(); // in months
            double r = fdRequest.getInterestRate(); // annual %

            double maturityAmount = p + (p * r * n / 1200);

            model.addAttribute("maturityAmount", maturityAmount);
            model.addAttribute("fdRequest", fdRequest);

            return "fixedDSuccesspage";
        }
    }

    @Controller
    public class ProfileController {

        @GetMapping("/profile")
        public String profile(Model model) {
            profileUser user = new profileUser("John Mistri", "johnmistri@gmail.com", "+91 39749 48849", "39749 48849@nuksan", "HDFC0001234");
            model.addAttribute("user", user);
            return "profile";
        }
    }

    @Controller
    public class TransactionController {

        @GetMapping("/transaction")
        public String showTransactions(Model model) {
            List<Transaction> transactions = List.of(
                    new Transaction("Salary Credit", "Credit", "2025-01-15", 45000),
                    new Transaction("Rent Payment", "Debit", "2025-01-30", 12000),
                    new Transaction("Groceries", "Debit", "2025-02-01", 4000),
                    new Transaction("Freelance Income", "Credit", "2025-02-10", 15000)
            );

            model.addAttribute("transactions", transactions);
            return "transaction";
        }
    }



}
