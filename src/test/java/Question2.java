import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Question2 {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
//        System.out.println(MouseInfo.getPointerInfo().getLocation());
        int x = 1895;
        int y = 15;
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
//        System.out.println(MouseInfo.getPointerInfo().getLocation());
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(800,471);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }
}
