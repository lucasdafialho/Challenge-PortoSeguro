import java.util.ArrayList;
import java.util.List;

public class HistoricoDiagnostico {
    private static final List<Veiculo> veiculos = new ArrayList<>();
    private int id_historico;
    static void exibirHistoricoDiagnostico() {
        if (veiculos.isEmpty()) {
            System.out.println("Não há veículos cadastrados.");
        } else {
            System.out.println("Exibindo histórico de diagnóstico...");
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo);
            }
        }
    }

    public HistoricoDiagnostico() {
    }

    public HistoricoDiagnostico(int id_historico) {
        this.id_historico = id_historico;
    }

    public int getId_historico() {
        return id_historico;
    }

    public void setId_historico(int id_historico) {
        this.id_historico = id_historico;
    }

    @Override
    public String toString() {
        return "HistoricoDiagnostico{" +
                "id_historico=" + id_historico +
                '}';
    }
}
