import java.util.ArrayList;
import java.util.List;

public class Curso {
    List<Atividade> listaAtividades;
    private String nome;

    public Curso(String nome) {
        this.listaAtividades = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHorariaTotal() {
        int cargaHorariaTotal = 0;
        for(Atividade atividade : this.listaAtividades){
            cargaHorariaTotal += (atividade.getCargaHoraria());
        }
        return cargaHorariaTotal;
    }

    public void addAtividade(Atividade atividade){
        this.listaAtividades.add(atividade);
    }
}
