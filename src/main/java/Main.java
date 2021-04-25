import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        IDataBase dataBase =null;
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Random rnd = new Random();
        Integer var =0;
        for (;;) {
            var = rnd.nextInt(4);
            Thread.sleep(5000);

            switch (var) {
                case 0:
                    dataBase = concreteFactory.factoryDataBase(TipoBaseDato.MongoDB);
                    break;
                case 1:
                    dataBase = concreteFactory.factoryDataBase(TipoBaseDato.MySQL);
                    break;
                case 2:
                    dataBase = concreteFactory.factoryDataBase(TipoBaseDato.Oracle);
                    break;
                default:
                    System.out.println("No hay solicitud");
                    break;
            }
            dataBase.nombreBaseDeDatos();
        }
    }
}
