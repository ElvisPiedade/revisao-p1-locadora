package testeMAP;

public class Jogo extends Acervo implements Alugavel {
	private String plataforma;
	private String titulo;

	public Jogo(String plataforma, String titulo) {
		super();
		this.plataforma = plataforma;
		this.titulo = titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int getTempoEmprestimo() {
		return 0;
	}

	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public void setCodigo(String codigo) {
		
		
	}

	@Override
	public void setLocado(Boolean locado) {
		// TODO Auto-generated method stub
		
	}

}
