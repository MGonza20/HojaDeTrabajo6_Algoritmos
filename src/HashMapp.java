

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class HashMapp implements MAP {

    private HashMap<String, ArrayList<String>> HM;

    //Luego completo el constructor
    public HashMapp() {
        HM =new HashMap<>();
    }

    @Override
    public void add(String key, String value) {

        ArrayList<List<String>> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        for (int i = 0; i < leerDocu().size(); i++) {

            lista.add(Arrays.asList(leerDocu().get(i).split("[|]", 0)));
           // System.out.println(lista.get(i));
            HM.put(lista.get(i).get(0), lista2);
        }
        ArrayList<List<String>> lista3 = new ArrayList<>();
        for (int j= 0; j<lista.size();j++){
            for(int i=0;i<HM.keySet().size();i++){
                if (lista.get(j).get(0).equals(HM.keySet().toArray()[i])){

                    lista3.add(lista.get(j));

            }

            }
        }
        ArrayList<String> bebidas = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[0])){

                    bebidas.add(lista.get(i).get(1));
                    HM.put(lista.get(i).get(0), bebidas);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> frutas = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[1])){

                    frutas.add(lista.get(i).get(1));
                    HM.put(lista.get(i).get(0), frutas);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> sillones = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[2])){

                    sillones.add(lista.get(i).get(1));
                    HM.put(lista.get(i).get(0), sillones);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> condimentos = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[3])){

                    condimentos.add(lista.get(i).get(1));
                    HM.put(lista.get(i).get(0), condimentos);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> lacteos = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[4])){

                    lacteos.add(lista.get(i).get(1));
                    HM.put(lista.get(i).get(0), lacteos);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> carnes = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[5])){

                    carnes.add(lista.get(i).get(1));
                    HM.put(lista.get(i).get(0), carnes);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> mueblesT = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[6])){

                    mueblesT.add(lista.get(i).get(1));
                    HM.put(lista.get(i).get(0), mueblesT);
                }
            }
        } catch (Exception e) {

        }
       if(key.equals(HM.keySet().toArray()[0])){
           bebidas.add(value);
           HM.put(key,bebidas);

       }
        else if(key.equals(HM.keySet().toArray()[1])){
            frutas.add(value);
           HM.put(key,frutas);

        }
        else if(key.equals(HM.keySet().toArray()[2])){
            sillones.add(value);
           HM.put(key,sillones);

        }
        else if(key.equals(HM.keySet().toArray()[3])){
            condimentos.add(value);
           HM.put(key,condimentos);
        }
        else if(key.equals(HM.keySet().toArray()[4])){
            lacteos.add(value);
           HM.put(key,lacteos);
        }
        else if(key.equals(HM.keySet().toArray()[5])){
            carnes.add(value);
           HM.put(key,carnes);
        }
        else if(key.equals(HM.keySet().toArray()[6])){
            mueblesT.add(value);
           HM.put(key,mueblesT);
        }
        else{
           System.out.println("la categoria no esta en la base de datos");
       }
        System.out.println(HM.entrySet());
        System.out.println(HM.keySet());

/*

        for (int j = 0; j<lista.size();j++){

            //System.out.println(HM.keySet().toArray()[j]);
            for (int i =0; i< HM.keySet().size();i++)
            {
                ArrayList<String> lista3 = new ArrayList<>();
                if (lista.get(j).get(0).equals(HM.keySet().toArray()[i])){

                    lista3.add(lista.get(j).get(1));


            }

        }


           // System.out.println(lista2);
            //HM.put(lista.get(j).get(0), lista2);

        }
        System.out.println(HM.keySet());
*/


/*
        for (String key1 : HM.keySet()) {
            if (key1.equals(key)) {
                lista.add(value);
                HM.put(key, lista);
            }
        }
        */

        }


        @Override
        public String showAllInfo () {
            String data = "";
            return data;
        }

        @Override
        public String showCategoryInfo (String producto){
            String data = "";

            for (String i : HM.keySet()) {
                if (HM.get(i).equals(producto)) {
                    data = i;
                    System.out.println("key: " + i + " value: " + HM.get(i));
                }
            }

            return data;
        }
        public ArrayList<String> leerDocu () {
            // TODO Auto-generated method stub
            String texto = new String();

            // TODO Auto-generated method stub
            ArrayList<String> operacion = new ArrayList<String>();
            try {
                FileReader fr = new FileReader("C:\\Users\\50246\\IdeaProjects\\HojaDeTrabajo6_Algoritmos\\ListadoProducto.txt");// Objeto para que establece origen de los datos
                BufferedReader entrada = new BufferedReader(fr); // buffer para el manejo de los datos
                String s;
                while ((s = entrada.readLine()) != null)// leer linea a linea
                    texto += s + "\n";
                operacion = new ArrayList<String>(Arrays.asList(texto.split("[\n]", 0)));

                entrada.close();

                // impresion de los datos leidos en pantalla
            } catch (java.io.FileNotFoundException fnfex) {
                System.out.println("Archivo no encontrado: ");
            } catch (java.io.IOException ioex) {

            }

            return operacion;
        }

    }
