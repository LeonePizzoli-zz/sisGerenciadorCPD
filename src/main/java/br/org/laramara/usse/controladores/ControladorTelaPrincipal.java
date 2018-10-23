package br.org.laramara.usse.controladores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author l
 */
public class ControladorTelaPrincipal extends ControladorTela {

                
    private JMenuItem menuCadastroServidores,
            menuCadastroFuncionario, 
            menuCadastroUsuario,
            menuCadastroProduto,
            menuConsultar, 
            menuRegistrarCompraProduto, 
            menuRegistrarContribuicao,
            menuRegistrarDespesa, 
            menuRegistrarVenda,
            menuCaixa,
            menuAjudaSobre,
            menuOpcoesConfiguracoes,
            menuOpcoesSair;
    private JLabel lblUsuario,
            lblHora,
            lblDiaSemana,
            lblData;
    private Timer timer;
    private JDesktopPane desktop;

    public ControladorTelaPrincipal(JFrame telaPrincipal, JDesktopPane desktop, JMenuItem cadastroServidores, JMenuItem cadastroFuncionario, JMenuItem cadastroUsuario,
            JMenuItem cadastroProduto, JMenuItem consultar, JMenuItem compraProduto,
            JMenuItem contribuicao, JMenuItem despesa, JMenuItem venda,
            JMenuItem caixa, JMenuItem sobre, JMenuItem configuracoes,
            JMenuItem sair, JLabel lblUsuario, JLabel lblHora, JLabel lblDiaSemana,
            JLabel lblData) {
        super(telaPrincipal, desktop);
        this.menuCadastroServidores = cadastroServidores;
        this.menuCadastroFuncionario = cadastroFuncionario;
        this.menuCadastroUsuario = cadastroUsuario;
        this.menuCadastroProduto = cadastroProduto;
        this.menuConsultar = consultar;
        this.menuRegistrarCompraProduto = compraProduto;
        this.menuRegistrarContribuicao = contribuicao;
        this.menuRegistrarDespesa = despesa;
        this.menuRegistrarVenda = venda;
        this.menuCaixa = caixa;
        this.menuAjudaSobre = sobre;
        this.menuOpcoesConfiguracoes = configuracoes;
        this.menuOpcoesSair = sair;
        this.lblUsuario = lblUsuario;
        this.lblHora = lblHora;
        this.lblDiaSemana = lblDiaSemana;
        this.lblData = lblData;
        this.desktop = desktop;

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarHora();

            }
        });
        timer.start();

        atualizarData();
        verificarFimSemana();
        
        //   acessoRapido(telaPrincipal, desktop);

        /*  usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaCadastroUsuario();
            }
        });*/
        caixa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //telaCaixa();
            }
        });
        sobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaSobre();
            }
        });
        configuracoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // telaConfiguracoes();
            }
        });
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sair();
            }
        });
        consultar.addMouseListener(new MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                //telaConsulta();
            }
        });
        telaPrincipal.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fechar();
            }
        });
    }
    public ControladorTelaPrincipal(JFrame telaPrincipal, JDesktopPane desktop) {
        super(telaPrincipal, desktop);
        
        this.lblUsuario = lblUsuario;
        this.lblHora = lblHora;
        this.lblDiaSemana = lblDiaSemana;
        this.lblData = lblData;
        this.desktop = desktop;

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarHora();

            }
        });
        timer.start();

        atualizarData();
        verificarFimSemana();
        
        //   acessoRapido(telaPrincipal, desktop);

        /*  usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaCadastroUsuario();
            }
        });*/
       
        telaPrincipal.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fechar();
            }
        });
    }
    

    private void atualizarHora() {
        // Hora
        lblHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void atualizarData() {
        // Data
        lblData.setText(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
        // Dia da semana
        lblDiaSemana.setText(new SimpleDateFormat("EEEE").format(new Date()));
        // Hora
        lblHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void verificarFimSemana() {
        if (lblDiaSemana.getText().equals("Quarta-Feira")) {
            lblDiaSemana.setForeground(Color.red);
        }
    }

    private void fechar() {
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void sair() {
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    public void abrirTela(){
    }
}
