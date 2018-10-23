package br.org.laramara.usse.testes.utilitarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.utilitarios.DataHoraUtils;
import org.junit.Test;
import static org.junit.Assert.*;
import br.org.laramara.usse.utilitarios.Relogio;

/**
 *
 * @author leone.pizzoli
 */
public class RelogioTeste {

    @Test
    public void verifica_se_data_de_compra_esta_ok() {
        
        String dataHora = DataHoraUtils.formatarDataHora(Relogio.mudarDataHoraAtual("17/02/2018 00:00:00"));
        String dataHoraDaCompra = DataHoraUtils.formatarDataHora(Relogio.obterDataHoraAtual());

        assertEquals(dataHora, dataHoraDaCompra);
    }

    @Test
    public void verifica_se_data_de_cadastro_esta_ok() {
       
        Relogio.mudarDataHoraAtual("19/02/2018 00:00:00");
        String dataHora = DataHoraUtils.formatarDataHora(Relogio.obterDataHoraAtual());
        assertEquals(dataHora, "19/02/2018 00:00:00");
    }

    @Test
    public void verifica_a_hora_que_o_servidor_esta_sendo_criado() {

        String dataHora = DataHoraUtils.formatarDataHora(Relogio.mudarDataHoraAtual("19/02/2018 00:00:00"));
        Servidor server = new Servidor();
        assertEquals(server.getDataCadastro(), "19/02/2018 00:00:00");

    }

}
