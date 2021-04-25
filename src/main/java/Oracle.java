public class Oracle implements IDataBase{

    @Override
    public void nombreBaseDeDatos() {
        System.out.println("Conectando a.. "+TipoBaseDato.Oracle);
    }
}
