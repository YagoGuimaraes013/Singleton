/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yagov
 */
public class TabuleiroXadrez {
    
    static private TabuleiroXadrez instance = null;
    
    private TabuleiroXadrez(){}
    static TabuleiroXadrez getInstance ()
    {
        if (instance == null)
            instance = new TabuleiroXadrez();
        return instance;
    }
    
    public static void main (String args[])
    
    {
        TabuleiroXadrez tabuleiro1 = TabuleiroXadrez.getInstance();
        TabuleiroXadrez tabuleiro2 = TabuleiroXadrez.getInstance();
        System.out.println(tabuleiro1);
        System.out.println(tabuleiro2);
    }
    
            
    
}
