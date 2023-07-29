package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        //Declarando variables---

        /*String nombre;
        String apelledidos;
        Integer edad;
        Integer numeroUsosTarjeta;
        Double comprasAseo;
        Double comprasAlimentos;
        Double comprasOtros;
        Integer puntajeCredito;

        //Inicializando variables para ingreso datos por teclado......


        System.out.print("Señor usuario por favor ingrese nombre completo: ");
        nombre= teclado.nextLine();

        System.out.print("Señor usuario por favor digite sus apellidos : ");
        apelledidos= teclado.nextLine();

        System.out.print("Por favor ingrese su edad:");
        edad=teclado.nextInt();

        System.out.print("Por favor ingrese la cantidad de usos de su tarjeta este mes :");
        numeroUsosTarjeta= teclado.nextInt();

        System.out.print("Por favor ingrese total compras aseo: ");
        comprasAseo= teclado.nextDouble();

        System.out.print("Por favor ingrese total compras alimentos: ");
        comprasAlimentos= teclado.nextDouble();

        System.out.print("Por favor ingrese total otras compras: ");
        comprasOtros= teclado.nextDouble();

        System.out.print("Ingrese su puntaje:");
        puntajeCredito= teclado.nextInt();


        //salida de datos al usuario......

        Double totalDeuda=comprasAseo+comprasAlimentos+comprasOtros;
        System.out.print("Total a pagar de su deuda es: " +totalDeuda);

        if(puntajeCredito==1){
            Double totalDescuento=totalDeuda-(totalDeuda*0.25);
            System.out.print(" Señor usuario usted aplica descuento del 25% su total a pagar es  : " +totalDescuento);

        } else if (puntajeCredito==2){
            Double totalDescuento=totalDeuda-(totalDeuda*0.2);
            System.out.print(" Señor usuario usted aplica descuento del 20% su total a pagar es : " +totalDescuento);
        } else if (puntajeCredito==3) {
            Double totalDescuento=totalDeuda-(totalDeuda*0.15);
            System.out.print(" Señor usuario usted aplica descuento del 15% su total a pagar es  : " +totalDescuento);
        } else if (puntajeCredito==4) {
            Double totalDescuento=totalDeuda-(totalDeuda*0.1);
            System.out.println(" Señor usuario usted aplica descuento del 10% su total a pagar es  : "+ totalDescuento);
        }else if(puntajeCredito==5 || puntajeCredito==6 || puntajeCredito==7 || puntajeCredito==8 || puntajeCredito==9){
            System.out.print(" Señor usuario usted no aplica para ningun beneficios:");
        }else{
            System.out.print(" sin comentarios:");
        }*/


        //Ejercicio 2

        String nombre;
        String apellido;
        Integer edad;
        Integer cedula;
        String ciudad;
        Integer valorBoleta=450000;
        Integer numeroDeBoletas;

        System.out.println("******bienvenido a su Boleta Online ******");

        System.out.print("Señor usuario por favor digite su nombre completo: ");
        nombre=teclado.nextLine();

        System.out.print("Señor usuario por favor digite sus apallidos completos: ");
        apellido= teclado.nextLine();

        System.out.print("Por favor ingrese su edad:");
        edad=teclado.nextInt();

        System.out.print("Por favor ingrese su numero de cedula:");
        cedula= teclado.nextInt();

        ciudad= teclado.nextLine();
        System.out.print("Por favor ingrese su ciudad: ");
        ciudad= teclado.nextLine();

        System.out.print("digite numero de boletas que deseas comprar:");
        numeroDeBoletas= teclado.nextInt();

        Integer totalPagarBoletas=numeroDeBoletas*valorBoleta;

        if (edad>=18 && numeroDeBoletas<=4){
            System.out.print("Señor usuario gracias por su compra su valor a pagar por la cantidad de boletas es: "+totalPagarBoletas);
        } else{
            System.out.print("Señor usuario usted no comple con los requisitos para el evento");
        }


    }
}