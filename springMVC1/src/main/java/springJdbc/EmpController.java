package springJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpController {
	
	@Autowired    
    EmpDAO dao;
	
	@RequestMapping("/empForm")    
    public String showform(Model m){    
        m.addAttribute("command1", new Emp()); 
        System.out.println("shubham");

        return "empForm";   
    }  
	
	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("command1") Emp emp){    
        dao.save(emp);   
        return "redirect:viewemp";        //return "redirect:/viewemp";//will redirect to viewemp request mapping    
    } 
	
	@RequestMapping("/viewemp")    
    public String viewemp(Model m){ 
        System.out.println("shubham12345");

        List<Emp> list=dao.getEmployees();    
        m.addAttribute("list",list); 
        System.out.println("akm");
        System.out.println(list);
        return "viewemp";    
	}
	

}
