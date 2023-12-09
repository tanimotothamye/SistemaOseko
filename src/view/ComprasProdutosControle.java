/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ComprasProdutosTto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tate
 */
public class ComprasProdutosControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public ComprasProdutosTto getBean (int row){
    return (ComprasProdutosTto) lista.get(row);
    }

    public  void  addBean (ComprasProdutosTto comprasProdutosTto){
        lista.add(comprasProdutosTto);
        this.fireTableDataChanged();
    }

    public void removeBean (int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }

    public  void  updateBean (int index, ComprasProdutosTto comprasProdutosTto){
    lista.set(index, comprasProdutosTto);
    this.fireTableDataChanged();
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
        ComprasProdutosTto comprasProdutosTto =(ComprasProdutosTto) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return comprasProdutosTto.getIdcomprasProdutosTto();
        }
        if (columnIndex == 1 ) {
            return comprasProdutosTto.getComprasTto();
        }
        if (columnIndex == 2 ) {
            return comprasProdutosTto.getProdutosTto();
        }
        if (columnIndex == 3 ) {
            return comprasProdutosTto.getQuantidadeTto();
        }
        if (columnIndex == 4 ) {
            return comprasProdutosTto.getValorUnitarioTto();
        }
        
         return "";
    }
    @Override
    public String getColumnName(int column){
        if (column == 0 ) {
            return "id";
        }
        if (column == 1 ) {
            return "compras";
        }
        if (column == 2 ) {
            return "produtos";
        }
        if (column == 3 ) {
            return "quantidade";
        }
        if (column == 4 ) {
            return "valorunitario";
        }
        
        return "";
    }

}
