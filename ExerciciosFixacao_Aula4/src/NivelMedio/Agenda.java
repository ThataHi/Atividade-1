package NivelMedio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Compromisso> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        compromissos.add(compromisso);
    }

    public List<Compromisso> obterCompromissos(LocalDate data) {
        List<Compromisso> compromissosNaData = new ArrayList<>();
        for (Compromisso c : compromissos) {
            if (c.getData().equals(data)) {
                compromissosNaData.add(c);
            }
        }
        return compromissosNaData;
    }
}
