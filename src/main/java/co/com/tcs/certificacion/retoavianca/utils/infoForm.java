package co.com.tcs.certificacion.retoavianca.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class infoForm {
    private String[] asociado;
    private int indice;
    private String Persona;
    private String name;
    private String email;
    private String phone;
    private String userName;

    public infoForm() {
        Random random = new Random();
        indice = random.nextInt(4 + 0);
    }

    public String getName(){
        File archivo;
        FileReader fr;
        BufferedReader br;

        try {
            archivo = new File("src/main/java/co/com/tcs/certificacion/retoavianca/utils/insumo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;

            List<String> personas = new ArrayList();
            while((line = br.readLine()) != null){
                personas.add(line);
            }

            Persona = personas.get(indice);
            asociado = Persona.split("-");
            name = asociado[0] + " " + asociado[1] + " " + asociado[2] + " " + asociado[3];

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return name;
    }
    public String getEmail(){
        File archivo;
        FileReader fr;
        BufferedReader br;
        try {
            archivo = new File("src/main/java/co/com/tcs/certificacion/retoavianca/utils/insumo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            List<String> personas = new ArrayList();

            while((line = br.readLine()) != null){
                personas.add(line);
            }

            Persona = personas.get(indice);
            asociado = Persona.split("-");
            email = asociado[0] + "@" + asociado[2] +".com";

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return email;
    }
    public String getUsername(){
        File archivo;
        FileReader fr;
        BufferedReader br;
        try {
            archivo = new File("src/main/java/co/com/tcs/certificacion/retoavianca/utils/insumo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            List<String> personas = new ArrayList();
            while((line = br.readLine()) != null){
                personas.add(line);
            }

            Persona = personas.get(indice);
            asociado = Persona.split("-");
            userName = asociado[0].substring(0,2) + asociado[1].substring(0,2) +
                    asociado[2].substring(0,2) + asociado[3].substring(0,2);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userName;
    }
    public String getPhone() {
        File archivo;
        FileReader fr;
        BufferedReader br;
        try {
            archivo = new File("src/main/java/co/com/tcs/certificacion/retoavianca/utils/insumo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            List<String> personas = new ArrayList();
            while((line = br.readLine()) != null){
                personas.add(line);
            }

            Persona = personas.get(indice);
            asociado = Persona.split("-");
            phone = asociado[4];

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return phone;
    }
}
