package Model;

import java.util.Date;
import java.time.LocalDateTime;

public class Pizza {
	
private int id;
public String nome,vendedor,descricao,loja,feedback;
private boolean vendido;
public double preco;
private Date date=new Date();

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setName(String name) {
	this.nome = name;
}

public String getVendedor() {
	return vendedor;
}

public void setVendedor(String vendedor) {
	this.vendedor = vendedor;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getLoja() {
	return loja;
}
public boolean isVendido() {
	return vendido;
}
public void setVendido(boolean vendido) {
	this.vendido = vendido;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setLoja(String loja) {
	this.loja = loja;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String x) {
	this.feedback=x;
}
public Date getDate() {
	return date;
}
}
