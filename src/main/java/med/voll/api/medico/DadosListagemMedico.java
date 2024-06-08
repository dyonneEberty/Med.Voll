package med.voll.api.medico;

public record DadosListagemMedico(
        String medico,
        String email,
        String crm,
        Especialidade especialidade
) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
