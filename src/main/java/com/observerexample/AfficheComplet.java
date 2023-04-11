package com.observerexample;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

// Affiche en console de façon complète les informations (position et précision) du GPS.
public class AfficheComplet implements PropertyChangeListener {
        // Méthode appelée automatiquement lors d'un changement d'état du GPS.
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
                Object obj = evt.getNewValue();
                if (obj instanceof Gps) {
                        Gps gps = (Gps) obj;
                        System.out.println("Position : " + gps.getPosition() + "  Précision : " + gps.getPrecision()
                                        + "/10");
                }
        }
}