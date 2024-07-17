import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Snegovik extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        sneg(g);
    }

    private void sneg(Graphics a) {
        Graphics2D g = (Graphics2D) a;
        g.setStroke(new BasicStroke(6f)); //толщина линии
        this.setBackground(Color.WHITE);

        Ellipse2D bolKrug = new Ellipse2D.Double(306, 528, 370, 335);
        Ellipse2D sredKrug = new Ellipse2D.Double(348, 356, 286, 249);
        Ellipse2D malKrug = new Ellipse2D.Double(397, 211, 189, 171);
        Ellipse2D poleSliapi = new Ellipse2D.Double(379, 202, 229, 40);
        RoundRectangle2D cilindr=new RoundRectangle2D.Double(429,106,134,101,28,28);
        Line2D line=new Line2D.Double(429,177,563,177);
        GeneralPath leftHend=new GeneralPath();
        leftHend.moveTo(620,459);
        leftHend.lineTo(797,402);
        leftHend.lineTo(833,433);
        leftHend.lineTo(842,423);
        leftHend.lineTo(813,398);
        leftHend.lineTo(865,387);
        leftHend.lineTo(862,370);
        leftHend.lineTo(811,381);
        leftHend.lineTo(831,342);
        leftHend.lineTo(819,336);
        leftHend.lineTo(792,382);
        leftHend.lineTo(615,440);
        leftHend.closePath();

        GeneralPath rightHend=new GeneralPath();
        rightHend.moveTo(376,454);
        rightHend.lineTo(218,402);
        rightHend.lineTo(179,431);
        rightHend.lineTo(170,423);
        rightHend.lineTo(198,397);
        rightHend.lineTo(149,386);
        rightHend.lineTo(152,372);
        rightHend.lineTo(202,381);
        rightHend.lineTo(181,341);
        rightHend.lineTo(192,334);
        rightHend.lineTo(219,381);
        rightHend.lineTo(381,435);
        rightHend.closePath();

        Ellipse2D pug1=new Ellipse2D.Double(511,437,14,14);
        Ellipse2D pug2=new Ellipse2D.Double(511,477,14,14);
        Ellipse2D pug3=new Ellipse2D.Double(511,516,14,14);

        Ellipse2D rot1=new Ellipse2D.Double(467,329,14,14);
        Ellipse2D rot2=new Ellipse2D.Double(491,338,14,14);
        Ellipse2D rot3=new Ellipse2D.Double(519,338,14,14);
        Ellipse2D rot4=new Ellipse2D.Double(543,328,14,14);

        Ellipse2D glaz1=new Ellipse2D.Double(481,265,18,18);
        Ellipse2D glaz2=new Ellipse2D.Double(532,264,18,18);

        GeneralPath nos=new GeneralPath();
        nos.moveTo(514,320);
        nos.lineTo(624,296);
        nos.lineTo(510,297);
        nos.closePath();

        g.setColor(Color.WHITE);
        g.fill(bolKrug);
        g.setColor(Color.black);
        g.draw(bolKrug);

        g.draw(leftHend);

        g.setColor(Color.WHITE);
        g.fill(sredKrug);
        g.setColor(Color.black);
        g.draw(sredKrug);

        g.setColor(Color.WHITE);
        g.fill(rightHend);
        g.setColor(Color.black);
        g.draw(rightHend);

        g.setColor(Color.WHITE);
        g.fill(malKrug);
        g.setColor(Color.black);
        g.draw(malKrug);

        g.setColor(Color.WHITE);    //Поле шляпы
        g.fill(poleSliapi);
        g.setColor(Color.black);
        g.draw(poleSliapi);

        g.setColor(Color.WHITE);
        g.fill(cilindr);
        g.setColor(Color.black);
        g.draw(cilindr);

        g.draw(line);

        g.setStroke(new BasicStroke(3f)); //толщина линии

        g.draw(pug1);
        g.draw(pug2);
        g.draw(pug3);

        g.draw(rot1);
        g.draw(rot2);
        g.draw(rot3);
        g.draw(rot4);

        g.draw(glaz1);
        g.draw(glaz2);

        g.setColor(Color.WHITE);
        g.fill(nos);
        g.setColor(Color.black);
        g.draw(nos);
    }
}
