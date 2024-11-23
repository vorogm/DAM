//package crearpdf;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;

public class CrearPDF{
	public void añadirTexto() throws Exception{
	
		Document document = new Document();

		String parrafo = "Nombre: Voro Garcia \n Fecha: 16-11-2024 ";

		String OpinionNano = "\n Opinión sobre NANO: \n Nano dentro de lo que cabe es bastante sencillo y fácil de entender.";

		String OpinionVi = "\n Opinión sobre VI: \n Vi es más complicado. A la mínima que pulsas una tecla mal o te equivocas y quieres retroceder, es un lío. Otras veces pulsas las felchas de dirección y empieza a poner letras sin querer o hace otras cosas. Supongo que es cuestión de practica, pero lo encuentro bastante engorroso.";

		PdfWriter.getInstance(document, new FileOutputStream("calificaciones_SGM.pdf"));
		document.open();
		parrafo = parrafo + "\n" + OpinionNano + "\n" + OpinionVi + "\n\n Disculpa, pero he pensado que sería más interesante dar mi opinión sobre vi y Nano que inventar unas notas. Gracias.";
		document.add(new Paragraph(parrafo));
		document.close();
	}
	public static void main(String args[]){
		try{
			CrearPDF p = new CrearPDF();
			p.añadirTexto();
		}catch(Exception e){
		System.out.println(e);
		}
	}
}