package life.qbic.cli

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.parser.Parser

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

  private final Document html

  private final Path manipulatedHtmlFile

  private final Path manipulatedPdfFile

  private final Path fileDir

  HtmlToPdfConversion(File html) {
    this.html = Parser.xmlParser().parseInput(html.text, "")
    this.fileDir = html.toPath().getParent()
    this.manipulatedHtmlFile =  this.fileDir.resolve(createUniqueFileName("html"))
    this.manipulatedPdfFile = this.fileDir.resolve(createUniqueFileName("pdf"))
  }

  private static String createUniqueFileName(String fileExtension) {
    def uuid = UUID.randomUUID().toString()
    return "manipulated-${uuid}.${fileExtension}"
  }

  void manipulateDom() {
    html.getElementById("header").html("This is some manipulated ")
    saveHtmlToFile()
  }

  private void saveHtmlToFile() {
    // Save html to file
    File out = new File(manipulatedHtmlFile.toUri())
    out.write(html.toString())
  }

  void convertToPdf() {
    new File(manipulatedPdfFile.toUri()).withOutputStream {
      def builder = new PdfRendererBuilder()
      builder.useFastMode().withUri(manipulatedHtmlFile.toUri().toString())
      builder.toStream(it).run()
    }
  }



}
