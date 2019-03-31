package expedientesx.modelo.persistencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import expedientesx.modelo.entidad.Expediente;

@Repository
public class ExpedientesDaoImpl implements ExpedientesDao, InitializingBean {
	private Long id = 0L;
	private Map<Long, Expediente> expedientes = new HashMap<Long, Expediente>();

	public Expediente buscar(Long id) {
		return expedientes.get(id);
	}

	public List<Expediente> listar() {
		return new ArrayList<Expediente>(expedientes.values());
	}

	public void guardar(Expediente expediente) {
		if (expediente.getId() == Expediente.NUEVO_EXPEDIENTE) {
			expediente.setId(id++);
		}
		expedientes.put(expediente.getId(), expediente);
	}

	public void borrar(Expediente expediente) {
		if(expediente.getId()!=null){
			expedientes.remove(expediente.getId());
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		guardar(new Expediente("El Niño Murciélago","En 2004, medía cinco metros de altura y su peso era desconocido. Cambia sus alas cada tres años, y regenera un nuevo par.", "imagenes/batboy.jpg", "Mulder", true));
		guardar(new Expediente("Avistamiento Big Foot","Bigfoot se describe en los informes como una gran peluda criatura simiesca, que oscila entre 6-10 pies de altura  (3.2 m), con un peso de m�s de 500 libras (230 kg), y cubierto de pelo marr�n rojizo oscuro u oscuro. ", "imagenes/bigfoot.jpg", "Scully", false));
		guardar(new Expediente("Elvis esta vivo","Se asegura que el cantante estadounidense de rock no habr�a muerto realmente en 1977, y que vivir�a de incógnito viajando por el mundo. Dónde ha sido visto Elvis? En Montana, Cambridge, Southampton,...", "imagenes/elvis.jpg", "Mulder", false));
		guardar(new Expediente("Abduciones por Alien","El 27 de noviembre de 1973, Samantha Mulder desaparece misteriosamente. Es abducida mientras juega con su hermano, estando sus padres esa noche fuera de casa.", "imagenes/alien.jpg", "Scully", true));
	}
}
