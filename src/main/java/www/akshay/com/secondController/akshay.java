package www.akshay.com.secondController;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller
public class akshay {

    @GetMapping("/contact")
    public String contactUs(Model m){
        System.out.println("THis is your second practical");
        m.addAttribute("FirstName","Darshna ");
        m.addAttribute("LastName","Yadav");
        m.addAttribute(new Date());
        m.addAttribute("OwnerName","Akshay Yadav");
        return  "contact";
    }
    @GetMapping("/home")
    public String home(Model model){

        model.addAttribute("Name","Akshay Yadav");
        model.addAttribute("CurrentDate",new Date());
        return "home";
    }
    //printing list
    @GetMapping("/iterate")
    public String iteratorEx(Model model){
     List<String> n=    List.of("AKshay","Darshana","Girija","Prajkta","Kalyani","Anjali","Prachi","Anchal");
     model.addAttribute("n",n);
        return "iterate";
    }
    @GetMapping("/practice")
    public String practice(Model m){

      List<String> sirnames =   List.of("Yadav","Mali","Jalak","Desai","Khule","Patil","Gore");
      m.addAttribute("sirnames",sirnames);
        return "practice";
    }

    //conditional statements
    @GetMapping("/condition")
    public String ConditionHandelor(Model a){

        a.addAttribute("isAcitive",false);
        a.addAttribute("Gender","F");

        List<Integer> list =      List.of(895,8,63,877,6453,98476,76);
        a.addAttribute("myList",list);
        return  "condition";
    }
    //for including fragments
    @GetMapping("/service")
    public String services(Model m){

        m.addAttribute("title","I like JAVA Programming");
        m.addAttribute("subTitle",new Date());


        return "service";
    }
    @GetMapping("/aboutN")
    public String aboutN(){
        return "aboutN";
    }
    @GetMapping("/contactN")
    public String xyz(){

        return "contactN";
    }

}
