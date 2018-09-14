package pkg.revisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ControleDeLocacao {

	Map<Associado, List<Acervo>> emprestimos = new HashMap<Associado, List<Acervo>>();

	public boolean adicionaEmprestimo(Associado associado, Acervo acervo) {
		List<Acervo> list = new ArrayList<Acervo>();
		list.add(acervo);

		for (Entry<Associado, List<Acervo>> entry : emprestimos.entrySet()) {

			for (Acervo ac : entry.getValue()) { // entry.getValue() -> retorna
													// List<Acervo>
				if (entry.getKey().equals(associado)) {
					list.add(ac);
				}
			}
		}

		acervo.setLocado(true);
		emprestimos.put(associado, list);

		return true;
	}

	public boolean devolveEmprestimo(Acervo acervo, Associado associado) {
		
		for (Entry<Associado, List<Acervo>> entry : emprestimos.entrySet()) {
			entry.getValue().remove(acervo);
		}
		return false;
	}

	public int getTotalLocados() {
		int sum = 0;
		for (Entry<Associado, List<Acervo>> entry : emprestimos.entrySet()) {
			sum += entry.getValue().size();
		}
		return sum;
	}

	public Map<Associado, List<Acervo>> getEmprestimos() {

		for (Entry<Associado, List<Acervo>> entry : emprestimos.entrySet()) {
			Associado key = entry.getKey();
			System.out.print(key + ": ");

			for (Acervo aString : entry.getValue()) {
				System.out.print(aString.toString() + ", ");
			}
			System.out.println();
		}
		return emprestimos;
	}

	public void setEmprestimos(Map<Associado, List<Acervo>> emprestimos) {
		this.emprestimos = emprestimos;
	}

}
