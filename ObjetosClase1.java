package objetosclase1;

import java.util.Scanner;
import java.util.ArrayList;
import models.Estado;
import models.Moneda;
import models.Municipio;

/**
 *
 * @author BrayanG12
 */


public class ObjetosClase1 {
    static Scanner input = new Scanner(System.in);
    
    static ArrayList<Municipio> municipios = new ArrayList<>();
    static ArrayList<Estado> estados = new ArrayList<>();
    static ArrayList<Moneda> monedas = new ArrayList<>();
    static int opcion;
    
    public static void llenarMunicipios (){
        municipios.add(new Municipio(1, "Campeche"));
        municipios.add(new Municipio(2, "Calakmul"));
        municipios.add(new Municipio(3, "Carmen"));
        municipios.add(new Municipio(4, "Champoton"));
        System.out.println(municipios.toString());
    }
    
    public static void borrarMunicipio(int id){
        municipios.remove(id-1);
    }
    
     public static void llenarEstados (){
        estados.add(new Estado(1, "Campeche", 7000, 19.00001, 18.0001));
        estados.add(new Estado(2, "Yucatan", 8000, 19.00002, 18.0002));
        System.out.println(estados.toString());
    }
    
    public static void llenarMonedas (){
        monedas.add(new Moneda(1, "Peso", "$", 1));
        monedas.add(new Moneda(2, "Dollar", "$", 19));
        monedas.add(new Moneda(3, "Euro", "E", 25));
        System.out.println(monedas.toString());
    }
    /*
        public static void menu (){
        System.out.println("Sistema de control del menu");
        System.out.println("1-Llenar monedas");
        System.out.println("2-Llenar municipios");
        System.out.println("3-Llenar estados");
        System.out.println("4-Borrar municipio");
        System.out.println("9-Salir");
    }
    
    public static void opciones (int opcion){
        switch(opcion){
            case 1: llenarMonedas();break;
            case 2: llenarMunicipios();break;
            case 3: llenarEstados();break;
            case 4: borrarMunicipio(1);break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    */
     public static void menu1 (){
         System.out.println("Ingrese una opcion: ");
        switch(opcion){
            case 1: llenarMonedas();break;
            case 2: llenarMunicipios();break;
            case 3: borrarMunicipio(0);break;
            case 4: llenarEstados();break;
            default:
                System.out.println("Opcion no valida");
        }
    }
     
    public static void agregarMoneda (){
        System.out.println("Ingresa los datos de la nueva moneda");
        System.out.println("Id         :");
        int monedaId= input.nextInt();
        System.out.println("Nombre : ");
        String monedaNombre = input.next();
        System.out.println("Simbolo :");
        String monedaSimbolo = input.next();
        System.out.println("Valor : ");
        double monedaValor = input.nextDouble();
        monedas.add(new Moneda(monedaId, monedaNombre, monedaSimbolo, monedaValor));
    }
    
    public static void borrarMoneda (int recNo){
        monedas.remove(recNo);
    }
    
      public static void actualizarMoneda (int recNo, int id,String nombreMoneda, String simbolo, double valorPesos){
        monedas.get(recNo).setId(id);
        monedas.get(recNo).setNombreMoneda(nombreMoneda);
        monedas.get(recNo).setSimbolo(simbolo);
        monedas.get(recNo).setValorPesos(valorPesos);
    }
    
    public static void menuOpciones (int opcionSeleccionada){
        switch(opcionSeleccionada){
            case 1 : agregarMoneda(); break;
            case 2 : llenarMonedas(); break;
            case 3 : leerRegistroActualizar(); break;
            case 4 : leerRegistroBorrar(); break;
            case 9 : System.out.println("Adios..."); break;
            default : System.out.println("Opcion no valida"); break;
        }
    }
    
    public static void leerRegistroBorrar (){
        System.out.println("Ingresa el numero de registro de la moneda a elimminar: ");
        System.out.println("Numero de registro de registro         :");
        int monedaId= input.nextInt();
        borrarMoneda(monedaId);
    }
    
      public static void leerRegistroActualizar (){
        System.out.println("Ingresa el numero de registro de la moneda a actualizar: ");
        System.out.println("Numero de registro        :");
        int recNo= input.nextInt();
        
        
        System.out.println("Id         :");
        int monedaId= input.nextInt();
        System.out.println("Nombre : ");
        String monedaNombre = input.next();
        System.out.println("Simbolo :");
        String monedaSimbolo = input.next();
        System.out.println("Valor : ");
        double monedaValor = input.nextDouble();
        actualizarMoneda (recNo, monedaId, monedaNombre, monedaSimbolo, monedaValor);
    }
    
    public static int menu (){
        int opcion;
        System.out.println("1.-Crear moneda");
        System.out.println("2.-Listar moneda");
        System.out.println("3.-Actualizar moneda");
        System.out.println("4.-Borrar moneda");
        System.out.println("9.-Salir");
        opcion = input.nextInt();
        menuOpciones(opcion);
        return opcion;
    }
    
    public static void main(String[] args) {
        
        
        /*
        String  mivariable = new String();
        mivariable = "12345";
       
       
        Municipio campeche = new Municipio();
        campeche.setId(1);
        campeche.setNombre("Campeche");
       
        System.out.println(campeche.toString());
        
        
        String varImplicita = new String("ABCDEF");
        
        Municipio calkini = new Municipio(2, "Calkini");
        System.out.println(calkini.toString());
        
        Municipio carmen = new Municipio(3, "Carmen");
        System.out.println(carmen.toString());
        
        Municipio calakmul = new Municipio(4, "Calakmul");
        System.out.println(calakmul.toString
        
        municipios.add(new Municipio(1, "Campeche"));
        municipios.add(new Municipio(2, "Calkini"));
        municipios.add(new Municipio(3, "Hecelchackan"));
        System.out.println(municipios.toString());
        
        llenarMunicipios();
        llenarEstados();
        borrarMunicipio(4);
        System.out.println(municipios.toString());
        
        
        Moneda peso = new Moneda(1, "Peso", "$", 1);
        System.out.println(peso.toString());
        
        Moneda dollar = new Moneda(1, "Dollar", "$", 19);
        System.out.println(dollar.toString());
        
        Moneda euro = new Moneda(1, "Euro", "E", 25);
        System.out.println(euro.toString());
      
        
        llenarMonedas();
        llenarMunicipios();
        llenarEstados();
        borrarMunicipio(4);
        System.out.println(municipios.toString());
        
        int opcion;
        do{
            menu();
            System.out.pr                                     intln("Seleccione una opcion");
            opcion = input.nextInt();
            opciones(opcion);
        }while(opcion != 9); 
        */
        int opcionMenu;
        
        do{
            opcionMenu = menu();
        }while (opcionMenu != 9);

        
    }

    
    
}
