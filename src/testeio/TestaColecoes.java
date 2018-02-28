/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class TestaColecoes {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<String>();
        nomes.add("Mauro");
        nomes.add("Pedro");
        nomes.add("Artur");
        nomes.add("Joana");
        
        
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
        /*for (int i = 0; i <nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }*/
        
        //ArrayList<Conta> contas = new ArrayList<Conta>();
        
        
    }
}
