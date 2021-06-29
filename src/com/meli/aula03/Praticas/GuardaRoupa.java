package com.meli.aula03.Praticas;

import java.util.Map;
import java.util.HashMap;
import  java.util.List;

public class GuardaRoupa {
    private int count;
    private Map<Integer, List<Vestuario>> map = new HashMap<Integer, List<Vestuario>>();
    //map.put("dog", "type of animal");


    public GuardaRoupa() {
    }

    public GuardaRoupa(int count, Map<Integer, List<Vestuario>> map) {
        this.count = count;
        this.map = map;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        if(count==0) {
            count=1;
            map.put(count, listaDeVestuario);
            count += 1;
            return count - 1;
        }
        else{
            map.put(count, listaDeVestuario);
            count += 1;
            return count - 1;
        }
    }

    public void mostrarVestuarios(){
        map.forEach((k,v) -> {
            System.out.println(k + " [" + v + "] ");
        });
    }

    public List<Vestuario> devolverVestuarios(Integer id){
        return map.get(id);
    }
}
