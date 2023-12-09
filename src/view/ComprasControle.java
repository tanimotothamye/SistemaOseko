/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ComprasTto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tate
 */
public class ComprasControle extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }

    public ComprasTto getBean (int row){
    return (ComprasTto) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ComprasTto compras =(ComprasTto) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return compras.getIdcomprasTto();
        }
        if (columnIndex == 1 ) {
            return compras.getDataTto();
        }
        if (columnIndex == 2 ) {
            return compras.getFornecedoresTto();
        }
        if (columnIndex == 3 ) {
            return compras.getFuncionariosTto();
        }
         if (columnIndex == 4 ) {
            return compras.getTotalTto();
         }
         return "";
    }
    @Override
    public String getColumnName(int column){
        if (column == 0 ) {
            return "id";
        }
        if (column == 1 ) {
            return "data";
        }
        if (column == 2 ) {
            return "fornecedores";
        }
        if (column == 3 ) {
            return "funcionarios";
        }
        if (column == 4 ) {
            return "valor";
        }
        return "";
    }
}
