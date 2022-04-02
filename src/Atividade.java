public abstract class Atividade {
    private static int ID_ATIVIDADE_AUTO_INCREMENTO = 0;

    private int idAtividade = 0;
    protected int cargaHoraria;

    public Atividade(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.idAtividade = ++ID_ATIVIDADE_AUTO_INCREMENTO;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
