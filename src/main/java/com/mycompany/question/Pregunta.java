/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alumno Tarde
 */
public class Pregunta {
    private String enunciado, pregunta1, pregunta2, pregunta3, pregunta4, preguntaCorrecta;
    
    public void aleatorizar() {
        List<String> aleatorizarRespuestas = new ArrayList<String>();
        
        aleatorizarRespuestas.add(pregunta1);
        aleatorizarRespuestas.add(pregunta2);
        aleatorizarRespuestas.add(pregunta3);
        aleatorizarRespuestas.add(pregunta4);
        
        Collections.shuffle(aleatorizarRespuestas);
        
        this.pregunta1 = aleatorizarRespuestas.get(0);
        this.pregunta2 = aleatorizarRespuestas.get(1);
        this.pregunta3 = aleatorizarRespuestas.get(2);
        this.pregunta4 = aleatorizarRespuestas.get(3);
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

    public String getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(String pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public String getPreguntaCorrecta() {
        return preguntaCorrecta;
    }

    public void setPreguntaCorrecta(String preguntaCorrecta) {
        this.preguntaCorrecta = preguntaCorrecta;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", pregunta1=" + pregunta1 + ", pregunta2=" + pregunta2 + ", pregunta3=" + pregunta3 + ", pregunta4=" + pregunta4 + ", preguntaCorrecta=" + preguntaCorrecta + '}';
    }
    
    
}
