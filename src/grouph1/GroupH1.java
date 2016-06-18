/* Group
 * Todd Derrick & David Hutchinson & Max Perrigo
 */
package grouph1;

import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.text.Font.font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

/**
 *
 * @author todd
 */
public class GroupH1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        GridPane frame = new GridPane();
        frame.setAlignment(Pos.CENTER);
        frame.setHgap(2);
        frame.setVgap(2);
        
        ImageView Tokyo = new ImageView(new Image(getClass().getResourceAsStream("bat.jpg"), 350, 300, false, true));
        ImageView Utah=new ImageView(new Image(getClass().getResourceAsStream("reaper.jpeg"), 350, 300, false, true));
        ImageView lightsaber=new ImageView(new Image(getClass().getResourceAsStream("super.jpg"), 350, 300, false, true));
        
        Text text = new Text("Copyright \u00a9 Google Image");
        text.setId("align");
        text.setFont(font("sans-serif", FontWeight.BOLD, FontPosture.ITALIC, 20));
        //fill in the text so we can see it
        text.setFill(Color.WHITE);
        // aligns the text to the bottom
        GridPane.setHalignment(text, HPos.CENTER);
        GridPane.setValignment(text, VPos.BOTTOM);        
        
        frame.add(Tokyo, 0, 0);
        frame.add(Utah, 1, 0);
        frame.add(lightsaber,0,2);
        frame.add(text,1,0);
        
        Scene scene = new Scene(frame);
        
        primaryStage.setResizable(false);
        primaryStage.setTitle("Exercise");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    
    
    
    public static void main(String[] args) {
        launch(args);
        
    }
}
    

