package br.org.laramara.usse.controladores;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.fabricas.FabricaServidor;
import br.org.laramara.usse.repositorios.RepositorioEquipamento;
import br.org.laramara.usse.utilitarios.Mensagem;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author leone.pizzoli
 */
public class ControladorTelaEditarEquipamento extends ControladorTela {

    private JInternalFrame tela;
    private JComboBox jcbMarca;
    private JComboBox jcbTipoEquipamento;
    private JComboBox jcbTipoServidor;
    private JComboBox jcbRaid;
    private JComboBox jcbStatusServidor;
    private JComboBox jcbSituacaoServidor;
    private JTextField jtfDataCompra;
    private JTextField jtfNomeServidor;
    private JTextField jtfModelo;
    private JComboBox jcbEmpresa;
    private JTextField jtfSistemaOperacional;
    private JTextField jtfEnderecoIP;
    private JTextField jtfDataManutencao;
    private JTextField jtfQuantidadeVMs;
    private JTextField jtfServiceTag;
    private JTextField jtfCapacidadeMemoria;
    private JTextField jtfDeptoDeDestino;
    private JTextField jtfDeptoInstalacao;
    private JTextField jtfExpressServiceTag;
    private JTextField jtfIpEquipamento;
    private JTextField jtfMemoriaInstalada;
    private JTextField jtfNomeEquipamento;
    private JTextField jtfPortaAcesso;
    private JTextField jtfProcessador;
    private JTextField jtfQntdeFontes;
    private JTextField jtfQntdeHD;
    private JTextField jtfQntdeNucleosProcessador;
    private JTextField jtfQntdePortas;
    private JTextField jtfSenhaEquipamento;
    private JTextField jtfSlotsRede;
    private JTextField jtfTempoGarantia;
    private JTextField jtfUsuarioEquipamento;
    private JTextField jtfVersaoBios;
    private JTextField jtfEspacoArmazenamento;
    private JTextField jtfVersaoSistemaOperacional;
    private RepositorioEquipamento repositorioEquipamento;
    private Equipamento equipamento;

    public ControladorTelaEditarEquipamento(JInternalFrame tela, JTextField jtfDataCompra, JTextField jtfNomeServidor, JComboBox jcbMarca, JTextField jtfModelo, JTextField jtfSistemaOperacional, JTextField jtfEnderecoIP, JComboBox jcbTipoEquipamento, JComboBox jcbTipoServidor, JTextField jtfDataManutencao, JTextField jtfQuantidadeVMs, JTextField jtfServiceTag, JTextField jtfCapacidadeMemoria, JTextField jtfDeptoDeDestino, JTextField jtfDeptoInstalacao, JTextField jtfExpressServiceTag, JTextField jtfIpEquipamento, JTextField jtfMemoriaInstalada, JTextField jtfNomeEquipamento, JTextField jtfPortaAcesso, JTextField jtfProcessador, JTextField jtfQntdeFontes, JTextField jtfQntdeHD, JTextField jtfQntdeNucleosProcessador, JTextField jtfQntdePortas, JComboBox jcbRaid, JTextField jtfSenhaEquipamento, JTextField jtfSlotsRede, JTextField jtfTempoGarantia, JTextField jtfUsuarioEquipamento, JTextField jtfVersaoBios, JTextField jtfEspacoArmazenamento, JTextField jtfVersaoSistemaOperacional, JComboBox jcbEmpresa, JComboBox jcbStatusServidor, JComboBox jcbSituacaoServidor, JFrame telaPrincipal, JDesktopPane desktop) {
        super(telaPrincipal, desktop);
        this.tela = tela;
        this.jtfVersaoSistemaOperacional = jtfVersaoSistemaOperacional;
        this.jtfEspacoArmazenamento = jtfEspacoArmazenamento;
        this.jtfDataCompra = jtfDataCompra;
        this.jtfNomeServidor = jtfNomeServidor;
        this.jcbMarca = jcbMarca;
        this.jtfModelo = jtfModelo;
        this.jtfSistemaOperacional = jtfSistemaOperacional;
        this.jtfEnderecoIP = jtfEnderecoIP;
        this.jcbTipoEquipamento = jcbTipoEquipamento;
        this.jcbTipoServidor = jcbTipoServidor;
        this.jcbSituacaoServidor = jcbSituacaoServidor;
        this.jcbStatusServidor = jcbStatusServidor;
        this.jtfDataManutencao = jtfDataManutencao;
        this.jtfQuantidadeVMs = jtfQuantidadeVMs;
        this.jtfServiceTag = jtfServiceTag;
        this.jtfCapacidadeMemoria = jtfCapacidadeMemoria;
        this.jtfDeptoDeDestino = jtfDeptoDeDestino;
        this.jtfDeptoInstalacao = jtfDeptoInstalacao;
        this.jtfExpressServiceTag = jtfExpressServiceTag;
        this.jtfIpEquipamento = jtfIpEquipamento;
        this.jtfMemoriaInstalada = jtfMemoriaInstalada;
        this.jtfNomeEquipamento = jtfNomeEquipamento;
        this.jtfPortaAcesso = jtfPortaAcesso;
        this.jtfProcessador = jtfProcessador;
        this.jtfQntdeFontes = jtfQntdeFontes;
        this.jtfQntdeHD = jtfQntdeHD;
        this.jtfQntdeNucleosProcessador = jtfQntdeNucleosProcessador;
        this.jtfQntdePortas = jtfQntdePortas;
        this.jcbRaid = jcbRaid;
        this.jtfSenhaEquipamento = jtfSenhaEquipamento;
        this.jtfSlotsRede = jtfSlotsRede;
        this.jtfTempoGarantia = jtfTempoGarantia;
        this.jtfUsuarioEquipamento = jtfUsuarioEquipamento;
        this.jtfVersaoBios = jtfVersaoBios;
        this.jcbEmpresa = jcbEmpresa;
        this.repositorioEquipamento = new RepositorioEquipamento();
        limparCampos();
    }

    public void fecharTela() {
        tela.setVisible(false);
        limparCampos();
    }

    private void limparCampos() {
        jtfDataCompra.setText("");
        jtfNomeServidor.setText("");
        jcbMarca.setSelectedIndex(0);
        jtfModelo.setText("");
        jtfSistemaOperacional.setText("");
        jtfEnderecoIP.setText("");
        jtfServiceTag.setText("");
        jtfMemoriaInstalada.setText("");
        jtfCapacidadeMemoria.setText("");
        jtfProcessador.setText("");
        jtfQntdeNucleosProcessador.setText("");
        jtfExpressServiceTag.setText("");
        jtfQntdeFontes.setText("");
        jtfSlotsRede.setText("");
        jtfQntdeHD.setText("");
        jtfQuantidadeVMs.setText("");
        jtfVersaoBios.setText("");
        jtfEspacoArmazenamento.setText("");
        jtfVersaoSistemaOperacional.setText("");
        jtfTempoGarantia.setText("");
        jtfUsuarioEquipamento.setText("");
        jtfSenhaEquipamento.setText("");
        jtfDataManutencao.setText("");
        jcbRaid.setSelectedIndex(0);
        jcbTipoEquipamento.setSelectedIndex(0);
        jcbTipoServidor.setSelectedIndex(0);
        jcbSituacaoServidor.setSelectedIndex(0);
        jcbStatusServidor.setSelectedIndex(0);
        jcbEmpresa.setSelectedIndex(0);
    }

    public void cadastrarEquipamento() {
        try {
            if (jcbTipoEquipamento.getSelectedItem().toString().equals("Servidor") || jcbTipoEquipamento.getSelectedItem().toString().equals("Servidor - Virtual")) {

                equipamento
                        = FabricaServidor.obterServidor(jtfDataCompra.getText(),
                                jtfNomeServidor.getText(), jcbMarca.getSelectedItem().toString(), jtfModelo.getText(), jtfSistemaOperacional.getText(),
                                jtfEnderecoIP.getText(), jcbTipoEquipamento.getSelectedItem().toString(), jtfDataManutencao.getText(),
                                jtfQuantidadeVMs.getText(), jtfServiceTag.getText(), jtfUsuarioEquipamento.getText(), jtfSenhaEquipamento.getText(), jtfMemoriaInstalada.getText(), jtfCapacidadeMemoria.getText(), jtfProcessador.getText(), jtfQntdeNucleosProcessador.getText(),
                                jtfExpressServiceTag.getText(), jcbRaid.getSelectedItem().toString(), jcbTipoServidor.getSelectedItem().toString(), jtfQntdeFontes.getText(), jtfSlotsRede.getText(),
                                jtfQntdeHD.getText(), jtfVersaoBios.getText(), jtfTempoGarantia.getText(), jtfEspacoArmazenamento.getText(), jtfVersaoSistemaOperacional.getText(), jcbEmpresa.getSelectedItem().toString(), jcbSituacaoServidor.getSelectedItem().toString(), jcbStatusServidor.getSelectedItem().toString());

                ((Servidor) equipamento).validarServidor();

                if (equipamento.validado()) {

                    if (ControladorTelaEditarEquipamento.this.salvarEquipamento(equipamento)) {
                        Mensagem.exibirMensagem(equipamento.getTipoEquipamento() + " salvo com sucesso!");
                        limparCampos();
                    }

                } else {
                    Mensagem.exibirMensagem(((Servidor) equipamento).obterDescricaoErros());
                }
            }

            if (jcbTipoEquipamento.getSelectedItem().toString().equals("Roteador")) {
                Mensagem.exibirMensagem("Roteador");

            }
            if (jcbTipoEquipamento.getSelectedItem().toString().equals("Switch")) {
                Mensagem.exibirMensagem("Switch");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean salvarEquipamento(Equipamento e) {
        return repositorioEquipamento.salvar(e);
    }

    public void mostrarTela() {
        tela.setVisible(true);
    }
}
