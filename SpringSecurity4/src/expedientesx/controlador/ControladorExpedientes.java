package expedientesx.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import expedientesx.modelo.entidad.Expediente;
import expedientesx.modelo.negocio.GestorExpendientes;

@Controller
public class ControladorExpedientes {
	@Autowired 
	private GestorExpendientes gestionExpendientes;
	
	@RequestMapping("/mostrar/todos")
	public ModelAndView mostrarTodos() {
		System.out.println("Peticion Mostrar Expedientes Recibida");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("listadoExpedientes");
		mav.addObject("expedientes", gestionExpendientes.listarTodos());
		return mav;
	}
	
	@RequestMapping("/mostrar/{id}")
	public ModelAndView mostrar(@PathVariable Long id) {
		System.out.println("Peticion Mostrar Expediente Recibida");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("detalleExpediente");
		mav.addObject("expediente", gestionExpendientes.mostrar(id));
		return mav;
	}
	
	@RequestMapping(value="/clasificar", method=RequestMethod.POST)
	public String clasificar( @RequestParam("id") Long id, Model model){
		System.out.println("Clasificar el expediente: "+id);
		Expediente expediente = gestionExpendientes.mostrar(id);
		gestionExpendientes.clasificar(expediente);
		return "redirect:/expedientesx/mostrar/todos";
	}
	
	@RequestMapping(value="/desclasificar", method=RequestMethod.POST)
	public String desclasificar( @RequestParam("id") Long id, Model model){
		System.out.println("Desclasificar el expediente: "+id);
		Expediente expediente = gestionExpendientes.mostrar(id);
		gestionExpendientes.desclasificar(expediente);
		return "redirect:/expedientesx/mostrar/todos";
	}


}
