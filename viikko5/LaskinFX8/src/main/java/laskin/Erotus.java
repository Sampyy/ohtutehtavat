/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Sami
 */
public class Erotus extends Komento {
    private TextField tuloskentta;
    private TextField syotekentta;
    private Button nollaa;
    private Button undo;
    private Sovelluslogiikka sovelluslogiikka;
    private int edellinenArvo;
    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovelluslogiikka) {
        super(tuloskentta, syotekentta, nollaa, undo, sovelluslogiikka);
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this. sovelluslogiikka = sovelluslogiikka;
        }
        
        @Override
        public void suorita() {
            edellinenArvo = sovelluslogiikka.tulos();
            sovelluslogiikka.miinus(Integer.parseInt(syotekentta.getText()));

            tuloskentta.setText(Integer.toString(sovelluslogiikka.tulos()));
        }
        
        @Override
        public void peru() {
            sovelluslogiikka.plus(edellinenArvo-Integer.parseInt(tuloskentta.getText()));
            tuloskentta.setText(Integer.toString(sovelluslogiikka.tulos()));
        }
}