package br.org.laramara.usse.modelos;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.utilitarios.DataHoraUtils;

public class ModeloTabelaEquipamento extends ModeloTabela<Equipamento> {

    public ModeloTabelaEquipamento() {
        super(new String[]{"Nome Equipamento", "EnderecoIP",  "Empresa",  "Marca",    "Modelo", "Data Cadastro", "Data Compra", "Tempo garantia", "Usuario", "Senha", "Sistema Operacional", "Versão S.O", "Quantidade Vms", "ServiceTag", "Express ServiceTag", "Data Manutencao", "Memoria Instalada(GB)", "Capacidade Memoria(GB)", "Quantidade HD", "Espaço Armazenamento(GB)", "Processador", "Quantidade Núcleos", "Raid",     "Tipo Servidor", "Fontes",   "Slots Rede",   "Versão Bios", "Status Servidor", "Situação Servidor"},
                new Class[]{String.class,     String.class, String.class, String.class,String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, Integer.class,        String.class, String.class,         String.class,    Integer.class,             Integer.class,           Integer.class,    String.class,                String.class, Integer.class,      Integer.class, String.class, Integer.class, Integer.class, String.class, String.class,       String.class},
                new int[]{  80,               80,           80,            80,          80,           80,          80,           80,            80,           80,           80,           80,           80,                   80,           80,                   80,              80,                        80,                      80,               80,                          80,           80,                 80,            80,           80,            80,            80,           80,                 80});
    }

    @Override
    public void adicionarDado(Equipamento equipamento) {

        addRow(new Object[]{
            equipamento.getNome(),
            equipamento.getEnderecoIP(),
            equipamento.getEmpresa(),
            equipamento.getMarca(),
            equipamento.getModelo(),
            DataHoraUtils.formatarData(equipamento.getDataCadastro()),
            DataHoraUtils.formatarData(equipamento.getDataCompra()),
            ((Servidor) equipamento).getTempoGarantia(),
            equipamento.getUsuario(),
            equipamento.getSenha(),
            ((Servidor) equipamento).getSistemaOperacional(),
            ((Servidor) equipamento).getVersaoSistemaOperacional(),
            ((Servidor) equipamento).getQuantidadeVMs(),
            ((Servidor) equipamento).getServiceTag(),
            ((Servidor) equipamento).getExpressServiceTag(),
            DataHoraUtils.formatarData(((Servidor) equipamento).getUltimaManutencao()),
            ((Servidor) equipamento).getMemoriaInstalada(),
            ((Servidor) equipamento).getCapacidadeMemoria(),
            ((Servidor) equipamento).getQuantidadeHD(),
            ((Servidor) equipamento).getEspacoArmazenamento(),
            ((Servidor) equipamento).getModeloProcessador(),
            ((Servidor) equipamento).getQuantidadeNucleosProcessador(),
            ((Servidor) equipamento).getRaid(),
            ((Servidor) equipamento).getTipoServidor(),
            ((Servidor) equipamento).getQuantidadeFonte(),
            ((Servidor) equipamento).getSlotsRede(),
            ((Servidor) equipamento).getVersaoBios(),
            ((Servidor) equipamento).getSituacaoServidor(),
            ((Servidor) equipamento).getStatusServidor()
        });
    }
}
