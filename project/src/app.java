import person.Paciente;

import java.util.HashMap;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        HashMap<Integer, Paciente> hr = new HashMap<>();
        var input = new Scanner(System.in);

        int cont = 0;

        // Lista de valores
        String[] nomes = {"João", "Maria", "Carlos", "Ana", "Pedro", "Luísa", "Rafael", "Mariana", "Felipe", "Juliana"};
        Integer[] datas = {12021998, 25071974, 24051999, 25051999};
        String[] enderecos = {
                "Av Paulo Maia, 79, Condominio Vida Bela Praia Mar",
                "Rua Tobias, 123, Bairro Feliz",
                "Avenida Central, 456, Centro",
                "Travessa das Flores, 789, Jardim Encantado",
                "Rua das Palmeiras, 321, Vila Verde",
                "Alameda dos Pássaros, 567, Parque Primavera",
                "Praça da Liberdade, 890, Liberdade",
                "Avenida das Águas, 234, Beira Mar"};
        String[] telefones = {"79998602185", "123456789", "987654321", "555555555", "88887777666",
                "11112222333", "44443333222", "66667777888", "99998888777",
                "33334444555", "22221111000"};
        Boolean[] isalegico = {true, false};


        // fazer com que esse while ele gere pacientes aleatorios use o gpt pra gerar
        System.out.println("Digite a quantidade de pacientes para a simulução: ");
        var opcao = input.nextInt();
        while (opcao != cont) {
            //Entreda dos dados
            var idPaciente = cont;
            var nomePaciente = nomes[(int) (Math.random() * nomes.length)];
            var dataNascPaciente = datas[(int) (Math.random() * datas.length)];
            var enderecoPaciente = enderecos[(int) (Math.random() * enderecos.length)];
            var telefonePaciente = telefones[(int) (Math.random() * telefones.length)];
            var respPaciente = nomes[(int) (Math.random() * nomes.length)];
            var numRespPaciente = telefones[(int) (Math.random() * telefones.length)];
            var isAlergicoPaciente = isalegico[(int) (Math.random() * isalegico.length)];

            //instanciamento (alguns tratamentos são feitos na classe)
            Paciente paciente = new Paciente(idPaciente, nomePaciente, dataNascPaciente,
                    enderecoPaciente, telefonePaciente, respPaciente, numRespPaciente, isAlergicoPaciente);

            hr.put(paciente.getId(), paciente);
            cont++;
        }

        do {
            System.out.println("\n\nDigite o numero de consulta");
            opcao = input.nextInt();
            System.out.println(hr.get(opcao-1));
        } while (opcao != -1);
    }
}
