package med.vol.api.medico;

import med.vol.api.endereco.EnderecoDTO;

public record DadosMedicoDTO(String nome, String email, String crm, Especialidade especialidade, EnderecoDTO endereco) {
}
