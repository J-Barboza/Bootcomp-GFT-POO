package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter@Setter
public class Mentoria extends Conteudo{

    //Atributos
    //private String titulo;
    //private String descricao; //apos criacao da classe abstract Conteudo

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}