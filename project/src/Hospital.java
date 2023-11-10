import person.Paciente;

import java.util.HashMap;

public class Hospital {

    public HashMap<String,Object> cadastrarPaciente(Paciente paciente){
        HashMap<String,Object> myMap = new HashMap<>(){

        };
        myMap.put("id",paciente.getId());
        myMap.put("nome",paciente.getName());
        myMap.put("dataNasc",paciente.getDataNasc());
        myMap.put("endereço",paciente.getEndereco());
        myMap.put("numeroTel",paciente.getNumeroTel());
        myMap.put("responsavel",paciente.getResponsavel());
        myMap.put("numResponsavel",paciente.getNumResponsavel());
        myMap.put("isAlergico",paciente.isAlergico());

        return myMap;
    }
}
