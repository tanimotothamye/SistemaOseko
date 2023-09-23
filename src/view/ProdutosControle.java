/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutosTto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tate
 */
public class ProdutosControle extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    }

    public ProdutosTto getBean (int row){
    return (ProdutosTto) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProdutosTto produtos =(ProdutosTto) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return produtos.getIdprodutosTto();
        }
        if (columnIndex == 1 ) {
            return produtos.getNomeTto();
        }
        if (columnIndex == 2 ) {
            return produtos.getDescricaoTto();
        }
        if (columnIndex == 3 ) {
            return produtos.getValorCompraTto();
        }
        if (columnIndex == 4 ) {
            return produtos.getValorVendaTto();
        }
        if (columnIndex == 5 ) {
            return produtos.getCategoriaTto();
        }
         return "";
    }
    @Override
    public String getColumnName(int column){
        if (column == 0 ) {
            return "id";
        }
        if (column == 1 ) {
            return "nome";
        }
        if (column == 2 ) {
            return "descricao";
        }
        if (column == 3 ) {
            return "valorCompra";
        }
        if (column == 4 ) {
            return "valorVenda";
        }
         if (column == 5 ) {
            return "categoria";
        }
        return "";
    }
}
