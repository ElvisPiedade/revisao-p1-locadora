package testeMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ControleDeLocacao {

	Map<Associado, List<Acervo>> emprestimos = new HashMap<Associado, List<Acervo>>();

	public boolean adicionaEmprestimo(Acervo acervo, Associado associado) {
		List<Acervo> list = new ArrayList<Acervo>();
		acervo.setLocado(true);
		list.add(acervo);
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
		    
		    for(Acervo aString : value){
		        System.out.print(aString.toString()+", ");
		    }
		    System.out.println();
		}
		return emprestimos;
	}

	public void setEmprestimos(Map<Associado, List<Acervo>> emprestimos) {
		this.emprestimos = emprestimos;
	}

}
