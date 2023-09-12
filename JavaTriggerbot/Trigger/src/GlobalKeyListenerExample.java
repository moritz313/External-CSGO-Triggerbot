
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class GlobalKeyListenerExample implements NativeKeyListener {
	
	static  JButton ColorPreview = new JButton("Color");
	
	public void nativeKeyPressed(NativeKeyEvent e) {				
		
		if (e.getKeyCode() == NativeKeyEvent.VC_SPACE) {
			
	            		
        }
	}
	
	
	boolean open = false;
	boolean firsttime = true;
	Menu frame2 = new Menu();
	
	

	public void nativeKeyReleased(NativeKeyEvent e) {
		
        
        
        if(NativeKeyEvent.getKeyText(e.getKeyCode()) == "I") {
        	if(firsttime) {
    			frame2.setBackground(new Color(0, 250, 0, 240));
    			frame2.setAlwaysOnTop(true);      
    			try {
					frame2.setIconImage(Toolkit.getDefaultToolkit().getImage(new URL("https://i.imgur.com/aRNJytN.png")));
				} catch (MalformedURLException e1) {
					
				}
    			
        	}
			if(open) {
				open = false;
				frame2.setVisible(false);	
				System.out.println("Menu Closed");
			} else {
				open = true;
				
				
				frame2.setVisible(true);
				System.out.println("Menu Opened");
				System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
			}
		}
		
		
		if(NativeKeyEvent.getKeyText(e.getKeyCode()) == "O") {
			System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
			 System.out.println("Exit");
			System.exit(1);
		}
		
		if(NativeKeyEvent.getKeyText(e.getKeyCode()) == "X") {
			System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
			new Thread(() -> {
				
				int i = 1;				
				Dimension size = Toolkit.getDefaultToolkit().getScreenSize();		        		       
		        int width = (int)size.getWidth();		        		   
		        int height = (int)size.getHeight();
		        
		        System.out.println("Current Screen resolution : " + "width : " + width + " height : " + height);		        
		        int X = width / 2 + 5;
		        int Y = height / 2 + 5;				
				 try {
					 Robot robot = new Robot();					 					
					 TimeUnit.MILLISECONDS.sleep(200);
					 Color color = robot.getPixelColor(X, Y);
					 ColorPreview.setBackground(new java.awt.Color(color.getRed(),color.getGreen(),color.getBlue()));
//						System.out.println("Red   = " + color.getRed());
//						System.out.println("Green = " + color.getGreen());
//						System.out.println("Blue  = " + color.getBlue());
						
						
						for(i = 1; i > 0; i++) {
							Color color2 = robot.getPixelColor(X, Y);
							if(Math.abs(color2.getRed() - color.getRed()) >= 20 || Math.abs(color2.getGreen() - color.getGreen()) >= 20 || Math.abs(color2.getBlue() - color.getBlue()) >= 20) {
								System.out.println("Shoot! ");
								robot.mousePress(16);
								robot.mouseRelease(16);
								
							
								System.out.println("Red   = " + (color2.getRed() - color.getRed()));
								System.out.println("Green = " + (color2.getGreen() -color.getGreen()));
								System.out.println("Blue  = " + (color2.getBlue() - color.getBlue()));
								i = -1;
							}

						
							
							}
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}).start();
		}
		
		
		
		if(NativeKeyEvent.getKeyText(e.getKeyCode()) == "U") {
			System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
			new Thread(() -> {
				
				int i = 1;				
				Dimension size = Toolkit.getDefaultToolkit().getScreenSize();		        		       
		        int width = (int)size.getWidth();		        		   
		        int height = (int)size.getHeight();
		        
		        System.out.println("Current Screen resolution : " + "width : " + width + " height : " + height);		        
		        int X = width / 2 + 7;
		        int Y = 5;				
				 try {
					 Robot robot = new Robot();					 					
					 TimeUnit.MILLISECONDS.sleep(200);
					 Color color = new Color(112, 20, 25);
					 
						
						
						for(i = 1; i > 0; i++) {
							Color color2 = robot.getPixelColor(X, Y);
							if(color2.getRed() >= 100 && color2.getGreen() < 100 && color2.getBlue() < 100) {
								System.out.println("Timer Start");
								
								TimerStart();
								
							
								System.out.println("Red   = " + (color2.getRed()));
								System.out.println("Green = " + (color2.getGreen()));
								System.out.println("Blue  = " + (color2.getBlue()));
								i = -1;
							}

						
							
							}
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}).start();
		}
	}
	
	
	public static void TimerStart() {
		new Thread(() -> {
			ColorPreview.setBackground(Color.decode("#ed7615"));
			ColorPreview.setForeground(Color.decode("#1a1a1a"));
			for (int i = 40; i >= 0; i--) {
				ColorPreview.setText("" + i);
	            System.out.println(i);
	            try {
	                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		}).start();
	}

	public void nativeKeyTyped(NativeKeyEvent e) {
		//System.out.println("Key Typed: " + e.getKeyText(e.getKeyCode()));
	}

	public static void main(String[] args) {
		System.out.println("Starting..");
		
		//Overlay. Note: Works only in Borderlesswindow mode!
		JFrame frame = new JFrame("Trigger HUD");
        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setAlwaysOnTop(true);      
        frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", false);              
        frame.getContentPane().setLayout(new java.awt.BorderLayout());
        frame.getContentPane().add(ColorPreview, java.awt.BorderLayout.NORTH);
        
        
        
        
        try {
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(new URL("https://i.imgur.com/qkXvGpd.png")));
		} catch (MalformedURLException e) {
			
		}
        frame.setVisible(true);
        frame.pack();
		
		try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		GlobalScreen.addNativeKeyListener(new GlobalKeyListenerExample());
		
		
		

	}
}
