package br.org.laramara.usse.modelos;

import java.io.Serializable;

/**
 *
 * @author leone.pizzoli
 */
public enum ChavePesquisa implements Serializable {
    NOME("Nome Equipamento"),
    DATA_COMPRA("Data de Compra"),
    TEMPO_GARANTIA("Tempo de Garantia"),
    ENDERECO_IP("Endereço IP"),
    MARCA("Marca"),
    MODELO("Modelo"),
    USUARIO("Usuario"),
    SENHA("Senha"),
    MEMORIA_INSTALADA("Memória Instalada"),
    CAPACIDADE_MEMORIA("Capacidade de Memória"),
    PROCESSADOR("Processador"),
    QUANTIDADE_NUCLEOS("Quantidade de Núcleos"),
    QUANTIDADE_HD("Quantidade de HD"),
    RAID("Raid"),
    ESPACO_ARMAZENAMENTO("Espaço de armazenamento"),
    TIPO_SERVIDOR("Tipo de Servidor"),
    SISTEMA_OPERACIONAL("Sistema Operacional"),
    VERSAO_SO("Versão do Sistema Operacional"),
    QUANTIDADE_VMS("Quantidade de VMs"),
    SLOTS_REDE("Slots de Rede"),    
    VERSAO_BIOS("Versão da Bios"),
    QUANTIDADE_FONTES("Quantidade de Fontes"),
    SERVICE_TAG("Service Tag"),
    EXPRESS_SERVICE_TAG("Express Service Tag"),
    ULTIMA_MANUTENCAO("Ultima Manutenção");

    private String descricao;

    private ChavePesquisa(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return descricao;
    }

}
