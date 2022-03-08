package io.makepad.client.panes;

import io.makepad.client.controls.MailListTreeView;
import javafx.scene.layout.VBox;

public class MailListTreePane extends VBox {
    public MailListTreePane(){
        super(new MailListTreeView());
    }
}
