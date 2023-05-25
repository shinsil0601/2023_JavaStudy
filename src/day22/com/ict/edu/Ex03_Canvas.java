package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

//외부 클래스
public class Ex03_Canvas extends Canvas {

	
	@Override
	public void paint(Graphics g) {
		setBackground(Color.DARK_GRAY);
		
		//이미지
		Image image = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
		g.drawImage(image, 10, 230, this);
		g.drawImage(image, 120, 230, 100,100, this);  //100px,100px(크기조절)
		try {
			BufferedImage image2 = ImageIO.read(new File("src/images/java2.png"));
			g.drawImage(image2, 240, 230, 100,100, this);  //100px,100px(크기조절)
			g.drawImage(image2, 350, 230, 100,100, new Color(152,132,0,255), this);  //100px,100px(크기조절)
		} catch (Exception e) {
		}
		Image image3 = new ImageIcon("src/images/java3.png").getImage();                                                                                  
		g.drawImage(image3, 460, 230, 100,100, new Color(0,100,0,50), this);  //100px,100px(크기조절)
	}
}
