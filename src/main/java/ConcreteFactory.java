public class ConcreteFactory extends AbstractFactory{
    @Override
    public IDataBase factoryDataBase(TipoBaseDato dataBase) {

        switch (dataBase){
            case Oracle:
                return new Oracle();
            case MySQL:
                return new MySQL();
            case MongoDB:
                return new MongoDB();
            default:
                System.out.println("Dato de válido");
                break;
        }
        return null;
    }
}
