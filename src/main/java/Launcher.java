public class Launcher {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.inicializar();
    }

    public void inicializar() {
        GestorPersonal gestorPersonal = new GestorPersonal();
        gestorPersonal.agregarPersonas("juan","brun",2);
        gestorPersonal.obtenerPersonaNombre("juan");
    }
}