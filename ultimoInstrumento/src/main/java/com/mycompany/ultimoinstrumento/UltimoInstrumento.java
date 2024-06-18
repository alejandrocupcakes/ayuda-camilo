package com.mycompany.ultimoinstrumento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UltimoInstrumento {
    public static void main(String[] args) {
        int estudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes")), aprovados=0, reprovados=0, puedenRecuperar=0;
        ArrayList<ArrayList<Double>> notas = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> promedios = new ArrayList<Double>(), arrayTemporal = new ArrayList<Double>();
        for (int i = 1; i <= estudiantes; i++) {
            arrayTemporal.clear();
            for (int j = 1; j <= 3; j++) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota "+j+" del estudiante numero "+i));
                if (nota >= 0 && nota <= 5) {
                    arrayTemporal.add(nota);
                } else {
                    JOptionPane.showMessageDialog(null, "La nota debe estar en un rango valido (1-5)");
                    System.exit(0);
                }
            }
            notas.add(arrayTemporal);
            promedios.add((arrayTemporal.get(0) + arrayTemporal.get(1) + arrayTemporal.get(2)) / 3);
        }
        JOptionPane.showMessageDialog(null, "Se han validado "+estudiantes+" estudiantes");
        JOptionPane.showMessageDialog(null, "Se han ingresado "+(notas.size()*3)+" notas");
        for (int i = 1; i <= estudiantes; i++) {
            if (promedios.get(i - 1) >= 3.5)
                aprovados += 1;
            else
                reprovados += 1;
            if (promedios.get(i - 1) >= 2)
                puedenRecuperar += 1;
        }
        JOptionPane.showMessageDialog(null, aprovados + " estudiantes han aprovado");
        JOptionPane.showMessageDialog(null, reprovados + " estudiantes han reprovado");
        JOptionPane.showMessageDialog(null, puedenRecuperar + " estudiantes pueden recuperar");
        JOptionPane.showMessageDialog(null, (estudiantes - puedenRecuperar) + " estudiantes no pueden recuperar");
        String lista = "";
        int promedioFinal = 0;
        for (int i = 0; i < estudiantes; i++) {
            promedioFinal += promedios.get(i);
        }
        promedioFinal = promedioFinal / estudiantes;
        JOptionPane.showMessageDialog(null, "El promedio de todas las notas es "+promedioFinal);
        for (int i = 0; i < estudiantes; i++) {
            lista += ("El estudiante" + i + " ha sacado un promedio de "+promedios.get(i)+"\n"); 
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}
