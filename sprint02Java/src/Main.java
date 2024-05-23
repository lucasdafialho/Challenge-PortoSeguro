import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Sistema Iniciando!");

        // Adicionar login ou cadastro de usuário aqui.

        menu();

        System.out.println("Sistema Finalizado!");
    }

    public static void cadastrarCarro() {
        System.out.println("Digite a placa do Veículo: ");
        String placa = scanner.nextLine();
        System.out.println("Digite a cor do carro: ");
        String cor = scanner.nextLine();
        System.out.println("Digite o ano do carro: ");
        int ano = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o tipo de combustível do Veículo: ");
        String tipoCombustivel = scanner.nextLine();
        System.out.println("Digite a quilometragem do Veículo: ");
        double quilometragem = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o tipo de transmissão do Veículo: ");
        String transmissao = scanner.nextLine();
        System.out.println("Digite se houveram manutenções no Veículo (true/false): ");
        boolean manutencoes = Boolean.parseBoolean(scanner.nextLine());

        Veiculo veiculo = new Veiculo(placa, cor, ano, tipoCombustivel, quilometragem, transmissao, manutencoes);
        veiculos.add(veiculo);

        System.out.println("Veículo cadastrado com sucesso!");
    }

    public static void menu() {
        System.out.println("Bem vindo ao sistema de controle do carro!");

        while (true) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Editar Veículo");
            System.out.println("3 - Remover Veículo");
            System.out.println("4 - Realizar o Diagnóstico");
            System.out.println("5 - Histórico de Diagnóstico");
            System.out.println("6 - Sair");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarCarro();
                    break;
                case 2:
                    editarVeiculo();
                    break;
                case 3:
                    removerVeiculo();
                    break;
                case 4:
                    realizarDiagnostico();
                    break;
                case 5:
                    exibirHistoricoDiagnostico();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void editarVeiculo() {
        System.out.println("Digite a placa do veículo que deseja editar: ");
        String placa = scanner.nextLine();

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                System.out.println("Digite a nova cor do veículo: ");
                veiculo.setCor(scanner.nextLine());
                System.out.println("Digite o novo ano do veículo: ");
                veiculo.setAno(Integer.parseInt(scanner.nextLine()));
                System.out.println("Digite o novo tipo de combustível do veículo: ");
                veiculo.setTipoCombustivel(scanner.nextLine());
                System.out.println("Digite a nova quilometragem do veículo: ");
                veiculo.setQuilometragem(Double.parseDouble(scanner.nextLine()));
                System.out.println("Digite o novo tipo de transmissão do veículo: ");
                veiculo.setTransmissao(scanner.nextLine());
                System.out.println("Digite se houve manutenção no veículo (true/false): ");
                veiculo.setManutencoes(Boolean.parseBoolean(scanner.nextLine()));

                System.out.println("Veículo editado com sucesso!");
                return;
            }
        }
                System.out.println("Veículo não encontrado!");
    }

    private static void removerVeiculo() {
        System.out.println("Digite a placa do veículo que deseja remover: ");
        String placa = scanner.nextLine();

        Veiculo veiculoParaRemover = null;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculoParaRemover = veiculo;
                break;
            }
        }

        if (veiculoParaRemover != null) {
            veiculos.remove(veiculoParaRemover);
            System.out.println("Veículo removido com sucesso!");
        } else {
            System.out.println("Veículo não encontrado!");
        }
    }

    private static void realizarDiagnostico() {
        System.out.println("Digite a placa do veículo para realizar o diagnóstico: ");
        String placa = scanner.nextLine();

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                // Implementação do diagnóstico aqui
                System.out.println("Realizando diagnóstico do veículo com placa " + placa + "...");
                System.out.println("Diagnóstico realizado com sucesso!");
                return;
            }
        }

        System.out.println("Veículo não encontrado!");
    }

    private static void exibirHistoricoDiagnostico() {
        if (veiculos.isEmpty()) {
            System.out.println("Não há veículos cadastrados.");
        } else {
            System.out.println("Exibindo histórico de diagnóstico...");
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo);
            }
        }
    }
}


