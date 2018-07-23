/**
 * 
 */
package parser;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author Jarod
 *
 */
public class Dollar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Document doc = Jsoup.connect("https://dolarhoje.com/").get();
				String title = doc.title();
				System.out.println("Titulo: " + title);
				
				Element dinheiroext = doc.getElementById("estrangeiro");
				Element dinheironac = doc.getElementById("nacional");
				Elements opcional  = doc.getElementsByClass("optional");
				
				
				
				
				System.out.println(opcional.text());
				System.out.println(dinheiroext.attr("value") +" " + dinheironac.attr("value"));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showConfirmDialog(null, "Erro na execução. Verifique a URL do site e tente novamente");
			}
			
	}

}
