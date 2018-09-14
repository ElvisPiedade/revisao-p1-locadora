package pkg.revisao;

public class Filme extends Acervo implements Alugavel {
	private String diretor;
	private String estilo;
	private String titulo;

	public Filme() {
	}

	public Filme(String codigo, String diretor, String estilo, String titulo) {
		super.setCodigo(codigo);;
		this.diretor = diretor;
		this.estilo = estilo;
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public void setNomeFilme(String nomeFilme) {
		this.titulo = nomeFilme;
	}

	@Override
	public int getTempoEmprestimo() {
		return 0;
	}


	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Filme [diretor=" + diretor + ", estilo=" + estilo + ", titulo=" + titulo + "]";
	}

	
	
}
