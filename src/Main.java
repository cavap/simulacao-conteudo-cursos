public class Main {

    public static void main(String[] args) {
        //usarFuncionalidades();
    }

    private static void usarFuncionalidades() {
        Topico t1 = new Topico(10, "t1");
        Topico t2 = new Topico(20, "t2");
        Avaliacao a1 = new Avaliacao(1, 4.0);
        Avaliacao a2 = new Avaliacao(1, 6.0);

        Curso curso1 = new Curso("1");
        curso1.addAtividade(t1);
        curso1.addAtividade(t2);
        curso1.addAtividade(a1);
        curso1.addAtividade(a2);

        Curso curso2 = new Curso("2");
        curso2.addAtividade(t1);
        curso2.addAtividade(a1);

        System.out.println("Curso " + curso1.getNome() + ". Carga horaria: " + curso1.getCargaHorariaTotal());
        System.out.println("Curso " + curso2.getNome() + ". Carga horaria: " + curso2.getCargaHorariaTotal());
    }
}
