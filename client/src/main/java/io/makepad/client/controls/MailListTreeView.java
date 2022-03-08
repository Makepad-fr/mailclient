package io.makepad.client.controls;

import com.sun.source.tree.Tree;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

public class MailListTreeView extends TreeView<String> {
    public MailListTreeView(){
        TreeItem<String> rootItem = new TreeItem<String>("Mail list");

        TreeItem<String> mail1 = new TreeItem<String>("idilsaglam1@hotmail.com");
        mail1.getChildren().add(new TreeItem<String>("Inbox"));
        mail1.getChildren().add(new TreeItem<String>("Drafts"));
        mail1.getChildren().add(new TreeItem<String>("Sent"));
        mail1.getChildren().add(new TreeItem<String>("Deleted"));
        mail1.getChildren().add(new TreeItem<String>("Spam"));
        mail1.getChildren().add(new TreeItem<String>("Archive"));
        rootItem.getChildren().add(mail1);

        TreeItem<String> mail2 = new TreeItem<String>("idil.saglam@makepad.fr");
        mail2.getChildren().add(new TreeItem<String>("Inbox"));
        mail2.getChildren().add(new TreeItem<String>("Drafts"));
        mail2.getChildren().add(new TreeItem<String>("Sent"));
        mail2.getChildren().add(new TreeItem<String>("Deleted"));
        mail2.getChildren().add(new TreeItem<String>("Spam"));
        mail2.getChildren().add(new TreeItem<String>("Archive"));
        rootItem.getChildren().add(mail2);

        TreeItem<String> mail3 = new TreeItem<String>("idil.saglam@etu.u-paris.fr");
        mail3.getChildren().add(new TreeItem<String>("Inbox"));
        mail3.getChildren().add(new TreeItem<String>("Drafts"));
        mail3.getChildren().add(new TreeItem<String>("Sent"));
        mail3.getChildren().add(new TreeItem<String>("Deleted"));
        mail3.getChildren().add(new TreeItem<String>("Spam"));
        mail3.getChildren().add(new TreeItem<String>("Archive"));
        rootItem.getChildren().add(mail3);

        this.setRoot(rootItem);
        this.setShowRoot(false);
    }

}
