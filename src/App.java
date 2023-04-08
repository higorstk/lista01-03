import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável
  
double numero1;
double numero2;  
  double resultado;
  
//Passo2:Entrada de dados
  
Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o primeiro numero");
numero1 = teclado.nextDouble();
  System.out.println("Digite o segundo numero");
  numero2 = teclado.nextDouble();
  resultado = numero1 + numero2;
  
//Passo3:Mostrar resultado
  
System.out.println("Soma dos dois" +resultado);
 }
}
