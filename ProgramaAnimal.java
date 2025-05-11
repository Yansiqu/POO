public class ProgramaAnimal {

    // Classe base Animal
    public static class Animal {
        String nome;

        public void emitirSom() {
            System.out.println("O animal faz um som.");
        }
    }

    // Classe derivada Gato
    public static class Gato extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("O gato mia: Miau!");
        }
    }

    // Classe derivada Cachorro
    public static class Cachorro extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("O cachorro late: Au au!");
        }
    }

    // Método principal
    public static void main(String[] args) {
        Animal a = new Animal();
        Gato g = new Gato();
        Cachorro c = new Cachorro();

        a.emitirSom();     // O animal faz um som.
        g.emitirSom();     // O gato mia: Miau!
        c.emitirSom();     // O cachorro late: Au au!
    }
}
