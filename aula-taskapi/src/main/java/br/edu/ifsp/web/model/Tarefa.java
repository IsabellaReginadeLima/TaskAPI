package br.edu.ifsp.web.model;

public class Tarefa {

    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;
    
    private Usuario usuario;

    public Tarefa() {}   // construtor vazio: o Gson precisa dele

    public Tarefa(int id, String titulo, String descricao, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    // Getters e setters de cada campo
    public int getId()                  { return id; }
    public void setId(int id)           { this.id = id; }

    public String getTitulo()           { return titulo; }
    
    /** coloca regra de dominio, toda tarefa deve ter titulo **/
    
    public void setTitulo(String t){ 
    	
    	if(t == null || t.isBlank()) {
    		throw new IllegalArgumentException("O título é obrigatório.");
    	}
    	
    	this.titulo = t; }

    public String getDescricao()        { return descricao; }
    public void setDescricao(String d)  { this.descricao = d; }

    public boolean isConcluida(){ return concluida; }
    
    /**regra, uma tarefa só pode ser concluída através deste método **/
    
    public void concluir() {
    	
    	if(this.concluida) {
    		throw new IllegalArgumentException("A tarefa já foi concluída");
    	}
    	
    	this.concluida = true;
    }
    
    public Usuario getUsuario() {
    	return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
    	this.usuario = usuario;
    }
}
