import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GeneraHTML {

    private String head = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>Ejemplo COMPOSITE</title>\n" +
            "</head>";
    private String body = "<body>\n" +
            "    <h1>PATRON COMPOSITE</h1>\n" +
            "    <p>Grupo Comeron-Moine.</p>\n" +
            "    <img src=\"img/composite.png\" alt=\"Explicacion del patron\">\n"+"<br>";
    private String footer = "</html>";
    private String html="";
    private FileWriter escribe;
    private BufferedWriter bufferEscritura;
    public GeneraHTML(String listas) {
        body+= "\n"+listas+"\n"+
                "</body>";
        html = head + "\n" + body + "\n" + footer;
            try {
                escribe = new FileWriter("output.html");
                bufferEscritura = new BufferedWriter(escribe);
                bufferEscritura.write(html);
                bufferEscritura.close();
                System.out.println("Archivo creado con éxito.");
            } catch (IOException e) {
                System.err.println("Error leyendo o escribiendo archivo.");
            }

}
}
