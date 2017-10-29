/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Luke
 */
public class IteratorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Map<String, Client> hm = new TreeMap<>();
        
        hm.put("Gawryś", new Client("Andrzej", "Gawryś", 28));
        hm.put("Pilipiuk", new Client("Andrzej", "Pilipiuk", 46));
        hm.put("Tolkien", new Client("John", "Tolkien", 100));
        hm.put("Bański", new Client("Filip", "Bański", 34));
        hm.put("Celmer", new Client("Mariusz", "Celmer", 42));
        
        Iterator<Client> it = hm.values().iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
    
}
