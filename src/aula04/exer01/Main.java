package aula04.exer01;

public class Main {
    public static void main(String[] args) {
        Ingresso normal = new Normal(100.0, 0.0, "Setor A");
        Ingresso vip = new VIP(100.0, 50.0, "Setor VIP");
        Ingresso camaroteInferior = new CamaroteInferior(100.0, 30.0, "Camarote Inferior");
        Ingresso camaroteSuperior = new CamaroteSuperior(100.0, 40.0, "Camarote Superior");

        System.out.println("=== Ingresso Normal ===");
        normal.imprimeValor();
        normal.imprimeTipo();
        normal.valorTotal();
        normal.mostrarDados();

        System.out.println("\n=== Ingresso VIP ===");
        vip.imprimeValor();
        vip.imprimeTipo();
        vip.valorTotal();
        vip.mostrarDados();

        System.out.println("\n=== Camarote Inferior ===");
        camaroteInferior.imprimeValor();
        camaroteInferior.imprimeTipo();
        camaroteInferior.valorTotal();
        camaroteInferior.mostrarDados();

        System.out.println("\n=== Camarote Superior ===");
        camaroteSuperior.imprimeValor();
        camaroteSuperior.imprimeTipo();
        camaroteSuperior.valorTotal();
        camaroteSuperior.mostrarDados();
    }
}
