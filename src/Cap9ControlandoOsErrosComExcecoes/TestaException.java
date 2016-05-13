package Cap9ControlandoOsErrosComExcecoes;

public class TestaException {
    public static void main(String[] args) {
        //new java.io.FileReader("arquivo.txt");
    }
}

// 1. Add throws declaration, que vai gerar: passa o erro para quem o chama
//public class TestaException {
//    public static void main(String[] args) throws FileNotFoundException {
//        new java.io.FileReader("arquivo.txt");
//    }
//}

// 2. Surround with try/catch, que vai gerar: trata a excessão no local
//public class TestaException2 {
//    public static void main(String[] args) {
//        try {
//            new java.io.FileReader("arquivo.txt");
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//}
