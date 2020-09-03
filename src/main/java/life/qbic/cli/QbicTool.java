package life.qbic.cli;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.IOUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 * Implementation of html2pdf. Its command-line arguments are contained in instances of {@link QbicCommand}.
 */
public class QbicTool extends QBiCTool<QbicCommand> {

    private static final Logger LOG = LogManager.getLogger(QbicTool.class);

    /**
     * Constructor.
     *
     * @param command an object that represents the parsed command-line arguments.
     */
    public QbicTool(final QbicCommand command) {
        super(command);
    }

    @Override
    public void execute() {
        // get the parsed command-line arguments
        final QbicCommand command = super.getCommand();

        InputStream inputStream = QbicTool.class.getClassLoader().getResourceAsStream("template/htmltest.html");
        //creating an InputStreamReader object
        InputStreamReader isReader = new InputStreamReader(inputStream);
        //Creating a BufferedReader object
        BufferedReader reader = new BufferedReader(isReader);
        StringBuffer sb = new StringBuffer();
        String str = "";

        try{
            while((str = reader.readLine())!= null){
                sb.append(str);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        HtmlToPdfConversion toPdfConversion = new HtmlToPdfConversion(sb.toString());
        //manipulate
        toPdfConversion.manipulateDom();

    }

    // TODO: override the shutdown() method if you are implementing a daemon and want to take advantage of a shutdown hook for clean-up tasks
}
