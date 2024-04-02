/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private long rm;
    private String nome;

    public Aluno(long rm, String nome) {
        this.rm = rm;
        this.nome = nome;
    }
    public Aluno(){
        
    }
     
    
    

    public long getRm() {
        return rm;
    }

    public void setRm(long rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
