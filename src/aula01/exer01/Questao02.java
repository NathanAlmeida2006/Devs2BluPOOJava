package aula01.exer01;

public class Questao02 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRaio(10);
        circulo1.exibirInformacoes();

        Circulo circulo2 = new Circulo(5);
        circulo2.exibirInformacoes();

        Circulo circulo3 = new Circulo(0);
        circulo3.exibirInformacoes();
    }

    public static class Circulo {
        private double raio;

        public Circulo() {
        }

        public Circulo(double raio) {
            this.raio = raio;
        }

        public double calcularArea(){
            return Math.PI * Math.pow(raio, 2);
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * raio;
        }

        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
        }

        public void exibirInformacoes() {
            System.out.println("Raio: " + getRaio());
            System.out.println("Área: " + calcularArea());
            System.out.println("Perímetro: " + calcularPerimetro());
            System.out.println();
        }
    }
}
