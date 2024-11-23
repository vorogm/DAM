//package crearpdf;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;

public class Codigo{
	public void añadirTexto() throws Exception{
	
		Document document = new Document();

		String parrafo = " \n //package crearpdf; " +
"\n import com.itextpdf.text.Document; " +
"\n import com.itextpdf.text.pdf.PdfWriter; " +
"\n import com.itextpdf.text.Paragraph; " +
"\n import java.io.FileOutputStream; " +
"\n  " +
"\n public class CrearPDF{ " +
"\n 	public void añadirTexto() throws Exception{ " +
"\n 	 " +
"\n 		Document document = new Document(); " +
"\n  " +
"\n 		String parrafo = \"Nombre: Voro Garcia \n Fecha: 16-11-2024 \"; " +
"\n  " +
"\n 		String OpinionNano = \"\n Opinión sobre NANO: \n Nano dentro de lo que cabe es bastante sencillo y fácil de entender.\"; " +
"\n  " +
"\n		String OpinionVi = \"\n Opinión sobre VI: \n Vi es más complicado. A la mínima que pulsas una tecla mal o te equivocas y quieres retroceder, es un lío. Otras veces pulsas las felchas de dirección y empieza a poner letras sin querer o hace otras cosas. Supongo que es cuestión de practica, pero lo encuentro bastante engorroso.\"; " +
"\n  " +
"\n 		PdfWriter.getInstance(document, new FileOutputStream(\"Opiniones.pdf\")); " +
"\n 		document.open(); " +
"\n 		parrafo = parrafo + \"\n\" + OpinionNano + \"\n\" + OpinionVi; " +
"\n 		document.add(new Paragraph(parrafo)); " +
"\n 		document.close(); " +
"\n 	} " +
"\n 	public static void main(String args[]){ " +
"\n 		try{ " +
"\n 			CrearPDF p = new CrearPDF(); " +
"\n 			p.añadirTexto(); " +
"\n 		}catch(Exception e){ " +
"\n 		System.out.println(e); " +
"\n 		} " +
"\n 	} " +
"\n } ";

		PdfWriter.getInstance(document, new FileOutputStream("CodigoFuente.pdf"));
		document.open();
		parrafo = parrafo;
		document.add(new Paragraph(parrafo));
		document.close();
	}
	public static void main(String args[]){
		try{
			Codigo p = new Codigo();
			p.añadirTexto();
		}catch(Exception e){
		System.out.println(e);
		}
	}
}