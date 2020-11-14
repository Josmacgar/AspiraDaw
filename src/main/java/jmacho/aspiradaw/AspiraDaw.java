/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmacho.aspiradaw;

import javax.swing.JOptionPane;

/**
 *
 * @author macho
 */
public class AspiraDaw {

    public static void main(String[] args) {
        //Constantes con el usuario y contraseña
        final String USUARIO = "usuario";
        final String CONTRASEÑA = "usuario";
        final double gastoBateria=1.5;
        //Variables para que el usuario se identifique
        String NombreUsuario;
        String ContraseniaUsuario;
        //Variables para las dependencias
        int cocina=0;
        int salon=0;
        int banio=0;
        int dormitorio1=0;
        int dormitorio2=0;
        //Variable de carga
        double carga=0;
        String repeticion="";
        String habitacion;
        
        //Variables para limpieza de dependencias
        double gastoCocina=0;
        double gastoSalon=0;
        double gastoBanio=0;
        double gastoDormitorio1=0;
        double gastoDormitorio2=0;
        String [] objeto = {"SI", "NO"};
        
        // do while para que se repita en caso de que no sean las credenciales
       /* do {
            NombreUsuario = JOptionPane.showInputDialog(null, "Nombre de usuario");
            ContraseniaUsuario = JOptionPane.showInputDialog(null, "Contraseña");
        } while (!NombreUsuario.equals(USUARIO) || !ContraseniaUsuario.equals(CONTRASEÑA));*/
        do {
       
        //creamos el menu y lo pasamos de String a int
        String entradaMenu;
        entradaMenu = JOptionPane.showInputDialog(null,"Menú:\n 1.Configurar el sistema\n "
                + "2.carga\n 3.Aspiración\n 4.Aspiración y fregado\n 5.Estado general\n"
                + " 6.Base de carga\n 7.Salir");
        int menu = Integer.parseInt(entradaMenu);
        //creamos la estructura switch para el menú
        switch (menu) {
            case 1:
                //Se crea do while para filtrar los datos, y un if para que 
                //muestre un mensaje solo cuando los números no son correctos
                do {
                String metrosCocina=JOptionPane.showInputDialog(null, "Metros cuadrados "
                        + "de la cocina");      
                cocina = Integer.parseInt(metrosCocina);
                if (cocina<1 || cocina>100){
                    JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                }
                
                } while (cocina<1 || cocina>100);
                 do {
                String metrosSalon=JOptionPane.showInputDialog(null, "Metros cuadrados "
                        + "de la salón");
                salon = Integer.parseInt(metrosSalon);
                 if (salon<1 || salon>100){
                    JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                }
                } while (salon<1 || salon>100);
                  do {
                String metrosBaño=JOptionPane.showInputDialog(null, "Metros cuadrados "
                        + "del baño");
                banio = Integer.parseInt(metrosBaño);
                 if (banio<1 || banio>100){
                    JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                }
                } while (banio<1 || banio>100);
                   do {
                String metrosDormitorio1=JOptionPane.showInputDialog(null, "Metros cuadrados "
                        + "del primer dormitorio");
                dormitorio1 = Integer.parseInt(metrosDormitorio1);
                 if (dormitorio1<1 || dormitorio1>100){
                    JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                }
                } while (dormitorio1<1 || dormitorio1>100);
                      do {
                String metrosDormitorio2=JOptionPane.showInputDialog(null, "Metros cuadrados "
                        + "del segundo dormitorio");
                dormitorio2 = Integer.parseInt(metrosDormitorio2);
                 if (dormitorio2<1 || dormitorio2>100){
                    JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                }
                } while (dormitorio2<1 || dormitorio2>100);
                break;
            case 2:
                //do while para que la carga sea entre 0 y 100
                do {
                String nivelCarga=JOptionPane.showInputDialog(null, "Introduzca un"
                        + " numero entre 0 y 100 ");
                carga = Double.parseDouble(nivelCarga);
                 if (carga<0 || carga>100){
                    JOptionPane.showMessageDialog(null, "Introduzca un numero entre 0 y 100 ");
                }
                } while (carga<0 || carga>100);  
                break;
            case 3:
                String modoAspiracion;
                 modoAspiracion = JOptionPane.showInputDialog(null,"Modo de aspiracion:\n"
                         + "1.Modo completo\n 2.Modo dependencias");
                    int modo = Integer.parseInt(modoAspiracion);
                switch (modo){
                    case 1:
                      // en otro caso hacer algo que redondee al mas pequeño
                       /* if (cocina<carga){
                           carga = carga - cocina;
                        } else if (cocina==carga){
                            JOptionPane.showMessageDialog(null, "se ha podido limpiar la cocina ");
                            break;
                       } else if (cocina>carga){
                           JOptionPane.showMessageDialog(null, "no hay suficiente bateria");
                       }
                       
                        else if (salon*1.25<carga){
                           carga = carga - salon*1.25;
                           JOptionPane.showMessageDialog(null, "prueba superada");
                       } else if (salon*1.25==carga || salon*1.25>carga){
                           JOptionPane.showMessageDialog(null, "se ha podido limpiar"
                                   + " la cocina y el salon");
                          break;
                       } */
                      /* else if (banio*1.25<=carga){
                            carga = carga - banio*1.25;
                       } else if (banio*1.25==carga || banio*1.25>carga){
                            System.out.println("se ha podido limpiar la cocina, el salon"
                                   + "y el baño");
                            break;
                       }
                       else if (dormitorio1*1.25<=carga){
                           carga = carga - dormitorio1*1.25;
                       } else if (dormitorio1*1.25==carga || dormitorio1*1.25>carga){
                           System.out.println("se ha podido limpiar la cocina, el salon,"
                                   + " el baño y el dormitorio 1");
                           break;
                       }
                       else if (dormitorio2*1.25<=carga){
                           carga = carga - dormitorio2*1.25;
                       } else if (dormitorio2*1.25==carga || dormitorio2*1.25>carga){
                           System.out.println("se ha podido limpiar toda la vivienda");
                           break;
                       }*/
                            
                    case 2:
                       // do {
                            habitacion=JOptionPane.showInputDialog(null,"¿Qué habitacion desea "
                                + "limpiar?\n cocina\n salon\n baño\n dormitorio1\n "
                                + "dormitorio2");
                        gastoCocina = 1.5*cocina;
                        gastoSalon = 1.5*salon;
                        gastoBanio = 1.5*banio;
                        gastoDormitorio1 = 1.5*dormitorio1;
                        gastoDormitorio2 = 1.5*dormitorio2;
                        switch (habitacion) {
                            case "cocina":
                                 if (gastoCocina<carga && carga<=3){
                                     JOptionPane.showMessageDialog(null,"Bateria insuficiente, "
                                             + "el robot se dirige a la base de carga");
                                } else if (gastoCocina<carga){
                                   JOptionPane.showMessageDialog(null,"Se ha limpiado"
                                           + "la cocina"); 
                                   carga = carga-gastoCocina;
                                }else if (gastoCocina>carga) {
                                   JOptionPane.showMessageDialog(null,"No hay suficiente "
                                           + "bateria");  
                                }
                                 break;
                            case "salon":
                               if (gastoSalon<carga && carga<=3){
                                     JOptionPane.showMessageDialog(null,"Bateria insuficiente, "
                                             + "el robot se dirige a la base de carga");
                                } else if (gastoSalon<carga){
                                   JOptionPane.showMessageDialog(null,"Se ha limpiado"
                                           + "el salon"); 
                                   carga = carga-gastoSalon;
                                }else if (gastoSalon>carga) {
                                   JOptionPane.showMessageDialog(null,"No hay suficiente "
                                           + "bateria");  
                                }
                               break;
                            case "baño":
                              if (gastoBanio<carga && carga<=3){
                                     JOptionPane.showMessageDialog(null,"Bateria insuficiente, "
                                             + "el robot se dirige a la base de carga");
                                } else if (gastoBanio<carga){
                                   JOptionPane.showMessageDialog(null,"Se ha limpiado"
                                           + "el baño"); 
                                   carga = carga-gastoBanio;
                                }else if (gastoBanio>carga) {
                                   JOptionPane.showMessageDialog(null,"No hay suficiente "
                                           + "bateria");  
                                }
                              break;
                            case "dormitorio1":
                                if (gastoDormitorio1<carga && carga<=3){
                                     JOptionPane.showMessageDialog(null,"Bateria insuficiente, "
                                             + "el robot se dirige a la base de carga");
                                } else if (gastoDormitorio1<carga){
                                   JOptionPane.showMessageDialog(null,"Se ha limpiado"
                                           + "el dormitorio 1"); 
                                   carga = carga-gastoDormitorio1;
                                }else if (gastoDormitorio1>carga) {
                                   JOptionPane.showMessageDialog(null,"No hay suficiente "
                                           + "bateria");  
                                }
                                break;
                            case "dormitorio2":
                               if (gastoDormitorio2<carga && carga<=3){
                                     JOptionPane.showMessageDialog(null,"Bateria insuficiente, "
                                             + "el robot se dirige a la base de carga");
                                } else if (gastoDormitorio2<carga){
                                   JOptionPane.showMessageDialog(null,"Se ha limpiado"
                                           + "el dormitorio 2"); 
                                   carga = carga-gastoDormitorio2;
                                }else if (gastoDormitorio2>carga) {
                                   JOptionPane.showMessageDialog(null,"No hay suficiente "
                                           + "bateria");  
                                }
                                break; 
                        }
                        //}while ();
                         
                }
                break;
            case 4:
                break;
            case 5:
                 JOptionPane.showMessageDialog(null,carga);
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Busque la base de carga y entre "
                        + "en modo de carga");
                carga = 100;
                break;
            default:
                System.exit(0);
        }
       
        repeticion =JOptionPane.showInputDialog(null,"Desea repetir el programa:\n si\n no");
        }while (repeticion.equalsIgnoreCase("si"));
       

    }

}
