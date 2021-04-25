public class MySQL implements IDataBase{
    @Override
    public void nombreBaseDeDatos() {
        System.out.println("Conectando a.. "+TipoBaseDato.MySQL);
    }
}
