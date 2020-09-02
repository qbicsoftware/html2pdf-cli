package life.qbic.cli;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

        // TODO: do something useful with the obtained command.
        //

    }

    // TODO: override the shutdown() method if you are implementing a daemon and want to take advantage of a shutdown hook for clean-up tasks
}
