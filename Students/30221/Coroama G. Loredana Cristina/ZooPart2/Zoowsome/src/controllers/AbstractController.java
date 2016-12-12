package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ZooFrame;
import views.utilities.FrameStack;
public class AbstractController {
protected ZooFrame frame;
public AbstractController(ZooFrame frame, boolean hasBackButton) {
this.frame = frame;
if (hasBackButton)
frame.setBackButtonActionListener(new BackButtonListener());
}
private class BackButtonListener implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
FrameStack.getInstance().pop();
}
}

}