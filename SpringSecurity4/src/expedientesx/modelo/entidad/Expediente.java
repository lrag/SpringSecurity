package expedientesx.modelo.entidad;

public class Expediente {
	public static final long NUEVO_EXPEDIENTE = -1L;
	private Long id = NUEVO_EXPEDIENTE;
	private String titulo;
	private String informe;
	private String imagen;
	private String investigador;
	private boolean clasificado;

	public Expediente() {
	}

	public Expediente(String titulo, String informe, String imagen,
			String investigador, boolean clasificado) {
		this.titulo = titulo;
		this.informe = informe;
		this.imagen = imagen;
		this.investigador = investigador;
		this.clasificado = clasificado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getInvestigador() {
		return investigador;
	}

	public void setInvestigador(String investigador) {
		this.investigador = investigador;
	}

	public boolean isClasificado() {
		return clasificado;
	}

	public void setClasificado(boolean clasificado) {
		this.clasificado = clasificado;
	}

	@Override
	public String toString() {
		return "Expediente [id=" + id + ", titulo=" + titulo + ", informe="
				+ informe + ", imagen=" + imagen + ", investigador=" + investigador
				+ ", clasificado=" + clasificado + "]";
	}

}
