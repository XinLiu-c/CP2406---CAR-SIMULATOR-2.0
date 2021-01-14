import java.awt.*;

public class Sedan extends Car{
    Sedan(Road road){
        super(road);
        width = 30;
        height = 12;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(xPos, yPos, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(yPos, xPos, height, width);
    }
}