import control.TiendaFecher;
import views.Dashboard;


public class Main {
public static void main(String[] args) {

 
    try {
        Dashboard dashboard = new Dashboard();

        //consulta
        String urlApi = "https://jsonplaceholder.typicode.com/posts/99";
        String respuesta = TiendaFecher.obtenerProductos(urlApi);
        System.out.println("Respuest de la Api");

        //Dashboard dashboard = new Dashboard(respuesta);

        for (int i = 0; i < respuesta.length(); i++) {
          
                System.out.print(respuesta.charAt(i));
            
        }


    } catch (Exception e) {
        // TODO: handle exception
    }

}
}