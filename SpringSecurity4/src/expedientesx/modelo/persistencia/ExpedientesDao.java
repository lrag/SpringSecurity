package expedientesx.modelo.persistencia;

import java.util.List;

import expedientesx.modelo.entidad.Expediente;

public interface ExpedientesDao {
	Expediente buscar(Long id);
	List<Expediente> listar();
	void guardar(Expediente expediente);
	void borrar(Expediente expediente);
}
