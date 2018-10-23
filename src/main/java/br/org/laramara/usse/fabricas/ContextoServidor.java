package br.org.laramara.usse.fabricas;

import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.utilitarios.Relogio;

/**
 *
 * @author leone.pizzoli
 */
public class ContextoServidor {

    public static Servidor criarServidorComTodosOsDadosCorretos() {
        Servidor servidor = new Servidor();
        try {
            servidor.setTipoEquipamento("Servidor");
            servidor.setQuantidadeVMs("1");
            servidor.setServiceTag("abcde");
            servidor.setNome("Servidor - Test");
            servidor.setSistemaOperacional("Windows Server");
            servidor.setEnderecoIP("10.10.10.103");
            servidor.setDataCadastro(Relogio.obterDataHoraAtual());
            servidor.setDataCompra("05/03/2018");
            servidor.setModelo("154");
            servidor.setMarca("Dell");
            servidor.setCapacidadeMemoria("12");
            servidor.setExpressServiceTag("1234");
            servidor.setMemoriaInstalada("8");
            servidor.setModeloProcessador("Core 2 Duo");
            servidor.setQuantidadeFonte("2");
            servidor.setQuantidadeNucleosProcessador("5");
            servidor.setRaid("100");
            servidor.setSlotsRede("2");
            servidor.setTipoServidor("Gaveta");
            servidor.setVersaoBios("abcde");
            servidor.setQuantidadeHD("2");
            servidor.setEspacoArmazenamento("5");
            servidor.setVersaoSistemaOperacional("Win 2002");
            servidor.setSenha("1234");
            servidor.setUsuario("leone.pizzoli");
            servidor.setUltimaManutencao("26/12/2000");
            servidor.setTempoGarantia("12");
            servidor.setEmpresa("LARAMARA");
            servidor.setSituacaoServidor("Homologação");
            servidor.setStatusServidor("Ativo");
        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
    
    public static Servidor criarServidorVirtualComTodosOsDadosCorretos() {
        Servidor servidor = new Servidor();
        try {
            servidor.setTipoEquipamento("Servidor - Virtual");
            servidor.setQuantidadeVMs("1");
            servidor.setServiceTag("abcde");
            servidor.setNome("Servidor - Test");
            servidor.setSistemaOperacional("Windows Server");
            servidor.setEnderecoIP("10.10.10.103");
            servidor.setDataCadastro(Relogio.obterDataHoraAtual());
            servidor.setDataCompra("05/03/2018");
            servidor.setModelo("154");
            servidor.setMarca("Dell");
            servidor.setCapacidadeMemoria("12");
            servidor.setExpressServiceTag("1234");
            servidor.setMemoriaInstalada("8");
            servidor.setModeloProcessador("Core 2 Duo");
            servidor.setQuantidadeFonte("2");
            servidor.setQuantidadeNucleosProcessador("5");
            servidor.setRaid("100");
            servidor.setSlotsRede("2");
            servidor.setTipoServidor("Gaveta");
            servidor.setVersaoBios("abcde");
            servidor.setQuantidadeHD("2");
            servidor.setEspacoArmazenamento("5");
            servidor.setVersaoSistemaOperacional("Win 2002");
            servidor.setSenha("1234");
            servidor.setUsuario("leone.pizzoli");
            servidor.setUltimaManutencao("26/12/2000");
            servidor.setTempoGarantia("12");
            servidor.setEmpresa("LARAMARA");
            servidor.setSituacaoServidor("Homologação");
            servidor.setStatusServidor("Ativo");
        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }

    public static Servidor criarServidorComOsDadosNaoPreenchidos() {
        Servidor servidor = new Servidor();

        try {
            servidor.setQuantidadeVMs("");
            servidor.setServiceTag("");
            servidor.setNome("");
            servidor.setSistemaOperacional("");
            servidor.setEnderecoIP("");
            servidor.setDataCompra("");
            servidor.setModelo("");
            servidor.setMarca("");
            servidor.setCapacidadeMemoria("");
            servidor.setExpressServiceTag("");
            servidor.setMemoriaInstalada("");
            servidor.setModeloProcessador("");
            servidor.setQuantidadeFonte("");
            servidor.setQuantidadeNucleosProcessador("");
            servidor.setSlotsRede("");
            servidor.setTipoServidor("");
            servidor.setVersaoBios("");
            servidor.setQuantidadeHD("");
            servidor.setEspacoArmazenamento("");
            servidor.setVersaoSistemaOperacional("");
            servidor.setTipoEquipamento("");
            servidor.setSenha("");
            servidor.setUsuario("");
            servidor.setUltimaManutencao("");
            servidor.setTempoGarantia("");
            servidor.setEmpresa("");
            servidor.setSituacaoServidor("");
            servidor.setStatusServidor("");

        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
    
    public static Servidor criarServidorVirtualComOsDadosNaoPreenchidos() {
        Servidor servidor = new Servidor();

        try {
            servidor.setQuantidadeVMs("");
            servidor.setServiceTag("");
            servidor.setNome("");
            servidor.setSistemaOperacional("");
            servidor.setEnderecoIP("");
            servidor.setDataCompra("");
            servidor.setModelo("");
            servidor.setMarca("");
            servidor.setCapacidadeMemoria("");
            servidor.setExpressServiceTag("");
            servidor.setMemoriaInstalada("");
            servidor.setModeloProcessador("");
            servidor.setQuantidadeFonte("");
            servidor.setQuantidadeNucleosProcessador("");
            servidor.setSlotsRede("");
            servidor.setTipoServidor("");
            servidor.setVersaoBios("");
            servidor.setQuantidadeHD("");
            servidor.setEspacoArmazenamento("");
            servidor.setVersaoSistemaOperacional("");
            servidor.setTipoEquipamento("");
            servidor.setSenha("");
            servidor.setUsuario("");
            servidor.setUltimaManutencao("");
            servidor.setTempoGarantia("");
            servidor.setEmpresa("");
            servidor.setSituacaoServidor("");
            servidor.setStatusServidor("");

        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
    
    public static Servidor criarServidorComOsDadosNaoConsistentes() {
        Servidor servidor = new Servidor();

        try {
            servidor.setQuantidadeVMs("asd");
            servidor.setServiceTag("da");
            servidor.setNome("ssads");
            servidor.setSistemaOperacional("asd");
            servidor.setEnderecoIP("1234654");
            servidor.setDataCompra("12/13/2000");
            servidor.setModelo("ass");
            servidor.setMarca("dasd");
            servidor.setCapacidadeMemoria("ads");
            servidor.setExpressServiceTag("asa");
            servidor.setMemoriaInstalada("ads");
            servidor.setModeloProcessador("das");
            servidor.setQuantidadeFonte("das");
            servidor.setQuantidadeNucleosProcessador("dsa");
            servidor.setRaid("da");
            servidor.setSlotsRede("da");
            servidor.setTipoServidor("dsa");
            servidor.setVersaoBios("dsa");
            servidor.setQuantidadeHD("das");
            servidor.setEspacoArmazenamento("das");
            servidor.setVersaoSistemaOperacional("dbj");
            servidor.setTipoEquipamento("dsa");
            servidor.setSenha("dsa");
            servidor.setUsuario("dsa");
            servidor.setUltimaManutencao("dsa");
            servidor.setTempoGarantia("dsad");

        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
    
    public static Servidor criarServidorVirtualComOsDadosNaoConsistentes() {
        Servidor servidor = new Servidor();

        try {
            servidor.setQuantidadeVMs("asd");
            servidor.setServiceTag("da");
            servidor.setNome("ssads");
            servidor.setSistemaOperacional("asd");
            servidor.setEnderecoIP("1234654");
            servidor.setDataCompra("12/13/2000");
            servidor.setModelo("ass");
            servidor.setMarca("dasd");
            servidor.setCapacidadeMemoria("ads");
            servidor.setExpressServiceTag("asa");
            servidor.setMemoriaInstalada("ads");
            servidor.setModeloProcessador("das");
            servidor.setQuantidadeFonte("das");
            servidor.setQuantidadeNucleosProcessador("dsa");
            servidor.setRaid("da");
            servidor.setSlotsRede("da");
            servidor.setTipoServidor("dsa");
            servidor.setVersaoBios("dsa");
            servidor.setQuantidadeHD("das");
            servidor.setEspacoArmazenamento("das");
            servidor.setVersaoSistemaOperacional("dbj");
            servidor.setTipoEquipamento("dsa");
            servidor.setSenha("dsa");
            servidor.setUsuario("dsa");
            servidor.setUltimaManutencao("dsa");
            servidor.setTempoGarantia("dsad");

        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
    
    public static Servidor criarServidorComOsDadosAcimaDoLimiteDeCaracteres() {
        Servidor servidor = new Servidor();

        try {
            servidor.setQuantidadeVMs("asd");
            servidor.setServiceTag("da");
            servidor.setNome("addsadsadsadsadsadsadsaddgfdgfasss");
            servidor.setSistemaOperacional("asdsadsadsasdasdasdssasdasdasdasdd");
            servidor.setEnderecoIP("1234654");
            servidor.setDataCompra("12/13/2000");
            servidor.setModelo("asdasdsadsadasdsadasssdadasda");
            servidor.setMarca("dasd");
            servidor.setCapacidadeMemoria("ads");
            servidor.setExpressServiceTag("1234567890123");
            servidor.setMemoriaInstalada("ads");
            servidor.setModeloProcessador("das");
            servidor.setQuantidadeFonte("das");
            servidor.setQuantidadeNucleosProcessador("dsa");
            servidor.setRaid("da");
            servidor.setSlotsRede("da");
            servidor.setTipoServidor("dsa");
            servidor.setVersaoBios("dsa");
            servidor.setQuantidadeHD("das");
            servidor.setEspacoArmazenamento("das");
            servidor.setVersaoSistemaOperacional("dbjkjdfjkdjsskdskjdkjssdjkdkjdkjsas");
            servidor.setTipoEquipamento("dsa");
            servidor.setSenha("dsa");
            servidor.setUsuario("dsa");
            servidor.setUltimaManutencao("dsa");
            servidor.setTempoGarantia("dsad");

        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
    
    public static Servidor criarServidorVirtualComOsDadosAcimaDoLimiteDeCaracteres() {
        Servidor servidor = new Servidor();

        try {
            servidor.setQuantidadeVMs("asd");
            servidor.setServiceTag("da");
            servidor.setNome("addsadsadsadsadsadsadsaddgfdgfasss");
            servidor.setSistemaOperacional("asdsadsadsasdasdasdssasdasdasdasdd");
            servidor.setEnderecoIP("1234654");
            servidor.setDataCompra("12/13/2000");
            servidor.setModelo("asdasdsadsadasdsadasssdadasda");
            servidor.setMarca("dasd");
            servidor.setCapacidadeMemoria("ads");
            servidor.setExpressServiceTag("1234567890123");
            servidor.setMemoriaInstalada("ads");
            servidor.setModeloProcessador("das");
            servidor.setQuantidadeFonte("das");
            servidor.setQuantidadeNucleosProcessador("dsa");
            servidor.setRaid("da");
            servidor.setSlotsRede("da");
            servidor.setTipoServidor("dsa");
            servidor.setVersaoBios("dsa");
            servidor.setQuantidadeHD("das");
            servidor.setEspacoArmazenamento("das");
            servidor.setVersaoSistemaOperacional("dbjkjdfjkdjsskdskjdkjssdjkdkjdkjsas");
            servidor.setTipoEquipamento("dsa");
            servidor.setSenha("dsa");
            servidor.setUsuario("dsa");
            servidor.setUltimaManutencao("dsa");
            servidor.setTempoGarantia("dsad");

        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
}