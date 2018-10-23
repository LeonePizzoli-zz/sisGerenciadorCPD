/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.repositorios;

import br.org.laramara.usse.utilitarios.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author leone.pizzoli
 */
public class RepositorioGenerico<Entidade> {

    private final Class<Entidade> classe;

    public RepositorioGenerico() {
        this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public boolean salvar(Entidade entidade) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        boolean retorno = false;
        Transaction transacao = null;
        try {
            transacao = sessao.beginTransaction();
            sessao.save(entidade);
            transacao.commit();
            retorno = true;

        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            retorno = false;
            System.out.println(e); 
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public List<Entidade> listar() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Entidade> resultado = new ArrayList<>();
        try {
             Criteria consulta = sessao.createCriteria(classe);
             Collections.sort(consulta.list());
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            sessao.close();
        }
        return resultado;
    }

    public Entidade buscar(Long codigo) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria consulta = sessao.createCriteria(classe);
            consulta.add(Restrictions.idEq(codigo));

            Entidade resultado = (Entidade) consulta.uniqueResult();
            return (Entidade) resultado;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            sessao.close();
        }
    }

    public void Excluir(Entidade t) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(t);
            transacao.commit();

        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw e;
        } finally {
            sessao.close();
        }
    }

    public void Editar(Entidade t) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        try {
            transacao = sessao.beginTransaction();
            sessao.update(t);
            transacao.commit();

        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw e;
        } finally {
            sessao.close();
        }
    }
}