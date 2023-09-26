/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FuncionariosTto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tate
 */
public class FuncionariosControle extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }

    public FuncionariosTto getBean (int row){
    return (FuncionariosTto) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 16;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FuncionariosTto funcionarios =(FuncionariosTto) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return funcionarios.getIdfuncionariosTto();
        }
        if (columnIndex == 1 ) {
            return funcionarios.getNomeTto();
        }
        if (columnIndex == 2 ) {
            return funcionarios.getCpfTto();
        }
        if (columnIndex == 3 ) {
            return funcionarios.getEmailTto();
        }
        if (columnIndex == 4 ) {
            return funcionarios.getTelefoneTto();  
        }
        if (columnIndex == 5 ) {
            return funcionarios.getEmailReservaTto();
        }
        if (columnIndex == 6 ) {
            return funcionarios.getDataNascimentoTto();
        }
        if (columnIndex == 7 ) {
            return funcionarios.getCelularTto();
        }
        if (columnIndex == 8) {
            return funcionarios.getBairroTto();
        }
        if (columnIndex == 9 ) {
            return funcionarios.getCidadeTto();
        }
        if (columnIndex == 10 ) {
            return funcionarios.getPaisTto();
        }
        if (columnIndex == 11 ) {
            return funcionarios.getCepTto();
        }
        if (columnIndex == 12) {
            return funcionarios.getEnderecoTto();
        }
         if (columnIndex == 13 ) {
            return funcionarios.getSexoTto();
        }
        if (columnIndex == 14 ) {
            return funcionarios.getAtivoTto();
        }
        if (columnIndex == 15) {
            return funcionarios.getCarteiratrabalhoTto();
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
            return "cpf";
        }
        if (column == 3 ) {
            return "email";
        }
        if (column == 4 ) {
            return "telefone";
        }
        if (column == 5 ) {
            return "emailreserva";
        }
        if (column == 6 ) {
            return "datanascimento";
        }
        if (column == 7 ) {
            return "celular";
        }
        if (column == 8 ) {
            return "bairro";
        }
        if (column == 9 ) {
            return "cidade";
        }
        if (column == 10 ) {
            return "pais";
        }
        if (column == 11 ) {
            return "cep";
        }
        if (column == 12 ) {
            return "endereco";
        }
        if (column == 13 ) {
            return "sexo";
        }
        if (column == 14 ) {
            return "ativo";
        }
         if (column == 15 ) {
            return "carteiratrabalho";
        }
        return "";
    }
}
