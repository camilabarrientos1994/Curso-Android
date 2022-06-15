/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.actividad3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import models.Pasajero;
import models.Registro;
import models.Ticket;
import models.Vuelo;

/**
 *
 * @author cloud
 */
public class Actividad3 {

    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo(1l,"20b", "Temuco",true,60 ,LocalDate.now() );
        Vuelo vuelo2 = new Vuelo(2l,"500A", "Santiago",true,120 ,LocalDate.now() );
        Vuelo vuelo3 = new Vuelo(3l,"303", "Buenos aires",false,80 ,LocalDate.now() );
        Vuelo vuelo4 = new Vuelo(4l,"500B", "Madrid",true,80 ,LocalDate.now() );

        Pasajero pasajero1 = new Pasajero(87l, "Braian", "Mansilla",18872653 , false,vuelo1);
        Pasajero pasajero2 = new Pasajero(13l, "Maria", "Barria",18271663 , false,vuelo3);
        Pasajero pasajero3 = new Pasajero(65l, "Eduardo", "San martin",1837463 , true,vuelo4);
        Pasajero pasajero4 = new Pasajero(333l, "Paz", "Ormazabal",1927474 , true,vuelo1);
        Pasajero pasajero5 = new Pasajero(52l, "Jose", "Araneda",17364733 , false,vuelo2);
        Pasajero pasajero6 = new Pasajero(190l, "Carlos", "Barria",18384624 , true,vuelo3);
        Pasajero pasajero7 = new Pasajero(103l, "Cristian", "Perez",108348273 , false,vuelo2);
        Pasajero pasajero8 = new Pasajero(46l, "Orlan", "Gallegos",18383662 , true,vuelo4);
        
        Registro registros = new Registro();
        registros.agregar(pasajero1);
        registros.agregar(pasajero2);
        registros.agregar(pasajero3);
        registros.agregar(pasajero4);
        registros.agregar(pasajero5);
        registros.agregar(pasajero6);
        registros.agregar(pasajero7);
        registros.agregar(pasajero8);

   

        Ticket ticket1 = new Ticket(1l, 183826, 3, LocalDate.now(), pasajero8, vuelo4, 200.540f);
        Ticket ticket2 = new Ticket(2l, 183732, 12, LocalDate.now(), pasajero4, vuelo2, 200.000f);
        Ticket ticket3 = new Ticket(3l, 622324, 5, LocalDate.now(), pasajero6, vuelo4, 550.200f);
        Ticket ticket4 = new Ticket(4l, 123163, 11, LocalDate.now(), pasajero2, vuelo3, 160.990f);
        Ticket ticket5 = new Ticket(5l, 432563, 17, LocalDate.now(), pasajero5, vuelo3, 200.540f);
        Ticket ticket6 = new Ticket(6l, 235634, 9, LocalDate.now(), pasajero1, vuelo1, 168.540f);
        Ticket ticket7 = new Ticket(7l, 647000, 4, LocalDate.now(), pasajero3, vuelo1, 350.540f);
        Ticket ticket8 = new Ticket(8l, 234234, 8, LocalDate.now(), pasajero7, vuelo2, 190.540f);
        
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);
        tickets.add(ticket7);
        tickets.add(ticket8);
        
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(vuelo1);
        vuelos.add(vuelo2);
        vuelos.add(vuelo3);
        vuelos.add(vuelo4);



        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
               System.out.print("Ingrese el numero de la opcion de menú");
               System.out.println("Opcion 1:Mostrar lista de pasajeros \n"
                       + "Opcion 2:Mostrar una lista de ticket \n"
                       + "Opcion 3:Mostrar una lista de vuelos \n"
                       + "Opcion 4 : Mostrar id de vuelos \n"
                       + "Opcion 5:Mostrar todos los pasajeros de un vuelo \n"
                       + "Opcion 6:Modificar el nombre de un pasajero \n"
                       + "Opcion 7:Modificar el destino de un vuelo \n"
                       + "Opcion 8: Modificar los ticket de un pasajero" );
             
        opcion = sc.nextInt();
        switch(opcion){
        case(1):
            for(Pasajero p:registros.getPasajeros() ){
                System.out.print("Nombre: ");
                System.out.println( p.getNombre());
            }
         
            break;
            
        case(2):
            for(Ticket t:tickets){
            System.out.print("Ticket numero : "+t.getNum_ticket());
            }
            break;
          
        case(3):
            for(Vuelo v:vuelos){
             System.out.println("Vuelo numero: "+v.getNumeroDeVuelo());
            }
            break;
         
         case(4):
             for(Vuelo v:vuelos){
             System.out.println("Vuelo numero: "+v.getNumeroDeVuelo()+" y su id es: "+v.getId());
            }
            break;
         
        case(5):
            System.out.println("Ingrese el id del vuelo: ");
            long id_vuelo= sc.nextInt();
             registros.buscar(id_vuelo);
            break;
          
        case(6):
            System.out.println("Ingrese el id del pasajero ");
            long id_pasajero = sc.nextInt();
            System.out.println("Ingrese el nombre del pasajero ");
            String nombre= sc.next();
            for(Pasajero p :registros.getPasajeros()){
               if(p.getId()==id_pasajero){
                 p.setNombre(nombre);
               }
            }
          
            break;
         
        case(7):
             System.out.println("Ingrese el id del vuelo ");
            long id_de_vuelo = sc.nextInt();
            System.out.println("Ingrese el destino");
            String destino= sc.next();
            for(Vuelo v :vuelos){
               if(v.getId()==id_de_vuelo){
                 v.setDestino(destino);
               }
            }
            break;
         
        case(8):
            System.out.println("Ingrese el id del ticket ");
            long id_ticket= sc.nextInt();
            System.out.println("Ingrese el id del vuelo");
            int embarque = sc.nextInt();
            for(Ticket t :tickets){
               if(t.getId()==id_ticket){
                 t.setEmbarque(embarque);
               }
            }
            break;
        
        } 

    
        }while(opcion != 0);
    
    }
    
}
