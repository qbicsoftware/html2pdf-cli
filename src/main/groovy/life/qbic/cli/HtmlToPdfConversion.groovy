package life.qbic.cli

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

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
  private final String outputPath = "/Users/jenniferboedker/IdeaProjects/html2pdf-cli/manipulated.html"
  private final String outputPathPDF = "/Users/jenniferboedker/IdeaProjects/html2pdf-cli/manipulated.pdf"


  HtmlToPdfConversion(String html) {
    this.html = Jsoup.parse(html)
  }

  public void manipulateDom() {
    println "before "+ html.getElementById("header")
    html.getElementById("header").html("this is the new text")
    println "after " + html.getElementById("header")

    saveHtmlToFile(outputPath)
    convertToPdf(outputPath,outputPathPDF)
  }

  public void saveHtmlToFile(String path) {
    // Save html to file
    File out = new File(path)
    String content = html.toString()
    out.write(content)
  }

  public static void convertToPdf(String html, String fileOutput) {
    new File(fileOutput).withOutputStream {
      def builder = new PdfRendererBuilder()
      builder.useFastMode().withUri("file:///Users/jenniferboedker/IdeaProjects/html2pdf-cli/manipulated.html")
      builder.toStream(it).run()
    }
  }



}
