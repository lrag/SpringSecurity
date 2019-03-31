package expedientesx.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expedientesx.modelo.entidad.Expediente;
import expedientesx.modelo.persistencia.ExpedientesDao;

@Service
public class GestorExpedientesImpl implements GestorExpendientes {
	
	@Autowired
	private ExpedientesDao expedientesDao;

	public void actualizar(Expediente expediente) {
		expedientesDao.guardar(expediente);
		System.out.println("Actualizado Expediente: " + expediente);
	}

	public void clasificar(Expediente expediente) {
		if (!expediente.isClasificado()) {
			expediente.setClasificado(true);
			actualizar(expediente);
			System.out.println("Expediente Clasificado: " + expediente);
		}
	}

	public void desclasificar(Expediente expediente) {
		if (expediente.isClasificado()) {
			expediente.setClasificado(false);
			actualizar(expediente);
			System.out.println("Expediente Desclasificado: " + expediente);
		}
	}

	public List<Expediente> listarTodos() {
		List<Expediente>expedientes=expedientesDao.listar();
		System.out.println("Mostrar "+expedientes.size()+" Expedientes: " + expedientes.toString());
		return expedientes;
	}

	public Expediente mostrar(Long id) {
		Expediente expediente=expedientesDao.buscar(id);
		System.out.println("Mostrar Expediente: " + expediente.toString());
		return expediente;
	}

}
