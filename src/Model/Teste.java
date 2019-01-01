/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Drew
 */
public class Teste {
    
    private int campo1;
    private int campo2;
    private int campo3;
    private int campo4;
    private int campo5;

    public Teste(int campo1, int campo2, int campo3, int campo4, int campo5) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
        this.campo5 = campo5;
    }
    
    public Teste() {
        this(1,2,3,4,5);
    }
    

    public int getCampo1() {
        return campo1;
    }

    public void setCampo1(int campo1) {
        this.campo1 = campo1;
    }

    public int getCampo2() {
        return campo2;
    }

    public void setCampo2(int campo2) {
        this.campo2 = campo2;
    }

    public int getCampo3() {
        return campo3;
    }

    public void setCampo3(int campo3) {
        this.campo3 = campo3;
    }

    public int getCampo4() {
        return campo4;
    }

    public void setCampo4(int campo4) {
        this.campo4 = campo4;
    }

    public int getCampo5() {
        return campo5;
    }

    public void setCampo5(int campo5) {
        this.campo5 = campo5;
    }
    
    
    
}
