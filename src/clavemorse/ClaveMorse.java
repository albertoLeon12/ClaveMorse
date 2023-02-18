package clavemorse;

import java.util.Scanner;

public class ClaveMorse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convercion c = new Convercion(sc.nextLine());
        System.out.println(c.convertir());
    }
    
}
class Convercion {
    String text;
    Convercion(String a) {
        this.text=a;
    }
    public String convertir() {
        
        String[] caracteres = text.split(" ");
        String[] out = new String[caracteres.length];
        String texto = "";
        
        for(int i =0; i<caracteres.length;i++ ){
            switch(caracteres[i]){
                case ".-": out[i]="a"; break;
                case "-...": out[i]="b"; break;
                case "-.-.": out[i]="c"; break;
                case "-..": out[i]="d"; break;
                case ".": out[i]="e"; break;
                case "..-.": out[i]="f"; break;
                case "--.": out[i]="g"; break;
                case "....": out[i]="h"; break;
                case "..": out[i]="i"; break;
                case ".---": out[i]="j"; break;
                case "-.-": out[i]="k"; break;
                case ".-..": out[i]="l"; break;
                case "--": out[i]="m"; break;
                case "-.": out[i]="n"; break;
                case "--.--": out[i]="\u00f1"; break;
                case "---": out[i]="o"; break;
                case ".--.": out[i]="p"; break;
                case "--.-": out[i]="q"; break;
                case ".-.": out[i]="r"; break;
                case "...": out[i]="s"; break;
                case "-": out[i]="t"; break;
                case "..-": out[i]="u"; break;
                case "...-": out[i]="v"; break;
                case ".--": out[i]="w"; break;
                case "-..-": out[i]="x"; break;
                case "-.--": out[i]="y"; break;
                case "--..": out[i]="z"; break;
                case "-----": out[i]="0"; break;
                case ".----": out[i]="1"; break;
                case "..---": out[i]="2"; break;
                case "...--": out[i]="3"; break;
                case "....-": out[i]="4"; break;
                case ".....": out[i]="5"; break;
                case "-....": out[i]="6"; break;
                case "--...": out[i]="7"; break;
                case "---..": out[i]="8"; break;
                case "----.": out[i]="9"; break;
                case ".-.-.-": out[i]="."; break;
                case "--..--": out[i]=","; break;
                case "---...": out[i]=":"; break;
                case ".----.": out[i]="'"; break;
                case "-....-": out[i]="-"; break;
                case "-..-.": out[i]="/"; break;
                case "-.--.": out[i]="("; break;
                case "-.--.-": out[i]=")"; break;
                case ".-..-.": out[i]=" "; break;
                case "-...-": out[i]="="; break;
                default: out[i]=" "; break;
            }
           texto+=out[i]; 
        }    
        return texto;
    }
}

//.--. ..- .-. --- ...  -.-. --- .-. .-. .. -.. --- ...  - ..- -- -... .- -.. --- ...  .- .-.. ...-