package com.observerexample;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

// Affiche un résumé en console des informations (position) du GPS.
public class AfficheResume implements PropertyChangeListener {
        // Méthode appelée automatiquement lors d'un changement d'état du GPS.
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
                Object obj = evt.getNewValue();
                if (obj instanceof Gps) {
                        Gps gps = (Gps) obj;
                        System.out.println("Position : " + gps.getPosition());
                }
        }
}