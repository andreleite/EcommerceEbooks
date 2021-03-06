package model.pojo;
// Generated Jun 4, 2017 3:51:55 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Venda generated by hbm2java
 */
public class Vendas  implements java.io.Serializable {


     private Integer id;
     private Integer livroId;
     private Float valor;
     private String nomeCliente;
     private String emailCliente;
     private Integer foiBoleto;
     private String cartaoNome;
     private String cartaoNumero;
     private Integer cartaoCodigo;
     private Date cartaoDataVenc;

    public Vendas() {
    }

    public Vendas(Integer livroId, Float valor, String nomeCliente, String emailCliente, Integer foiBoleto, String cartaoNome, String cartaoNumero, Integer cartaoCodigo, Date cartaoDataVenc) {
       this.livroId = livroId;
       this.valor = valor;
       this.nomeCliente = nomeCliente;
       this.emailCliente = emailCliente;
       this.foiBoleto = foiBoleto;
       this.cartaoNome = cartaoNome;
       this.cartaoNumero = cartaoNumero;
       this.cartaoCodigo = cartaoCodigo;
       this.cartaoDataVenc = cartaoDataVenc;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getLivroId() {
        return this.livroId;
    }
    
    public void setLivroId(Integer livroId) {
        this.livroId = livroId;
    }
    public Float getValor() {
        return this.valor;
    }
    
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getEmailCliente() {
        return this.emailCliente;
    }
    
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    public Integer getFoiBoleto() {
        return this.foiBoleto;
    }
    
    public void setFoiBoleto(Integer foiBoleto) {
        this.foiBoleto = foiBoleto;
    }
    public String getCartaoNome() {
        return this.cartaoNome;
    }
    
    public void setCartaoNome(String cartaoNome) {
        this.cartaoNome = cartaoNome;
    }
    public String getCartaoNumero() {
        return this.cartaoNumero;
    }
    
    public void setCartaoNumero(String cartaoNumero) {
        this.cartaoNumero = cartaoNumero;
    }
    public Integer getCartaoCodigo() {
        return this.cartaoCodigo;
    }
    
    public void setCartaoCodigo(Integer cartaoCodigo) {
        this.cartaoCodigo = cartaoCodigo;
    }
    public Date getCartaoDataVenc() {
        return this.cartaoDataVenc;
    }
    
    public void setCartaoDataVenc(Date cartaoDataVenc) {
        this.cartaoDataVenc = cartaoDataVenc;
    }




}


