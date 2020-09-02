package life.qbic.cli;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Entry point for the html2pdf application.
 *
 * The purpose of this class is to act as a bridge between the command line and the <i>real</i> implementation of a tool by using a {@link ToolExecutor}.
 */
public class QbicEntryPoint {

    private static final Logger LOG = LogManager.getLogger(QbicEntryPoint.class);

    /**
     * Main method.
     *
     * @param args the command-line arguments.
     */
    public static void main(final String[] args) {
        LOG.debug("Starting Qbic tool");
        final ToolExecutor executor = new ToolExecutor();
        executor.invoke(QbicTool.class, QbicCommand.class, args);
    }
}
