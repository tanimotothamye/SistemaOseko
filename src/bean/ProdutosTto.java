package bean;
// Generated Sep 22, 2023 8:43:48 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProdutosTto generated by hbm2java
 */
@Entity
@Table(name="produtos_tto"
    ,catalog="db_tatiana_oseko"
)
public class ProdutosTto  implements java.io.Serializable {


     private int idprodutosTto;
     private String nomeTto;
     private String descricaoTto;
     private double valorCompraTto;
     private double valorVendaTto;
     private int categoriaTto;

    public ProdutosTto() {
    }

	
    public ProdutosTto(int idprodutosTto, String nomeTto, String descricaoTto, double valorCompraTto, double valorVendaTto, int categoriaTto) {
        this.idprodutosTto = idprodutosTto;
        this.nomeTto = nomeTto;
        this.descricaoTto = descricaoTto;
        this.valorCompraTto = valorCompraTto;
        this.valorVendaTto = valorVendaTto;
        this.categoriaTto = categoriaTto;
    }
   
     @Id 

    
    @Column(name="idprodutos_tto", unique=true, nullable=false)
    public int getIdprodutosTto() {
        return this.idprodutosTto;
    }
    
    public void setIdprodutosTto(int idprodutosTto) {
        this.idprodutosTto = idprodutosTto;
    }

    
    @Column(name="nome_tto", nullable=false, length=45)
    public String getNomeTto() {
        return this.nomeTto;
    }
    
    public void setNomeTto(String nomeTto) {
        this.nomeTto = nomeTto;
    }

    
    @Column(name="descricao_tto", nullable=false, length=250)
    public String getDescricaoTto() {
        return this.descricaoTto;
    }
    
    public void setDescricaoTto(String descricaoTto) {
        this.descricaoTto = descricaoTto;
    }

    
    @Column(name="valorCompra_tto", nullable=false, precision=10)
    public double getValorCompraTto() {
        return this.valorCompraTto;
    }
    
    public void setValorCompraTto(double valorCompraTto) {
        this.valorCompraTto = valorCompraTto;
    }

    
    @Column(name="valorVenda_tto", nullable=false, precision=10)
    public double getValorVendaTto() {
        return this.valorVendaTto;
    }
    
    public void setValorVendaTto(double valorVendaTto) {
        this.valorVendaTto = valorVendaTto;
    }

    
    @Column(name="categoria_tto", nullable=false, length=45)
    public int getCategoriaTto() {
        return this.categoriaTto;
    }
    
    public void setCategoriaTto(int categoriaTto) {
        this.categoriaTto = categoriaTto;
    }
}


