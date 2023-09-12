import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Menu extends JFrame {
    private JButton button1, button2, button3, header1;
    private JSlider slider1, slider2;

    public Menu() {
        setUndecorated(true);
        
        setShape(new RoundRectangle2D.Double(0, 0, 400, 300, 30, 30)); // Rounded corners
        
        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(Color.decode("#171d2b"));

        button1 = new JButton("Bomb Timer: ON");
        button2 = new JButton("Bhop: ON");
        button3 = new JButton("Triggerbot: ON");
        
        header1 = new JButton("REFLEX V2");

        slider1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider2 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        Border customBorder = BorderFactory.createLineBorder(Color.decode("#ed7615"), 2);
        Border customBorder1 = BorderFactory.createLineBorder(Color.decode("#1a1a1a"), 2);
        Color primColor = Color.decode("#ed7615");
        Color secColor = Color.decode("#1a1a1a");
        
        button1.setBackground(secColor);
        button1.setForeground(primColor);
        button1.setBorder(customBorder1);
        button2.setBackground(secColor);
        button2.setForeground(primColor);
        button2.setBorder(customBorder1);
        button3.setBackground(secColor);
        button3.setForeground(primColor);
        button3.setBorder(customBorder1);
        
        header1.setBackground(secColor);
        header1.setForeground(primColor);
        header1.setBorder(customBorder1);
        
        slider1.setMajorTickSpacing(20);
        slider1.setMinorTickSpacing(5);
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(false);
        slider1.setPaintTrack(true);
        slider1.setBackground(Color.decode("#1a1a1a"));
        slider1.setBorder(customBorder);
        slider1.setSnapToTicks(true);
       
        

        slider2.setMajorTickSpacing(20);
        slider2.setMinorTickSpacing(5);
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(false);
        slider2.setPaintTrack(true);
        slider2.setBorder(customBorder);
        slider2.setSnapToTicks(true);
        slider2.setBackground(Color.decode("#1a1a1a"));
        
        
        
        
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.setBackground(Color.decode("#1a1a1a"));
        
        JPanel headerPanel = new JPanel();
        headerPanel.add(header1);
        headerPanel.setBackground(Color.decode("#1a1a1a"));
        
        JPanel sliderPanel = new JPanel();
        sliderPanel.setLayout(new GridLayout(2, 1));
        sliderPanel.add(slider1);
        sliderPanel.add(slider2);
        
        contentPanel.add(headerPanel, BorderLayout.NORTH);
        contentPanel.add(buttonPanel, BorderLayout.CENTER);       
        contentPanel.add(sliderPanel, BorderLayout.SOUTH);

        add(contentPanel);
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button1 click event
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button2 click event
            }
        });

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider1.getValue();
                // Handle slider1 value change event
            }
        });

        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider2.getValue();
                // Handle slider2 value change event
            }
        });
        
        setBackground(Color.decode("#171d2b"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 130);
        setLocationRelativeTo(null);
    }

  
}
