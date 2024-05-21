public class Lapis {
    public int tamanho;
    public String ponta;
    public String cor;
    public String marca;
    private boolean escrevendo;
    private boolean pintando;
    private boolean desenhando;

    public Lapis(int tamanho, String ponta, String cor, String marca) {
        setTamanho(tamanho);
        setPonta(ponta);
        setCor(cor);
        setMarca(marca);
        setEscrevendo(false);
        setPintando(false);
        setDesenhando(false);

    }

    public void imprimir(){
        System.out.println("Meu lápis tem " + tamanho+ "cm" +"," + " uma ponta " + ponta+ ", com a cor " + cor+ ", e da marca " + marca);
    }

    public void escrever() {
        if (escrevendo == false) {
            setEscrevendo(true);
            System.out.println("Escrevendo!");
        } else {
            System.out.println("O lápis já está sendo usado!");
        }
    }

    public void parar(){
        if (escrevendo == true) {
            escrevendo = false;
            System.out.println("Parando de escrever");
        } else {
            System.out.println("O lápis não está sendo usado!");
        }
    }

    public void pintar(){
        if (pintando == false) {
            pintando = true;
            System.out.println("Pintando!");
        } else {
            System.out.println("O lápis já está sendo usado para pintar!");
        }
    }

    public void parando(){
        if (pintando == true) {
            pintando = false;
            System.out.println("Parando de pintar");
        } else {
            System.out.println("O lápis não está sendo usado para pintar!");
        }
    }

    public void desenhar(){
        if (desenhando == false) {
            desenhando = true;
            System.out.println("Desenhando!");
        } else {
            System.out.println("O lápis já está sendo usado para desenhar!");
        }
    }

    public void stop(){
        if (desenhando == true) {
            desenhando = false;
            System.out.println("Parando de desenhar");
        } else {
            System.out.println("O lápis não está sendo usado para desenhar!");
        }


    }

    public void setTamanho(int  tamanho){
        this.tamanho = tamanho;
    }
    public int getTamanho(){
        return this.tamanho;
    }

    public void setPonta(String ponta){
        this.ponta = ponta;
    }
    public String getPonta(){
        return this.ponta;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setEscrevendo(boolean escrevendo){
        this.escrevendo = escrevendo;
    }
    public boolean getEscrevendo(){
        return this.escrevendo;
    }

    public void setPintando(boolean pintando){
        this.pintando = pintando;
    }
    public boolean getPintando(){
        return this.pintando;
    }

    public void setDesenhando(boolean desenhando){
        this.desenhando = desenhando;
    }
    public boolean getDesenhando(){
        return this.desenhando;
    }

}
