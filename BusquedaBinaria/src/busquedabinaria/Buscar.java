/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

/**
 *
 * @author Diego
 */
public class Buscar {
    public static Integer Binario(Integer[] data, Integer valor) {
        int li = 0;
        int ls = data.length;
        while (li <= ls) {
            int lm = (ls - li) / 2 + li;
            if (data[lm] < valor) {
                li = lm + 1;
            } else if (data[lm] > valor) {
                ls = lm - 1;
            } else {
                return lm;
            }
        }
        return null;
    }
}
