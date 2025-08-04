package SeleniumPOMFramework;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 * The `FileUploadOSDialogue` class provides functionality to simulate a file upload
 * by interacting with the operating system's file upload dialog using the `Robot` class.
 */
public class FileUploadOSDialogue {

    /**
     * Simulates a file upload by copying the file path to the clipboard
     * and pasting it into the OS file upload dialog.
     *
     * Steps:
     * 1. Copies the provided file path to the system clipboard.
     * 2. Simulates keyboard actions to paste the file path and press Enter.
     *
     * @param filePath The absolute path of the file to be uploaded.
     * @throws AWTException If the platform configuration does not allow low-level input control.
     */
    public void upload(String filePath) throws AWTException {
        // Create a Robot instance to simulate keyboard and mouse actions
        Robot robot = new Robot();

        // Copy the file path to the system clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Simulate pressing Ctrl+V to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        // Simulate pressing Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}