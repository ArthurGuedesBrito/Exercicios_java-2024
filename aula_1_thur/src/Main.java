//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*int num = 17;
        double num2 = 10.8;
        String nome = "Arthur";

        System.out.println("Bem Vindo, "+nome+"!");

        if (num > 10){
            System.out.println("Maior que 10!");
        }
        else {
            System.out.println("Menor que 10!");
        }

        for(int i = 0; i<10; i++){
            System.out.println(i);
        }*/

        Carro carro_1 = new Carro();
        carro_1.marca = "Fiat";
        carro_1.modelo = "Uno";
        carro_1.cor = "Preto";
        carro_1.placa = "RIM-1E2";
        carro_1.ano = 2015;

        /*System.out.println("O carro da marca "+carro_1.marca+" e modelo "+carro_1.modelo+","+" é do ano de "+carro_1.ano+" e possuí a placa "+carro_1.placa);}*/
        carro_1.ligar();
        //carro_1.desligar();
        carro_1.acelerar();
        carro_1.drift();
    }
}