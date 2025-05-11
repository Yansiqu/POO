public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        animal.emitirSom();    
        gato.emitirSom();      
        cachorro.emitirSom();  
    }
}
