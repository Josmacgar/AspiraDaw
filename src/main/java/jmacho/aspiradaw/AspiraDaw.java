/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmacho.aspiradaw;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author macho
 */
public class AspiraDaw {

    public static void main(String[] args) {
        //Constantes con el usuario y contraseña
        final String USUARIO = "usuario";
        final String CONTRASEÑA = "usuario";
        //variables del programa en sí
        final double gastoBateria = 1.5;
        int menu;
        int estadoGeneral;
        int repeticionDependencias;
        //Variables para que el usuario se identifique
        String nombreUsuario;
        String contraseniaUsuario;
        //Variables para las dependencias
        int cocina = 0;
        int salon = 0;
        int banio = 0;
        int dormitorio1 = 0;
        int dormitorio2 = 0;
        //Variable de carga
        double carga = 0;
        String repeticion = "";
        String habitacion;
        String lugar = "";

        //Variables para limpieza de dependencias
        double gastoCocina = 0;
        double gastoSalon = 0;
        double gastoBanio = 0;
        double gastoDormitorio1 = 0;
        double gastoDormitorio2 = 0;

        // do while para que se repita en caso de que no sean las credenciales
        do {
            nombreUsuario = JOptionPane.showInputDialog(null, "Nombre de usuario");
            contraseniaUsuario = JOptionPane.showInputDialog(null, "Contraseña");
            if (!nombreUsuario.equals(USUARIO) || !contraseniaUsuario.equals(CONTRASEÑA)) {
                JOptionPane.showMessageDialog(null, "Datos erróneos");
            }
        } while (!nombreUsuario.equals(USUARIO) || !contraseniaUsuario.equals(CONTRASEÑA));
        JOptionPane.showMessageDialog(null, "Bienvenido " + USUARIO);
        //Manual de usuario
        JOptionPane.showMessageDialog(null, "¡NOTA IMPORTANTE!\n Antes de realizar "
                + "cualquier tipo de limpieza debes configurar las dependencias "
                + "y la bateria");
        do {

            //creamos el menu y lo pasamos de String a int
            String entradaMenu;
            entradaMenu = JOptionPane.showInputDialog(null, "Menú:\n 1.Configurar el sistema\n "
                    + "2.carga\n 3.Aspiración\n 4.Aspiración y fregado\n 5.Estado general\n"
                    + " 6.Base de carga\n 7.Salir");
            menu = Integer.parseInt(entradaMenu);
            //creamos la estructura switch para el menú
            switch (menu) {
                case 1:
                    //Se crea un do while por si los datos no son correctos
                    //Se crea do while para filtrar los datos, y un if para que 
                    //muestre un mensaje solo cuando los números no son correctos
                    do {
                        do {
                            String metrosCocina = JOptionPane.showInputDialog(null, "Metros cuadrados "
                                    + "de la cocina");
                            cocina = Integer.parseInt(metrosCocina);
                            if (cocina < 1 || cocina > 100) {
                                JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                            }

                        } while (cocina < 1 || cocina > 100);
                        do {
                            String metrosSalon = JOptionPane.showInputDialog(null, "Metros cuadrados "
                                    + "de la salón");
                            salon = Integer.parseInt(metrosSalon);
                            if (salon < 1 || salon > 100) {
                                JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                            }
                        } while (salon < 1 || salon > 100);
                        do {
                            String metrosBaño = JOptionPane.showInputDialog(null, "Metros cuadrados "
                                    + "del baño");
                            banio = Integer.parseInt(metrosBaño);
                            if (banio < 1 || banio > 100) {
                                JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                            }
                        } while (banio < 1 || banio > 100);
                        do {
                            String metrosDormitorio1 = JOptionPane.showInputDialog(null, "Metros cuadrados "
                                    + "del primer dormitorio");
                            dormitorio1 = Integer.parseInt(metrosDormitorio1);
                            if (dormitorio1 < 1 || dormitorio1 > 100) {
                                JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                            }
                        } while (dormitorio1 < 1 || dormitorio1 > 100);
                        do {
                            String metrosDormitorio2 = JOptionPane.showInputDialog(null, "Metros cuadrados "
                                    + "del segundo dormitorio");
                            dormitorio2 = Integer.parseInt(metrosDormitorio2);
                            if (dormitorio2 < 1 || dormitorio2 > 100) {
                                JOptionPane.showMessageDialog(null, "Introduzca un numero entre 1 y 100 ");
                            }
                        } while (dormitorio2 < 1 || dormitorio2 > 100);
                        JOptionPane.showMessageDialog(null, "Las dependencias de la casa son:\n"
                                + "Cocina: con " + cocina + " m2\n" + "Salon: con " + salon + " m2\n"
                                + "Baño: con " + banio + " m2\n" + "Dormitorio1: con " + dormitorio1 + " m2\n"
                                + "Dormitorio2: con " + dormitorio2 + " m2\n");
                        String repeticionDependencias1 = JOptionPane.showInputDialog(null, "¿Son correctos"
                                + " los datos?\n 1.Si\n 2.No");
                        repeticionDependencias = Integer.parseInt(repeticionDependencias1);
                    } while (repeticionDependencias == 2);
                    break;
                case 2:
                    //do while para que la carga sea entre 0 y 100
                    do {
                        String nivelCarga = JOptionPane.showInputDialog(null, "Introduzca un"
                                + " numero entre 0 y 100 ");
                        carga = Double.parseDouble(nivelCarga);
                        if (carga < 0 || carga > 100) {
                            JOptionPane.showMessageDialog(null, "Introduzca un numero entre 0 y 100 ");
                        }
                    } while (carga < 0 || carga > 100);
                    break;
                case 3:
                    String modoAspiracion;
                    modoAspiracion = JOptionPane.showInputDialog(null, "Modo de aspiracion:\n"
                            + "1.Modo completo\n 2.Modo dependencias");
                    int modo = Integer.parseInt(modoAspiracion);
                    switch (modo) {
                        case 1:
                            carga = carga;
                            gastoCocina = 1.5 * cocina;
                            gastoSalon = 1.5 * salon;
                            gastoBanio = 1.5 * banio;
                            gastoDormitorio1 = 1.5 * dormitorio1;
                            gastoDormitorio2 = 1.5 * dormitorio2;
                            // en otro caso hacer algo que redondee al mas pequeño
                            if (carga <= 3) {
                                JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                        + "el robot debe dirigirse a la base de carga");
                                break;
                            } else if (gastoCocina < carga) {
                                JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                        + "la cocina");
                                carga = carga - gastoCocina;
                            } else if (gastoCocina > carga) {
                                JOptionPane.showMessageDialog(null, "No hay suficiente "
                                        + "bateria");
                            } else if (carga <= 3) {
                                JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                        + "el robot debe dirigirse a la base de carga");
                                break;
                            } else if (gastoSalon < carga) {
                                JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                        + "el salon");
                                carga = carga - gastoSalon;
                                lugar = "salon";
                            } else if (gastoSalon > carga) {
                                JOptionPane.showMessageDialog(null, "No hay suficiente "
                                        + "bateria");
                                break;
                            }

                            if (carga <= 3) {
                                JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                        + "el robot debe dirigirse a la base de carga");
                                break;
                            } else if (gastoBanio < carga) {
                                JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                        + "el baño");
                                carga = carga - gastoBanio;
                                lugar = "baño";
                            } else if (gastoBanio > carga) {
                                JOptionPane.showMessageDialog(null, "No hay suficiente "
                                        + "bateria");
                                break;
                            }

                            if (carga <= 3) {
                                JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                        + "el robot debe dirigirse a la base de carga");
                                break;
                            } else if (gastoDormitorio1 < carga) {
                                JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                        + "el dormitorio 1");
                                carga = carga - gastoDormitorio1;
                                lugar = "dormitorio 1";
                            } else if (gastoDormitorio1 > carga) {
                                JOptionPane.showMessageDialog(null, "No hay suficiente "
                                        + "bateria");
                                break;
                            }

                            if (carga <= 3) {
                                JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                        + "el robot debe dirigirse a la base de carga");
                                break;
                            } else if (gastoDormitorio2 < carga) {
                                JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                        + "el dormitorio 2");
                                carga = carga - gastoDormitorio2;
                                lugar = "dormitorio 2";
                            } else if (gastoDormitorio2 > carga) {
                                JOptionPane.showMessageDialog(null, "No hay suficiente "
                                        + "bateria");
                            }
                            break;
                        case 2:
                            //do while para repetir las dependencias hasta que el usuario
                            //diga salir
                            do {
                                carga = carga;
                                habitacion = JOptionPane.showInputDialog(null, "¿Qué habitacion desea "
                                        + "limpiar?\n cocina\n salon\n baño\n dormitorio1\n "
                                        + "dormitorio2\n salir");
                                gastoCocina = 1.5 * cocina;
                                gastoSalon = 1.5 * salon;
                                gastoBanio = 1.5 * banio;
                                gastoDormitorio1 = 1.5 * dormitorio1;
                                gastoDormitorio2 = 1.5 * dormitorio2;
                                //swith en el que dentro tienen un if para realize una operacion
                                //dependiendo del nivel de carga y del nivel que va a gastar
                                switch (habitacion) {
                                    case "cocina":
                                        if (carga <= 3) {
                                            JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                                    + "el robot debe dirigirse a la base de carga");
                                        } else if (gastoCocina < carga) {
                                            JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                                    + "la cocina");
                                            carga = carga - gastoCocina;
                                            lugar = "cocina";
                                        } else if (gastoCocina > carga) {
                                            JOptionPane.showMessageDialog(null, "No hay suficiente "
                                                    + "bateria");
                                        }
                                        break;
                                    case "salon":
                                        if (gastoSalon < carga && carga <= 3) {
                                            JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                                    + "el robot debe dirigirse a la base de carga");
                                        } else if (gastoSalon < carga) {
                                            JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                                    + "el salon");
                                            carga = carga - gastoSalon;
                                            lugar = "salon";
                                        } else if (gastoSalon > carga) {
                                            JOptionPane.showMessageDialog(null, "No hay suficiente "
                                                    + "bateria");
                                        }
                                        break;
                                    case "baño":
                                        if (carga <= 3) {
                                            JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                                    + "el robot debe dirigirse a la base de carga");
                                            break;
                                        } else if (gastoBanio < carga) {
                                            JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                                    + "el baño");
                                            carga = carga - gastoBanio;
                                            lugar = "baño";
                                        } else if (gastoBanio > carga) {
                                            JOptionPane.showMessageDialog(null, "No hay suficiente "
                                                    + "bateria");
                                        }
                                        break;
                                    case "dormitorio1":
                                        if (carga <= 3) {
                                            JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                                    + "el robot debe dirigirse a la base de carga");
                                            break;
                                        } else if (gastoDormitorio1 < carga) {
                                            JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                                    + "el dormitorio 1");
                                            carga = carga - gastoDormitorio1;
                                            lugar = "dormitorio 1";
                                        } else if (gastoDormitorio1 > carga) {
                                            JOptionPane.showMessageDialog(null, "No hay suficiente "
                                                    + "bateria");
                                        }
                                        break;
                                    case "dormitorio2":
                                        if (carga <= 3) {
                                            JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                                    + "el robot debe dirigirse a la base de carga");
                                            break;
                                        } else if (gastoDormitorio2 < carga) {
                                            JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                                    + "el dormitorio 2");
                                            carga = carga - gastoDormitorio2;
                                            lugar = "dormitorio 2";
                                        } else if (gastoDormitorio2 > carga) {
                                            JOptionPane.showMessageDialog(null, "No hay suficiente "
                                                    + "bateria");
                                        }
                                        break;
                                }
                            } while (!habitacion.equalsIgnoreCase("salir"));

                    }
                    break;
                case 4:
                    //do while para repetir las dependencias hasta que el usuario
                    //diga salir
                    do {
                        carga = carga;
                        habitacion = JOptionPane.showInputDialog(null, "¿Qué habitacion desea "
                                + "Aspirar y Fregar?\n cocina\n salon\n baño\n dormitorio1\n "
                                + "dormitorio2\n salir");
                        gastoCocina = 2.25 * cocina;
                        gastoSalon = 2.25 * salon;
                        gastoBanio = 2.25 * banio;
                        gastoDormitorio1 = 2.25 * dormitorio1;
                        gastoDormitorio2 = 2.252 * dormitorio2;
                        //swith en el que dentro tienen un if para realize una operacion
                        //dependiendo del nivel de carga y del nivel que va a gastar
                        switch (habitacion) {
                            case "cocina":
                                if (carga <= 3) {
                                    JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                            + "el robot debe dirigirse a la base de carga");
                                    break;
                                } else if (gastoCocina < carga) {
                                    JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                            + "la cocina");
                                    carga = carga - gastoCocina;
                                    lugar = "cocina";
                                } else if (gastoCocina > carga) {
                                    JOptionPane.showMessageDialog(null, "No hay suficiente "
                                            + "bateria");
                                }
                                break;
                            case "salon":
                                if (carga <= 3) {
                                    JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                            + "el robot debe dirigirse a la base de carga");
                                    break;
                                } else if (gastoSalon < carga) {
                                    JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                            + "el salon");
                                    carga = carga - gastoSalon;
                                    lugar = "salon";
                                } else if (gastoSalon > carga) {
                                    JOptionPane.showMessageDialog(null, "No hay suficiente "
                                            + "bateria");
                                }
                                break;
                            case "baño":
                                if (carga <= 3) {
                                    JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                            + "el robot debe dirigirse a la base de carga");
                                    break;
                                } else if (gastoBanio < carga) {
                                    JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                            + "el baño");
                                    carga = carga - gastoBanio;
                                    lugar = "baño";
                                } else if (gastoBanio > carga) {
                                    JOptionPane.showMessageDialog(null, "No hay suficiente "
                                            + "bateria");
                                }
                                break;
                            case "dormitorio1":
                                if (carga <= 3) {
                                    JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                            + "el robot debe dirigirse a la base de carga");
                                    break;
                                } else if (gastoDormitorio1 < carga) {
                                    JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                            + "el dormitorio 1");
                                    carga = carga - gastoDormitorio1;
                                    lugar = "dormitorio 1";
                                } else if (gastoDormitorio1 > carga) {
                                    JOptionPane.showMessageDialog(null, "No hay suficiente "
                                            + "bateria");
                                }
                                break;
                            case "dormitorio2":
                                if (carga <= 3) {
                                    JOptionPane.showMessageDialog(null, "Bateria insuficiente, "
                                            + "el robot debe dirigirse a la base de carga");
                                    break;
                                } else if (gastoDormitorio2 < carga) {
                                    JOptionPane.showMessageDialog(null, "Se ha limpiado "
                                            + "el dormitorio 2");
                                    carga = carga - gastoDormitorio2;
                                    lugar = "dormitorio 2";
                                } else if (gastoDormitorio2 > carga) {
                                    JOptionPane.showMessageDialog(null, "No hay suficiente "
                                            + "bateria");
                                }
                                break;
                        }
                    } while (!habitacion.equalsIgnoreCase("salir"));
                    break;
                case 5:
                    do {
                        String estadoGeneral1 = JOptionPane.showInputDialog(null, "ESTADO GENERAL\n"
                                + "1.Nivel de carga\n 2.Localización del robot\n 3.Dependencias "
                                + "de la casa\n 4.Fecha y Hora\n 5.Salir");
                        estadoGeneral = Integer.parseInt(estadoGeneral1);

                        switch (estadoGeneral) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "El nivel de carga es: " + carga);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "El robot se encuentra en la dependencia: "
                                        + lugar);
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Las dependencias de la casa son:\n"
                                        + "Cocina: con " + cocina + " m2\n" + "Salon: con " + salon + " m2\n"
                                        + "Baño: con " + banio + " m2\n" + "Dormitorio1: con " + dormitorio1 + " m2\n"
                                        + "Dormitorio2: con " + dormitorio2 + " m2\n");
                                break;
                            case 4:
                                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                                Date fecha = new Date();
                                JOptionPane.showMessageDialog(null, formato.format(fecha));
                                break;
                        }
                    } while (estadoGeneral != 5);
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "El robot se dirige a la base de carga"
                            + " y empieza a cargarse ");
                    carga = 100;
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Good Bye");
            }
        } while (menu != 7);
    }

}
