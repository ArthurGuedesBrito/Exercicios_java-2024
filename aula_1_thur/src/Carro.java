public class Carro {
    String marca;
    String modelo;
    String cor;
    String placa;
    int ano;
    boolean ligado = false;

    void ligar() {
        if (ligado == false) {
            ligado = true;
            System.out.println("O carro foi ligado!");
        } else {
            System.out.println("O carro já estava ligado!");
        }
    }

    void desligar() {
        if (ligado == true) {
            ligado = false;
            System.out.println("O carro foi desligado!");
        } else {
            System.out.println("O carro já estava desligado!");
        }
    }

    void drift() {
        if (ligado == true) {
            System.out.println("Vruuuuuuuuum, psipsipsipsipsi!");
        } else {
            System.out.println("O carro está desligado!");
        }
    }

    void acelerar() {
        if (ligado == true) {
            System.out.println("Vruuuum!");
        } else {
            System.out.println("O carro está desligado!");
        }
    }

    void passar_macha() {
        if (ligado == true) {
            System.out.println("Macha Passada!");
        } else{
            System.out.println("O carro está desligado!");
        }


    }
}
