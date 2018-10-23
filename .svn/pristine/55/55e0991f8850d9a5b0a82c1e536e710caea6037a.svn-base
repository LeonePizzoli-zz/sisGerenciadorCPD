package br.org.laramara.usse.repositorios;

import br.org.laramara.usse.dominio.Equipamento;
import java.util.List;


public class RepositorioEquipamento extends RepositorioGenerico<Equipamento> {

    public void listarTodos() {
        RepositorioEquipamento repositorioEquipamento = new RepositorioEquipamento();
        List<Equipamento> resultado = repositorioEquipamento.listar();

        for (Equipamento equipamento : resultado) {
            System.out.println(equipamento.toString());
        }
        System.out.println("Total de Registros: " + resultado.size());
    }
}