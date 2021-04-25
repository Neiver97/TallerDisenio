public class MongoDB implements IDataBase{
    @Override
    public void nombreBaseDeDatos() {
        System.out.println("Conectando a.. "+TipoBaseDato.MongoDB);
    }
}
