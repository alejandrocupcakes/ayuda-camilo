package com.mycompany.ultimoinstrumento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UltimoInstrumento {
    public static void main(String[] args) {
        int Estudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de estudiantes")), aprovados=0, reprovados=0, recuperar=0, norecuperar=0;
        ArrayList<Double> notax = new ArrayList<Double>();
        ArrayList<Double> notay = new ArrayList<Double>();
        ArrayList<Double> notaz = new ArrayList<Double>();
        ArrayList<Double> promedios = new ArrayList<Double>();
        for (int i = 1; i <= Estudiante; i++) {
            notax.add(Double.parseDouble(JOptionPane.showInputDialog("Ingresar la primera nota del estudiante: "+i)));
	    notay.add(Double.parseDouble(JOptionPane.showInputDialog("Ingresar la segunda nota del estudiante: "+i)));
	    notaz.add(Double.parseDouble(JOptionPane.showInputDialog("Ingresar la tercera nota del estudiante: "+i)));
            promedios.add((notax.get(i)+notay.get(i)+notaz.get(i)) / 3);
        }
        JOptionPane.showMessageDialog(null, "Se han validado "+Estudiante+" estudiantes");
        JOptionPane.showMessageDialog(null, "Se han ingresado "+(promedios.size()*3)+" notas");
        for (int i = 1; i <= Estudiante; i++) {
            if (promedios.get(i - 1) >= 3.5){
                aprovado += 1;
            }else{
                reprovado += 1;}
            if (promedios.get(i - 1) >= 2){
            	recuperar += 1;
	    } else {
		norecuperar += 1;
	    }
        }
        JOptionPane.showMessageDialog(null, aprovado + " han aprovado");
        JOptionPane.showMessageDialog(null, reprovado + " han reprovado");
        JOptionPane.showMessageDialog(null, recuperar + " pueden recuperar");
        JOptionPane.showMessageDialog(null, no recuperar + " no pueden hacer recuperacion");
        int PromedioFinal = 0;
        for (int i = 0; i < Estudiante; i++) {
            PromedioFinal += promedio.get(i);
        }
        PromedioFinal = PromedioFinal / Estudiante;
        JOptionPane.showMessageDialog(null, "El promedio total de las nota son: "+PromedioFinal);
        for (int i = 0; i < Estudiante; i++) {
            JOptionPane.showMessageDialog(null, "El estudiante "+i+" sacó "+promedio.get(i));
        }
    }
}
