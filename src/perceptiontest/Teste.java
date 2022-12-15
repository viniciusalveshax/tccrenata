package perceptiontest;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renatarodriguespintos
 */
public class Teste {
   private String instrucaogeral;
  // FileWritter arq;

    public String getInstrucaogeral() {
        return this.instrucaogeral;
    }

    public void setInstrucaogeral(String instrucaogeral) {
        this.instrucaogeral = instrucaogeral;
    }
  public void savetofile() throws IOException{
      
  //System.out.printf("ola");
       try (FileWriter arq = new FileWriter("/Users/renatarodriguespintos/teste0.xml")) {
           PrintWriter gravararq = new PrintWriter(arq);
           
           
           gravararq.printf(" teste ");
           arq.close();
           
       }
           }
}

    
