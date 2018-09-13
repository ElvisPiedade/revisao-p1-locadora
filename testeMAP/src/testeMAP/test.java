package testeMAP;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class test {

	public static void main(String[] args) {

		Associado associado1 = new Associado("001", "Elvis");
		Associado associado2 = new Associado("002", "Cris");
		Associado associado3 = new Associado("003", "Renata");
		Associado associado4 = new Associado("004", "Victor");
		Associado associado5 = new Associado("005", "João");
		Associado associado6 = new Associado("006", "Maria");
		
		Filme filme1 = new Filme("001","Quentin Tarantino","Ação","Kill BIll");
		Filme filme2 = new Filme("002","Joe Ksander","Ação","Next Gen");
		
		ControleDeLocacao loc1 = new ControleDeLocacao();
		
		loc1.adicionaEmprestimo(filme1, associado1);

		loc1.adicionaEmprestimo(filme2, associado2);
		
		loc1.getEmprestimos();
		
		
		
		}
		

	}


