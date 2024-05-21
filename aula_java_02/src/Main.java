//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lapis lapis1 = new Lapis(8,"Fina","Preto","Faber Castell");
        //lapis1.setTamanho(8);
        //lapis1.setPonta("Fina");
        //lapis1.setCor("Preto");
        //lapis1.setMarca("Faber Castell");

        lapis1.imprimir();


    //System.out.println("O lapis 1 tem "+lapis1.tamanho+"cm"+", uma ponta "+lapis1.ponta+" com a cor "+lapis1.cor+" e da marca "+lapis1.marca);

        Lapis lapis2 = new Lapis(7,"Fina","Branco","Cis");
        //lapis2.setTamanho(7);
        //lapis2.setPonta("Fina");
        //lapis2.setCor("Branco");
        //lapis2.setMarca("Cis");
        lapis2.imprimir();
        //System.out.println("O lapis 2 tem "+lapis2.tamanho+"cm"+", uma ponta "+lapis2.ponta+" com a cor "+lapis2.cor+" e da marca "+lapis2.marca);
        Lapis lapis3 = new Lapis(6,"Fina","Rosa","Tris");
        //lapis3.setTamanho(6);
        //lapis3.setPonta("Fina");
        //lapis3.setCor("Rosa");
        //lapis3.setMarca("Tris");
        lapis3.imprimir();
        //System.out.println("O lapis 3 tem "+lapis3.tamanho+"cm"+", uma ponta "+lapis3.ponta+" com a cor "+lapis3.cor+" e da marca "+lapis3.marca);

        lapis1.setEscrevendo(true);
        lapis1.setPintando(true);
        lapis1.setDesenhando(true);

        /*System.out.println(lapis1.getTamanho());
        System.out.println(lapis1.getPonta());
        System.out.println(lapis1.getCor());
        System.out.println(lapis1.getMarca());

        System.out.println(lapis2.getTamanho());
        System.out.println(lapis2.getPonta());
        System.out.println(lapis2.getCor());
        System.out.println(lapis2.getMarca());

        System.out.println(lapis3.getTamanho());
        System.out.println(lapis3.getPonta());
        System.out.println(lapis3.getCor());
        System.out.println(lapis3.getMarca());*/




    }
}