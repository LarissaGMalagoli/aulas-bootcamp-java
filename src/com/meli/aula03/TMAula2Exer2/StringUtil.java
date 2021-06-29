package com.meli.aula03.TMAula2Exer2;
import java.util.Arrays;

public class StringUtil {
    public static String rpad (String s, char c, int n){
        if(s == null){
            return null;
        }
        int numeroChars =  n - s.length();
        if(numeroChars==0){
            return s;
        }
        char[] chars = new char[n];
        Arrays.fill(chars, c);
        String addChars = new String(chars);
        return s.concat(addChars);
    }

    public static String ltrim (String s){
        if(s==null){
            return null;
        }
        String novoS = "";
        int posicao = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                posicao+=1;
            }
            else{
                break;
            }

        }

        for (int i = posicao; i < s.length(); i++){
            char c = s.charAt(i);
            novoS+=c;
        }
        return novoS;
    }

    public static String rtrim (String s){
        if(s==null){
            return null;
        }
        String novoS = "";
        int posicao = s.length()-1;
        for (int i = s.length()-1; i > 0; i--){
            char c = s.charAt(i);
            if(c==' '){
                posicao+=1;
            }
            else{
                break;
            }

        }

        for (int i = 0; i < posicao; i++){
            char c = s.charAt(i);
            novoS+=c;
        }
        return novoS;
    }

    public static String trim(String s){
        s = ltrim(s);
        s = rtrim(s);
        return s;
    }

    public static int indexOfN (String s, char c, int n){
        int ocorrencia=0;
        int posicao=0;
        boolean achou = false;
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(x==c){
                ocorrencia+=1;
                if(ocorrencia==n){
                    achou = true;
                    posicao=i;
                    break;
                }
            }
        }

        if(achou){
            return posicao;
        }
        else{
            return -1;
        }
    }

}
