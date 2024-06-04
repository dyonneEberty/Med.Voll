package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

// Java cria uma classe imutavel, cada um dos campos tera os respectivos atributos, cria os getters e setters, cria o construtor. Não precisando digitar essa parte de codigo.
public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco) {

}
