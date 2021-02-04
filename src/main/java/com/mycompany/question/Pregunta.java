/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question;

/**
 *
 * @author Alumno Tarde
 */
public class Pregunta {
    private String enunciado, pregunta1, pregunta2, pregunta3, preguntaCorrecta;
    
    public Pregunta() {
        
    }

    public Pregunta(String enunciado, String pregunta1, String pregunta2, String pregunta3, String preguntaCorrecta) {
        this.enunciado = enunciado;
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.preguntaCorrecta = preguntaCorrecta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public String getPreguntaCorrecta() {
        return preguntaCorrecta;
    }

    public void setPreguntaCorrecta(String preguntaCorrecta) {
        this.preguntaCorrecta = preguntaCorrecta;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", pregunta1=" + pregunta1 + ", pregunta2=" + pregunta2 + ", pregunta3=" + pregunta3 + ", preguntaCorrecta=" + preguntaCorrecta + '}';
    }
    
    
}
