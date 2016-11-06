package br.com.brunotonia.soap.util;

import br.com.brunotonia.soap.vo.Carro;
import javax.swing.table.DefaultTableModel;

public class JTableUtil {
    
    public DefaultTableModel geraTabelaCartas(Carro[] lista) {
        DefaultTableModel resultado = new DefaultTableModel();
        if (lista == null) {
            resultado.addColumn("Erro");
            resultado.addRow(new String[]{"Sem carros a Exibir"});
        } else {
            resultado.addColumn("Fabricante");
            resultado.addColumn("Nome");
            resultado.addColumn("Pais");
            resultado.addColumn("Potência (CV)");
            resultado.addColumn("Peso (Kg)");
            resultado.addColumn("Vel. Máxima (Km/h)");
            resultado.addColumn("Cilindros");
            resultado.addColumn("Cilindradas");
            resultado.addColumn("Ano de Fabric.");
            for (Carro carro: lista) {
                String s[] = {carro.getFabricante(), carro.getNome(), carro.getPais(), carro.getPotencia().toString(),
                carro.getPeso().toString(), carro.getVmax().toString(),  carro.getCilindros().toString(), 
                carro.getCc().toString(), carro.getAno().toString()};
                resultado.addRow(new String[]{s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8]});
            }
        }
        return resultado;
    }
    
}
