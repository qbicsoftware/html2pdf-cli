package life.qbic.cli

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

import java.nio.file.Path

/**
 * <class short description - 1 Line!>
 * 
 * <More detailed description - When to use, what it solves, etc.>
 *
 * @author Sven Fillinger
 * @since <version tag>
 */
class HtmlToPdfConversion {

  private final static String PROJECT__ID

  private final Document html

  HtmlToPdfConversion(String html) {
    this.html = Jsoup.parse(html)
  }

  public void manipulateDom() {
    html.getElementById()
  }

  public void saveHtmlToFile(Path path) {
    // Save html to file
  }

  public static void convertToPdf(URI html, URI fileOutput) {
    new File(fileOutput).withOutputStream {
      def builder = new PdfRendererBuilder()
      builder.useFastMode().withUri(html.toString())
      builder.toStream(it).run()
    }
  }



}
