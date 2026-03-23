package properties;


import javafx.application.Application;

import javafx.geometry.Pos;

import javafx.stage.*;

import javafx.scene.control.Button;

import javafx.scene.control.Tooltip;

import javafx.scene.layout.FlowPane;

import javafx.scene.*;

import javafx.scene.paint.Color;





public class button_properties extends Application {




int count=0;

@Override

public void start(Stage stge) {

Button bt=new Button("ENTER");



bt.setTextFill(Color.DARKVIOLET);

bt.setMnemonicParsing(true);

bt.setStyle("-fx-border-color:yellow;");

bt.setOnAction(e->{count++;bt.setText("press: "+count);});// easy way
/*
// *** Using Anonymous Inner Class for button ***



bt.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        count++;
        bt.setText("Press: " + count);
    }
});

 * 
 * 
 * */

/*implement Eventhandler<ActionEvent>;---> library must be imported 
 * 
 * {
 * bt.setAction(this);  
 *  out side the function 
 *   public void  handel(ActionEvent Action){
 *      count++;
        bt.setText("Press: " + count);
 * }
 * 
 * */




//no center due to no geometery libn attach to the button after that will study that 

Tooltip tp = new Tooltip ("go inside page");
bt.setTooltip(tp);

FlowPane fp=new FlowPane();

//fp.setAlignment(Pos.CENTER);

fp.getChildren().add(bt);

//-----------------------------------------------------------------------------

Button b=new Button("BACK ->");

b.setTextFill(Color.DARKVIOLET);

b.setMnemonicParsing(true);

b.setStyle("-fx-border-color:yellow;");

b.setOnAction(e->{count++;b.setText("press: "+count);});

Tooltip tp1 = new Tooltip ("go BACKWORD page");

b.setTooltip(tp1);

//fp.setAlignment(Pos.TOP_LEFT);

fp.getChildren().add(b);


//--------------------------------------------------------

Scene sc=new Scene(fp,400,400);
stge.setScene(sc);
stge.show();

}


public static void main (String []args) {
launch (args);

}

}