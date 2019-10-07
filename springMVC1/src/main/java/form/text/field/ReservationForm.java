package form.text.field;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;  


@RequestMapping("/reservationForm")
@Controller
public class ReservationForm {
	@RequestMapping("/reserveForm")
	public String book(Model model)
	{
		Reservation res=new Reservation();
		model.addAttribute("reservation",res);
		return "ReForm";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation res)
	{
		
		return "submitForm";
	}

}
