package testeMAP;

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
			List<Acervo> value = entry.getValue();

			for (Acervo ac : value) {
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
		return false;
	}

	public int getTotalLocados() {
		return 1;
	}

	public Map<Associado, List<Acervo>> getEmprestimos() {

		for (Entry<Associado, List<Acervo>> entry : emprestimos.entrySet()) {
			Associado key = entry.getKey();
			List<Acervo> value = entry.getValue();
			System.out.print(key + ": ");

			for (Acervo aString : value) {
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
