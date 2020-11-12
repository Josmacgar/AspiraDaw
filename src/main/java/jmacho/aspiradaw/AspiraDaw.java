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
        //Variables para que el usuario se identifique
        String NombreUsuario;
        String ContraseniaUsuario;
        //Variables para las dependencias
        int cocina;
        int salon;
        int baño;
        int dormitorio1;
        int dormitorio2;
        //Variable de carga
        int carga;
        // do while para que se repita en caso de que no sean las credenciales
        do {
            NombreUsuario = JOptionPane.showInputDialog(null, "Nombre de usuario");
            ContraseniaUsuario = JOptionPane.showInputDialog(null, "Contraseña");
        } while (!NombreUsuario.equals(USUARIO) || !ContraseniaUsuario.equals(CONTRASEÑA));
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
                baño = Integer.parseInt(metrosBaño);
                 if (baño<1 || baño>100){
                    JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                }
                } while (baño<1 || baño>100);
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
                carga = Integer.parseInt(nivelCarga);
                 if (carga<0 || carga>100){
                    JOptionPane.showMessageDialog(null, "Introduzca un numero entre 0 y 100 ");
                }
                } while (carga<0 || carga>100);  
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
        }

    }

}
