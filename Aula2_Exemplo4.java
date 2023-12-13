/*Aula2 Exemplo 4 - Isaac 21404 */
package aula2_java;
import java.util.Scanner;
public class Aula2_Exemplo4 {
public static void main(String[] args){
double num1, num2;
int op;

Scanner ObjS = new Scanner(System.in);

System.out.print("Digite um número: ");
num1 = ObjS.nextDouble();

System.out.print("Digite outro número: ");
num2 = ObjS.nextDouble();

System.out.println("Digite: \n 1 para soma \n 2 para subtração \n 3 para multiplicação \n 4 para divisão");
op = ObjS.nextInt();
switch (op){
    case 1:
         System.out.println(num1 + "+" + num2 + "=" +(num1 + num2));
    break;
    case 2:
         System.out.println(num1 + "-" + num2 + "=" +(num1 - num2));
    break;
    case 3:
         System.out.println(num1 + "*" + num2 + "=" +(num1 * num2));
    break;
    case 4:
         System.out.println(num1 + "/" + num2 + "=" +(num1 / num2));
         break;
    default:
        System.out.println("Digite de 1 a 4");
}

}//Fim    
}//Não excluir
