package person;

import java.util.HashMap;
import java.util.Objects;

public class Paciente {
    private final int id;
    private final String name;
    private final String dataNasc;
    private final String endereco;
    private final String numeroTel;
    private final String responsavel;
    private final String numResponsavel;
    private final boolean isAlergico;

    public String getName() {
        return name;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getNumResponsavel() {
        return numResponsavel;
    }

    public boolean isAlergico() {
        return isAlergico;
    }

    public Paciente(int id, String name, int dataNasc, String endereco,
                    String numeroTel, String responsavel,
                    String numResponsavel, boolean isAlergico) {
        this.id = id;
        this.name = name;
        this.dataNasc = formatarData(String.valueOf(dataNasc));
        this.endereco = endereco;
        this.numeroTel = formatarNumeroTelefone(numeroTel);
        this.responsavel = responsavel;
        this.numResponsavel = formatarNumeroTelefone(numResponsavel);
        this.isAlergico = isAlergico;
    }

    public String formatarData(String data) {
        if (data.length() != 8) {
            return "Data inválida";
        }

        String dia = data.substring(0, 2);
        String mes = data.substring(2, 4);
        String ano = data.substring(4);

        return dia + "/" + mes + "/" + ano;
    }

    public String formatarNumeroTelefone(String numeroTel) {
        String numeroLimpo = numeroTel.replaceAll("[^0-9]", "");

        if (numeroLimpo.length() < 10) {
            return "Número de telefone inválido";
        }

        String codigoArea = numeroLimpo.substring(0, 2);
        String prefixo = numeroLimpo.substring(2, 7);
        String sufixo = numeroLimpo.substring(7);

        return String.format("(%s) %s-%s", codigoArea, prefixo, sufixo);
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "id: " + id + '\n' +
                "name: " + name + '\n' +
                "Nascimento: " + dataNasc + '\n' +
                "Endereco: " + endereco + '\n' +
                "Número de contato: " + numeroTel + '\n' +
                "Responsavel: " + responsavel + '\n' +
                "Número do responsavel: " + numResponsavel + '\n' +
                "Possui alguma alergia? " + isAlergico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return id == paciente.id && isAlergico == paciente.isAlergico && Objects.equals(name, paciente.name) && Objects.equals(dataNasc, paciente.dataNasc) && Objects.equals(endereco, paciente.endereco) && Objects.equals(numeroTel, paciente.numeroTel) && Objects.equals(responsavel, paciente.responsavel) && Objects.equals(numResponsavel, paciente.numResponsavel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dataNasc, endereco, numeroTel, responsavel, numResponsavel, isAlergico);
    }
}
