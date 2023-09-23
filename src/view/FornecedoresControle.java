/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FornecedoresTto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tate
 */
public class FornecedoresControle extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    }

    public FornecedoresTto getBean (int row){
    return (FornecedoresTto) lista.get(row);
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
        FornecedoresTto fornecedores =(FornecedoresTto) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return fornecedores.getIdfornecedoresTto();
        }
        if (columnIndex == 1 ) {
            return fornecedores.getNomeTto();
        }
        if (columnIndex == 2 ) {
            return fornecedores.getEmailTto();
        }
        if (columnIndex == 3 ) {
            return fornecedores.getTelefoneTto();
        }
        if (columnIndex == 4 ) {
            return fornecedores.getCnpjTto();
        }
         if (columnIndex == 5 ) {
            return fornecedores.getEnderecoCompletoTto();
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
            return "email";
        }
        if (column == 3 ) {
            return "telefone";
        }
        if (column == 4 ) {
            return "cnpj";
        }
        if (column == 4 ) {
            return "enderecocompleto";
        }
        return "";
    }
}
