package br.com.util;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
    
  public class Serializacao {
    
    public static void gravarArquivoBinario(ArrayList<Object> lista, String nomeArq) {
      File arq = new File(nomeArq);
      try {
        arq.delete();
        arq.createNewFile();
    
        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
        objOutput.writeObject(lista);
        objOutput.close();
    
      } catch(IOException e) {
          System.out.printf("Erro: %s", e.getMessage());
      }
    }
    
    public static ArrayList<Object> lerArquivoBinario(String nomeArq) {
      ArrayList<Object> lista = new ArrayList<Object>();
      try {
        File arq = new File(nomeArq);
        if (arq.exists()) {
           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
           lista = (ArrayList<Object>)objInput.readObject();
           objInput.close();
        }
      } catch(IOException e) {
          System.out.printf("Erro: %s", e.getMessage());
      } catch(ClassNotFoundException e2) {
          System.out.printf("Erro: %s", e2.getMessage());
      }
      return(lista);
    }
    
  }