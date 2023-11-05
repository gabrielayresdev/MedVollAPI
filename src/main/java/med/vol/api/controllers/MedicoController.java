package med.vol.api.controllers;

import med.vol.api.medico.DadosMedicoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @PostMapping
    public void cadastro(@RequestBody DadosMedicoDTO dados) {
        System.out.println(dados.nome());
    }
}
