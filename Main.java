import control.TiendaFecher;
import views.Dashboard;


public class Main {
public static void main(String[] args) {

    String saludo = "Hola Mundo";
    System.out.println(saludo.charAt(0));

    for (int i = 0; i < saludo.length(); i++) {
        System.out.println(saludo.charAt(i));
    }
 
    try {
        Dashboard dashboard = new Dashboard();

        //consulta
        String urlApi = "https://jsonplaceholder.typicode.com/posts";
        String respuesta = TiendaFecher.obtenerProductos(urlApi);
        System.out.println("Respuest de la Api");

        //Dashboard dashboard = new Dashboard(respuesta);

        for (int i = 0; i < respuesta.length(); i++) {
            String letra ="" + respuesta.charAt(i);

            if (letra.equalsIgnoreCase("}")) {
                System.out.println(respuesta.charAt(i));
            }
        }


    } catch (Exception e) {
        // TODO: handle exception
    }

}
}