/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teatromorov2;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class TeatroMoroV2 {

    public static void main(String[] args) {
        
        System.out.println("\n\n===== BIENVENIDOS AL TEATRO MORO =====");
        
        int opcionInicial;
        
        int opcionZona;
        String zona = "";
        int opcionFila;
        String filaSeleccionada = "";
        int asiento;
        String asientoSeleccionado = "";
        String ubicacionAsiento = "";
        int valor = 0;
        boolean otraCompra = true;
        int opcionOtraCompra;
        int opcionDescuento;
        String descuentoSeleccionado = "";
        int descuento = 0;
        String totalAsientos = "";
        int total = 0;
        int descuentoEntrada;
        int totalDescuento = 0;
        int totalParaPagar = 0;
        int precioFinalEntrada = 0;
        
        Scanner sc = new Scanner(System.in);
        
        
        
        
        for(;;)
        {
            System.out.println("\n¿Que desea hacer?");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Salir");
            System.out.print("\nElija una opcion: ");
            opcionInicial = sc.nextInt();
            
            
                
            if(opcionInicial == 1)
            {
                for(;;)
                {
                    System.out.println("\nTipo descuento");
                    System.out.println("1. Publico general");
                    System.out.println("2. Tercera edad");
                    System.out.println("3. Estudiante");
                    System.out.print("Opcion descuento: ");
                    opcionDescuento = sc.nextInt();
                        
                    if(opcionDescuento == 1)
                    {
                        descuentoSeleccionado = "Publico general";
                        descuento = 0;
                        break;
                    }
                    else if(opcionDescuento == 2)
                    {
                        descuentoSeleccionado = "Tercera edad";
                        descuento = 15;
                        break;
                    }
                    else if(opcionDescuento == 3)
                    {
                        descuentoSeleccionado = "Estudiante";
                        descuento = 10;
                        break;
                    }
                    else
                    {
                        System.out.print("Opcion no valida, intente de nuevo.");
                    }
                }
                
                do
                {
                    System.out.println("\nPlano del teatro: ");
                    System.out.println("1. Zona A: Fila del 1 al 5");
                    System.out.println("   Valor zona A: $20.000");
                    System.out.println("2. Zona B: Fila del 6 al 10");
                    System.out.println("   Valor zona B: $15.000");
                    System.out.println("3. Zona C: Filas del 11 al 15");
                    System.out.println("   Valor zona C: $10.000");
                    System.out.println("4. Salir \n");
                    System.out.print("Seleccione la zona que decea: ");
                    opcionZona = sc.nextInt();
                
                    if(opcionZona == 1 || opcionZona == 2 || opcionZona == 3 || 
                       opcionZona == 4)
                    {
                    
                        if(opcionZona == 1)
                        {
                            zona = "Zona A";
                            for(;;)
                            {
                                System.out.print("\nSeleccione la fila del 1 al 5: ");
                                opcionFila = sc.nextInt();
                                
                                if(opcionFila == 1 || opcionFila == 2 || opcionFila == 3 
                                   || opcionFila == 4 || opcionFila == 5)
                                {
                                    filaSeleccionada = "" + opcionFila;
                                    
                                    for(;;)
                                    {
                                        System.out.print("\nSeleccione su asiento del 1 al 10: ");
                                        asiento = sc.nextInt();

                                        if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                           asiento == 4 || asiento == 5 || asiento == 6 ||
                                           asiento == 7 || asiento == 8 || asiento == 9||
                                           asiento == 10)
                                        {
                                            asientoSeleccionado = "" + asiento;
                                            valor = 20000;

                                            for(;;)
                                            {
                                                System.out.println("\n¿Desea realizar otra compra?");
                                                System.out.println("1. Si");
                                                System.out.println("2. No");
                                                System.out.print("Opcion: ");
                                                opcionOtraCompra = sc.nextInt();

                                                if(opcionOtraCompra == 1)
                                                {
                                                    descuentoEntrada = (descuento / 100) * valor;
                                                    totalDescuento = descuentoEntrada + totalDescuento;
                                                    total = total + valor;
                                                    ubicacionAsiento = zona + " fila " + filaSeleccionada + " asiento " + asientoSeleccionado;
                                                    totalAsientos = totalAsientos + " "  + ubicacionAsiento;
                                                    precioFinalEntrada = valor - descuentoEntrada;
                                                    
                                                    System.out.println("Ubicacion del asiento: " + ubicacionAsiento);
                                                    System.out.println("Valor: $" + valor);
                                                    System.out.println("Tipo descuento: " + descuentoSeleccionado);
                                                    System.out.println("Descuento: " + descuento + "%");
                                                    System.out.println("Precio final de la entrada: " + precioFinalEntrada);
                                                    otraCompra = true;
                                                    break;
                                                }
                                                else if(opcionOtraCompra == 2)
                                                {
                                                    descuentoEntrada = (descuento / 100) * valor;
                                                    totalDescuento = descuentoEntrada + totalDescuento;
                                                    total = total + valor;
                                                    ubicacionAsiento = zona + " fila " + filaSeleccionada + " asiento " + asientoSeleccionado;
                                                    totalAsientos = totalAsientos + " "  + ubicacionAsiento;
                                                    precioFinalEntrada = valor - descuentoEntrada;
                                                    
                                                    System.out.println("Ubicacion del asiento: " + ubicacionAsiento);
                                                    System.out.println("Valor: $" + valor);
                                                    System.out.println("Tipo descuento: " + descuentoSeleccionado);
                                                    System.out.println("Descuento: " + descuento + "%");
                                                    System.out.println("Precio final de la entrada: " + precioFinalEntrada);
                                                    otraCompra = false;
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.print("\nOpcion invalida, vuelva a intentar.");
                                                }
                                            }
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("Asiento no encontrado, intente de nuevo.");
                                        }
                                    }
                                    break;
                                }
                                else
                                {
                                    System.out.println("Fila no encontrada, intente de nuevo.");
                                }
                            }
                        }
                        else if(opcionZona == 2)
                        {
                            zona ="Zona B";
                            for(;;)
                            {
                                System.out.print("Seleccione fila del 6 al 10: ");
                                opcionFila = sc.nextInt();
                                if(opcionFila == 6 || opcionFila == 7 || opcionFila == 8 
                                  || opcionFila == 9 || opcionFila == 10)
                                {
                                    filaSeleccionada = "" + opcionFila;
                                    
                                    for(;;)
                                    {
                                        System.out.println("Seleccione su asiento del 1 al 10: ");
                                        asiento = sc.nextInt();
                                        
                                        if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                           asiento == 4 || asiento == 5 || asiento == 6 ||
                                           asiento == 7 || asiento == 8 || asiento == 9||
                                           asiento == 10)
                                        {
                                            asientoSeleccionado = "" + asiento;
                                            valor = 15000;

                                            for(;;)
                                            {
                                                System.out.println("¿Desea realizar otra compra?");
                                                System.out.println("1. Si");
                                                System.out.println("2. No");
                                                System.out.print("Opcion: ");
                                                opcionOtraCompra = sc.nextInt();

                                                if(opcionOtraCompra == 1)
                                                {
                                                    descuentoEntrada = (descuento / 100) * valor;
                                                    totalDescuento = descuentoEntrada + totalDescuento;
                                                    total = total + valor;
                                                    ubicacionAsiento = zona + " fila " + filaSeleccionada + " asiento " + asientoSeleccionado;
                                                    totalAsientos = totalAsientos + " "  + ubicacionAsiento;
                                                    precioFinalEntrada = valor - descuentoEntrada;
                                                    
                                                    System.out.println("Ubicacion del asiento: " + ubicacionAsiento);
                                                    System.out.println("Valor: $" + valor);
                                                    System.out.println("Tipo descuento: " + descuentoSeleccionado);
                                                    System.out.println("Descuento: " + descuento + "%");
                                                    System.out.println("Precio final de la entrada: " + precioFinalEntrada);
                                                    otraCompra = true;
                                                    break;
                                                }
                                                else if(opcionOtraCompra == 2)
                                                {
                                                    descuentoEntrada = (descuento / 100) * valor;
                                                    totalDescuento = descuentoEntrada + totalDescuento;
                                                    total = total + valor;
                                                    ubicacionAsiento = zona + " fila: " + filaSeleccionada + " asiento " + asientoSeleccionado;
                                                    totalAsientos = totalAsientos + " "  + ubicacionAsiento;
                                                    precioFinalEntrada = valor - descuentoEntrada;
                                                    
                                                    System.out.println("Ubicacion del asiento: " + ubicacionAsiento);
                                                    System.out.println("Valor: $" + valor);
                                                    System.out.println("Tipo descuento: " + descuentoSeleccionado);
                                                    System.out.println("Descuento: " + descuento + "%");
                                                    System.out.println("Precio final de la entrada: " + precioFinalEntrada);
                                                    otraCompra = false;
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.print("\nOpcion invalida, vuelva a intentar.");
                                                }
                                            }
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("Asiento no encontrado, intente de nuevo.");
                                        }
                                    }
                                    break;
                                }
                                else
                                {
                                    System.out.println("Fila no encontrada, intente de nuevo.");
                                }
                            }
                        }
                        else if(opcionZona == 3)
                        {
                            zona = zona + "Zona C";
                            for(;;)
                            {
                                System.out.print("Seleccione fila del 11 al 15: ");
                                opcionFila = sc.nextInt();
                                if(opcionFila == 11 || opcionFila == 12 || opcionFila == 13 
                                   || opcionFila == 14 || opcionFila == 15)
                                {
                                    filaSeleccionada = "" + opcionFila;
                                    for(;;)
                                    {    
                                        System.out.print("Seleccione su asiento del 1 al 10: ");
                                        asiento = sc.nextInt();
                                        if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                           asiento == 4 || asiento == 5 || asiento == 6 ||
                                           asiento == 7 || asiento == 8 || asiento == 9||
                                           asiento == 10)
                                        {
                                            asientoSeleccionado = "" + asiento;
                                            valor = valor + 10000;

                                            for(;;)
                                            {
                                                System.out.println("¿Desea realizar otra compra?");
                                                System.out.println("1. Si");
                                                System.out.println("2. No");
                                                System.out.print("Opcion: ");
                                                opcionOtraCompra = sc.nextInt();

                                                if(opcionOtraCompra == 1)
                                                {
                                                    descuentoEntrada = (descuento / 100) * valor;
                                                    totalDescuento = descuentoEntrada + totalDescuento;
                                                    total = total + valor;
                                                    ubicacionAsiento = zona + " fila " + filaSeleccionada + " asiento " + asientoSeleccionado;
                                                    totalAsientos = totalAsientos + " "  + ubicacionAsiento;
                                                    precioFinalEntrada = valor - descuentoEntrada;
                                                    
                                                    System.out.println("Ubicacion del asiento: " + ubicacionAsiento);
                                                    System.out.println("Valor: $" + valor);
                                                    System.out.println("Tipo descuento: " + descuentoSeleccionado);
                                                    System.out.println("Descuento: " + descuento + "%");
                                                    System.out.println("Precio final de la entrada: " + precioFinalEntrada);
                                                    otraCompra = true;
                                                    break;
                                                }
                                                else if(opcionOtraCompra == 2)
                                                {
                                                    descuentoEntrada = (descuento / 100) * valor;
                                                    totalDescuento = descuentoEntrada + totalDescuento;
                                                    total = total + valor;
                                                    ubicacionAsiento = zona + " fila " + filaSeleccionada + " asiento " + asientoSeleccionado;
                                                    totalAsientos = totalAsientos + " "  + ubicacionAsiento;
                                                    precioFinalEntrada = valor - descuentoEntrada;
                                                    
                                                    System.out.println("Ubicacion del asiento: " + ubicacionAsiento);
                                                    System.out.println("Valor: $" + valor);
                                                    System.out.println("Tipo descuento: " + descuentoSeleccionado);
                                                    System.out.println("Descuento: " + descuento + "%");
                                                    System.out.println("Precio final de la entrada: " + precioFinalEntrada);
                                                    otraCompra = false;
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.print("\nOpcion invalida, vuelva a intentar.");
                                                }
                                            }
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("Asiento no encontrado, intente de nuevo.");
                                        }
                                    }
                                    break;
                                }
                                else
                                {
                                    System.out.println("Fila no encontrada, intente de nuevo.");
                                }
                            }
                        }
                        else if(opcionZona == 4)
                        {
                            System.out.println("Saliendo de la seleccion de zona...");
                            break;
                        }
                        else
                        {
                            System.out.println("Opcion no valida, vuelva a intentar.");
                        }
                    }
                    else
                    {
                        System.out.println("Opcion no valida, vuelva a intentar.");
                    }  
                }while(otraCompra);
            }
            else if(opcionInicial == 2)
            {
                System.out.println("Saliendo del sistem...\n\n");
                break;
            }
            else
            {
                System.out.println("Opcion no valida, intente de nuevo.");
                    
            }
            
        }
        
        totalParaPagar = total - totalDescuento;
        
        System.out.println("Asientos: " + totalAsientos);
        System.out.println("Total descuento: $" + totalDescuento);
        System.out.println("Total neto: $" + total);
        System.out.println("Total a pagar: $" + totalParaPagar);
        
    }
}
