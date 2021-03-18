

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HashMapp<E> implements MAP {
    /*
    HM sirve para crear un diccionario en cual guardamos todas las listas
    inventario guarda el inventario con su cantidad
    collecionU se utiliza para guardar el inventario separado por categoria pero sin cantidad
    coleccion genera un diccionario donde estan los productos y su cantidad
     */
    private final HashMap<String, ArrayList<List<String>>> HM;
    private final HashMap<String, HashMap<String,Integer>> inventario;
    private final HashMap<String, HashMap<String,Integer>> carritoU;
    private HashMap<String, ArrayList<String>> coleccionU;
    private final HashMap<String, Integer> hashU;
    private final HashMap<String, Integer> coleccionCantB;
    private final HashMap<String, Integer> coleccionCantF;
    private final HashMap<String, Integer> coleccionCantL;
    private final HashMap<String, Integer> coleccionCantM;
    private final HashMap<String, Integer> coleccionCantS;
    private final HashMap<String, Integer> coleccionCantC;
    private final HashMap<String, Integer> coleccionCantCo;


    //Luego completo el constructor
    public HashMapp() {
        HM = new HashMap<String, ArrayList<List<String>>>();
        coleccionU =new HashMap<>();
        coleccionCantB =new HashMap<>();
        coleccionCantM =new HashMap<>();
        coleccionCantC =new HashMap<>();
        coleccionCantCo =new HashMap<>();
        coleccionCantF =new HashMap<>();
        coleccionCantS =new HashMap<>();
        coleccionCantL =new HashMap<>();
        hashU =new HashMap<>();
        inventario = new HashMap<String, HashMap<String, Integer>>();
        carritoU = new HashMap<String, HashMap<String, Integer>>();

    }


    public void crearHash() {

        ArrayList<List<String>> lista = new ArrayList<>();
        ArrayList<HashMap<String, Integer>> lista2 = new ArrayList<>();


        for (int i = 0; i < leerDocu().size(); i++) {

            lista.add(Arrays.asList(leerDocu().get(i).split("[|]", 0)));

            HM.put(lista.get(i).get(0), lista);



        }
        int f = 0;


        ArrayList<List<String>> lista3 = new ArrayList<>();
        for (int j= 0; j<lista.size();j++){
            for(int i=0;i<HM.keySet().size();i++){
                if (lista.get(j).get(0).equals(HM.keySet().toArray()[i])){

                    lista3.add(lista.get(j));
                    HM.put(lista.get(i).get(0), lista3);

            }

            }
        }
        ArrayList<String> bebidas = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[1])){

                    bebidas.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), bebidas);
                    for(int j = 0; j<bebidas.size();j++){
                        coleccionCantB.put(bebidas.get(j), 10);

                    }
                   inventario.put(lista.get(i).get(0),coleccionCantB);

                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> frutas = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[5])){

                    frutas.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), frutas);
                    for(int j = 0; j<frutas.size();j++){
                        coleccionCantF.put(frutas.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantF);
                }
            }
        } catch (Exception e) {

        }

        ArrayList<String> sillones = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[6])){

                    sillones.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), sillones);
                    for(int j = 0; j<sillones.size();j++){
                        coleccionCantS.put(sillones.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantS);

                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> condimentos = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[3])){

                    condimentos.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), condimentos);
                    for(int j = 0; j<condimentos.size();j++){
                        coleccionCantCo.put(condimentos.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantCo);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> lacteos = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[2])){

                    lacteos.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), lacteos);
                    for(int j = 0; j<lacteos.size();j++){
                        coleccionCantL.put(lacteos.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantL);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> carnes = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[4])){

                    carnes.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), carnes);
                    for(int j = 0; j<carnes.size();j++){
                        coleccionCantC.put(carnes.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantC);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> mueblesT = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[0])){

                    mueblesT.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), mueblesT);
                    for(int j = 0; j<mueblesT.size();j++){
                        coleccionCantM.put(mueblesT.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantM);

                }
            }
        } catch (Exception e) {

        }


        //System.out.println(inventario.entrySet());
        //System.out.println(inventario.get("Mueble de terraza"));

        }


    @Override
    public void add(String key, String value, int cant) {
        value = value.toUpperCase();
        HashMap<String, Integer> usuario = new HashMap();
        for (int i =0; i<inventario.keySet().toArray().length; i++){
            if (inventario.keySet().toArray()[i].equals(key)){
                if(inventario.get(inventario.keySet().toArray()[i]).keySet().toArray()[i].equals(value)){
                    hashU.put(value, cant);
                    carritoU.put(key, hashU);
                    inventario.get(inventario.keySet().toArray()[i]).put(value,inventario.get(inventario.keySet().toArray()[i]).get(value)-cant);

                    System.out.println(carritoU.entrySet());

                    System.out.println(inventario.entrySet());

                }
            }else{
                //System.out.println("Categoria no esta en el sistema");
            }
        }


    }

    @Override
        public String showAllInfo () {
            System.out.println("*******inventario*******");
            for (int j=0; j<inventario.get(inventario.keySet().toArray()[0]).size();j++){
                System.out.println(inventario.keySet().toArray()[0]+"------>"+ coleccionCantM.keySet().toArray()[j] + "--" + coleccionCantM.get(coleccionCantM.keySet().toArray()[j]));
            }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[1]).size();j++){
            System.out.println(inventario.keySet().toArray()[1]+"------>"+ coleccionCantB.keySet().toArray()[j] + "--Cantidad--" + coleccionCantB.get(coleccionCantB.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[2]).size();j++){
            System.out.println(inventario.keySet().toArray()[2]+"------>"+ coleccionCantL.keySet().toArray()[j] + "--" + coleccionCantL.get(coleccionCantL.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[3]).size();j++){
            System.out.println(inventario.keySet().toArray()[3]+"------>"+ coleccionCantCo.keySet().toArray()[j] + "--" + coleccionCantCo.get(coleccionCantCo.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[4]).size();j++){
            System.out.println(inventario.keySet().toArray()[4]+"------>"+ coleccionCantC.keySet().toArray()[j] + "--" + coleccionCantC.get(coleccionCantC.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[5]).size();j++){
            System.out.println(inventario.keySet().toArray()[5]+"------>"+ coleccionCantF.keySet().toArray()[j] + "--" + coleccionCantF.get(coleccionCantF.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[6]).size();j++){
            System.out.println(inventario.keySet().toArray()[6]+"------>"+ coleccionCantS.keySet().toArray()[j] + "--" + coleccionCantS.get(coleccionCantS.keySet().toArray()[j]));
        }
            return"j";
        }

        @Override
        public Object showCategoryInfo (String producto){
            Object data = "";

            for (Object i : HM.keySet()) {
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
    public static void aniadirArchivo(String categoria, String producto) {
        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros
            flwriter = new FileWriter("ListadoProducto.txt", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            bfwriter.write( categoria + "|  " + producto + "\n");
            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }
