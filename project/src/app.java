import person.Paciente;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        HashMap<Integer, Paciente> hr = new HashMap<>();
        var input = new Scanner(System.in);

        int cont = 0;
        // fazer com que esse while ele gere pacientes aleatorios use o gpt pra gerar
        while (true) {
            System.out.println("Para finalizar operação digite");
            var opcao = input.next();
            if (Objects.equals(opcao, "0")) {
                break;
            }

            //Entreda dos dados
            var idPaciente = cont;
            System.out.println("Nome Paciente: ");
            var nomePaciente = input.next();
            System.out.println("Data de nascimento Paciente: ");
            var dataNascPaciente = input.nextInt();
            while (dataNascPaciente < 10000000 || dataNascPaciente > 99999999) {
                System.out.println("Valor invalido. Por favor digite outra data valor:");
                dataNascPaciente = input.nextInt();
            }
            System.out.println("Endereço do Paciente: ");
            var enderecoPaciente = input.next();
            System.out.println("telefone do Paciente: ");
            var telefonePaciente = input.next();
            System.out.println("Responsavel pelo Paciente: ");
            var respPaciente = input.next();
            System.out.println("Numero do responsavel pelo Paciente: ");
            var numRespPaciente = input.next();
            System.out.println("Possui alergia Paciente: ");
            var isAlergicoPaciente = input.nextBoolean();

            //instanciamento (alguns tratamentos são feitos na classe)
            Paciente paciente = new Paciente(idPaciente, nomePaciente, dataNascPaciente,
                    enderecoPaciente, telefonePaciente, respPaciente, numRespPaciente, isAlergicoPaciente);

            hr.put(paciente.getId(), paciente);
            cont++;
        }

        while (true) {
            System.out.println("Digite o numero de consulta");
            var opcao = input.nextInt();
            System.out.println(hr.get(opcao));
            if (opcao == -1) {
                break;
            }
        }
    }
}
