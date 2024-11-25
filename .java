import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

while (true) {
System.out.println("Escolha a conversão:");
System.out.println("1. Binário para Decimal");
System.out.println("2. Decimal para Binário");
System.out.println("3. Binário para Octal");
System.out.println("4. Octal para Binário");
System.out.println("5. Decimal para Octal");
System.out.println("6. Octal para Decimal");
System.out.println("7. Hexadecimal para Decimal");
System.out.println("8. Decimal para Hexadecimal");
System.out.println("9. Binário para Hexadecimal");
System.out.println("10. Hexadecimal para Binário");
System.out.println("0. Sair");
System.out.print("Opção: ");
int opcao = ler.nextInt();
ler.nextLine(); // Limpar o buffer

if (opcao == 0) {
break;
}

switch (opcao) {
case 1: // Binário para Decimal
System.out.print("Digite um número binário: ");
String binario = ler.nextLine();
int decimalFromBinario = Integer.parseInt(binario, 2);
System.out.println("Decimal: " + decimalFromBinario);
break;

case 2: // Decimal para Binário
System.out.print("Digite um número decimal: ");
int numeroDecimal = ler.nextInt();
String binarioFromDecimal = Integer.toBinaryString(numeroDecimal);
System.out.println("Binário: " + binarioFromDecimal);
break;

case 3: // Binário para Octal
System.out.print("Digite um número binário: ");
binario = ler.nextLine();
decimalFromBinario = Integer.parseInt(binario, 2);
String octalFromBinario = Integer.toOctalString(decimalFromBinario);
System.out.println("Octal: " + octalFromBinario);
break;

case 4: // Octal para Binário
System.out.print("Digite um número octal: ");
String octal = ler.nextLine();
int decimalFromOctal = Integer.parseInt(octal, 8);
String binarioFromOctal = Integer.toBinaryString(decimalFromOctal);
System.out.println("Binário: " + binarioFromOctal);
break;

case 5: // Decimal para Octal
System.out.print("Digite um número decimal: ");
numeroDecimal = ler.nextInt();
String octalFromDecimal = Integer.toOctalString(numeroDecimal);
System.out.println("Octal: " + octalFromDecimal);
break;

case 6: // Octal para Decimal
System.out.print("Digite um número octal: ");
octal = ler.nextLine();
decimalFromOctal = Integer.parseInt(octal, 8);
System.out.println("Decimal: " + decimalFromOctal);
break;

case 7: // Hexadecimal para Decimal
System.out.print("Digite um número hexadecimal: ");
String hexadecimal = ler.nextLine();
int decimalFromHexadecimal = Integer.parseInt(hexadecimal, 16);
System.out.println("Decimal: " + decimalFromHexadecimal);
break;

case 8: // Decimal para Hexadecimal
System.out.print("Digite um número decimal: ");
numeroDecimal = ler.nextInt();
String hexadecimalFromDecimal = Integer.toHexString(numeroDecimal).toUpperCase();
System.out.println("Hexadecimal: " + hexadecimalFromDecimal);
break;

case 9: // Binário para Hexadecimal
System.out.print("Digite um número binário: ");
binario = ler.nextLine();
decimalFromBinario = Integer.parseInt(binario, 2);
String hexadecimalFromBinario = Integer.toHexString(decimalFromBinario).toUpperCase();
System.out.println("Hexadecimal: " + hexadecimalFromBinario);
break;

case 10: // Hexadecimal para Binário
System.out.print("Digite um número hexadecimal: ");
hexadecimal = ler.nextLine();
decimalFromHexadecimal = Integer.parseInt(hexadecimal, 16);
String binarioFromHexadecimal = Integer.toBinaryString(decimalFromHexadecimal);
System.out.println("Binário: " + binarioFromHexadecimal);
break;

default:
System.out.println("Opção inválida.");
}
System.out.println();
}
ler.close();
}
}