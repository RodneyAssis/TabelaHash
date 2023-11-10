import person.Paciente;

import java.util.*;

public class app {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Paciente paciente1 = new Paciente(1,"Ricardo",10071993, "rua a","123456789","Dr.ruan","147258369",false);
        Paciente paciente2 = new Paciente(2,"Rodney",12021998, "avpaulomaialopes","(79) 99860-2185","1","147258369",true);
        Paciente paciente3 = new Paciente(3,"Gilberto",14061999, "rua b","(79) 99860-3040","2","147258369",true);

        ArrayList<HashMap<String,Object>> pacientes = new ArrayList<>();
        pacientes.add(hospital.cadastrarPaciente(paciente1));
        pacientes.add(hospital.cadastrarPaciente(paciente2));
        pacientes.add(hospital.cadastrarPaciente(paciente3));

        Random random = new Random();
        int valor = random.nextInt(3);

        System.out.println(pacientes.get(valor));





        // HashMap<Integer, Paciente> hr = new HashMap<>();
//        var input = new Scanner(System.in);

//        int cont = 0;
//        // fazer com que esse while ele gere pacientes aleatorios use o gpt pra gerar
//        while (true) {
//            System.out.println("Para finalizar operação digite");
//            var opcao = input.next();
//            if (Objects.equals(opcao, "0")) {
//                break;
//            }

//            //Entreda dos dados
//            var idPaciente = cont;
//            System.out.println("Nome Paciente: ");
//            var nomePaciente = input.next();
//            System.out.println("Data de nascimento Paciente: ");
//            var dataNascPaciente = input.nextInt();
//            while (dataNascPaciente < 10000000 || dataNascPaciente > 99999999) {
//                System.out.println("Valor invalido. Por favor digite outra data valor:");
//                dataNascPaciente = input.nextInt();
//            }
//            System.out.println("Endereço do Paciente: ");
//            var enderecoPaciente = input.next();
//            System.out.println("telefone do Paciente: ");
//            var telefonePaciente = input.next();
//            System.out.println("Responsavel pelo Paciente: ");
//            var respPaciente = input.next();
//            System.out.println("Numero do responsavel pelo Paciente: ");
//            var numRespPaciente = input.next();
//            System.out.println("Possui alergia Paciente: ");
//            var isAlergicoPaciente = input.nextBoolean();
//
//            //instanciamento (alguns tratamentos são feitos na classe)
//            Paciente paciente = new Paciente(idPaciente, nomePaciente, dataNascPaciente,
//                    enderecoPaciente, telefonePaciente, respPaciente, numRespPaciente, isAlergicoPaciente);

//            hr.put(paciente.getId(), paciente);
//            cont++;

//        while (true) {
//            System.out.println("Digite o numero de consulta");
//            System.out.println(hr.get(opcao));
//            if (opcao == -1) {
//                break;
//            }
//        }
    }


  }

