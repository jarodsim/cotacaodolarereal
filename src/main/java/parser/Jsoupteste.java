/**
 * 
 */
package parser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author Jarod
 *
 */
public class Jsoupteste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 
				
				try {
					Document doc = Jsoup.connect("https://www.tecmundo.com.br/").get();
					
					String title = doc.title();
					System.out.println("Titulo: " + title);
					
					Elements links = doc.select("a[href]");
					
					for(Element link : links) {
						System.out.println("\n Links :"  + link.attr("href"));
						System.out.println("Texto :" + link.text());
						
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
