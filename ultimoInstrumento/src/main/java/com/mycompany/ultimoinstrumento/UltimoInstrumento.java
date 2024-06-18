package com.mycompany.ultimoinstrumento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UltimoInstrumento {
    public static void main(String[] args) {
        int Estudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de estudiantes")), aprovados=0, reprovados=0, recuperar=0;
        ArrayList<ArrayList<Double>> nota = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> promedios = new ArrayList<Double>(), arrayX = new ArrayList<Double>();
        for (int i = 1; i <= Estudiante; i++) {
            arrayX.clear();
            for (int j = 1; j <= 3; j++) {
                double notas = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la nota "+j+" del estudiante: "+i));
                if (notas >= 0 && notas <= 5) {
                    arrayX.add(notas);
                } else {
                    JOptionPane.showMessageDialog(null, "La nota debe ser entre 1 y 5");
                    System.exit(0);
                }
            }
            nota.add(arrayX);
            promedios.add((arrayX.get(0) + arrayX.get(1) + arrayX.get(2)) / 3);
        }
        JOptionPane.showMessageDialog(null, "Se han validado "+Estudiante+" estudiantes");
        JOptionPane.showMessageDialog(null, "Se han ingresado "+(nota.size()*3)+" notas");
        for (int i = 1; i <= Estudiante; i++) {
            if (promedios.get(i - 1) >= 3.5)
                aprovado += 1;
            else
                reprovado += 1;
            if (promedios.get(i - 1) >= 2)
            recuperar += 1;
        }
        JOptionPane.showMessageDialog(null, aprovado + " estudiantes han aprovado");
        JOptionPane.showMessageDialog(null, reprovado + " estudiantes han reprovado");
        JOptionPane.showMessageDialog(null, recuperar + " estudiantes pueden recuperar");
        JOptionPane.showMessageDialog(null, (Estudiante - recuperar) + " estudiantes no pueden hacer recuperacion");
        String lista = "";
        int PromedioFinal = 0;
        for (int i = 0; i < Estudiante; i++) {
            PromedioFinal += promedio.get(i);
        }
        PromedioFinal = PromedioFinal / Estudiante;
        JOptionPane.showMessageDialog(null, "El promedio toral de las nota son: "+PromedioFinal);
        for (int i = 0; i < Estudiante; i++) {
            lista += ("El estudiante" + i + " ha sacado un promedio de "+promedio.get(i)+"\n"); 
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}
