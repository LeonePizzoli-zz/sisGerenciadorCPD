package br.org.laramara.usse.repositorios;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.utilitarios.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author leone.pizzoli
 */
public class RepositorioServidor extends RepositorioGenerico<Servidor> {

    public List<Equipamento> listarServidorPorID() {
        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.getCurrentSession();

        List<Equipamento> resultado = new ArrayList<Equipamento>();
        try {
            session.getTransaction().begin();

            TypedQuery query = session.createQuery("from Servidor s order by s.id", Servidor.class);
            resultado = query.getResultList();
            session.close();

        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            session.close();
        }
        return resultado;
    }

    public List<Equipamento> listarEquipamentoPorBuscaEspecifica(String textoBusca) {
        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.getCurrentSession();

        List<Equipamento> resultadoString = new ArrayList<Equipamento>();
        
        try {
            session.getTransaction().begin();

            TypedQuery query = session.createQuery("from Servidor where"
                     + " lower(sem_acento(nome)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(marca)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(modelo)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(sistemaOperacional)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(memoriaInstalada)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(capacidadeMemoria)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(processador)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(enderecoIP)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(versaoBios)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(espacoArmazenamento)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(serviceTag)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(tipoEquipamento)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(tipoServidor)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR lower(sem_acento(usuario)) like lower(sem_acento('%"+textoBusca+"%'))"
                    + "OR lower(sem_acento(empresa)) like lower(sem_acento('%"+textoBusca+"%'))"
                            //Integer
                    + "OR str((quantidadeNucleosProcessador)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR str((expressServiceTag)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR str((raid)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR str((quantidadeFonte)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR str((slotsRede)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR str((quantidadeHD)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR str((quantidadeVMs)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                    + "OR str((tempoGarantia)) like lower(sem_acento('%"+textoBusca+"%'))\n"
                            //Data
                    + "OR str((ultimaManutencao)) like lower(sem_acento('%"+textoBusca+"%'))\n", Equipamento.class);
                    
            resultadoString = query.getResultList();
            session.close();

        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            session.close();
        }
        return resultadoString;
    }
  
    public void salvarServidor() {
        Servidor servidor = new Servidor();
        if (servidor.getId() == null) {

        }
    }
}
