/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import static jdk.nashorn.internal.objects.NativeRegExp.test;

public class Example {

    public Example() throws BadLocationException {

        JFrame frame = new JFrame();
        DefaultStyledDocument document = new DefaultStyledDocument();
        JTextPane pane = new JTextPane(document);
        JPanel mainPanel = new JPanel();
        JButton button = new JButton("Button");
        button.setPreferredSize(new Dimension(100, 40));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setPreferredSize(new Dimension(200, 200));
        mainPanel.add(button);
        frame.getContentPane().add(pane, BorderLayout.CENTER);
        frame.getContentPane().add(mainPanel, BorderLayout.WEST);
        StyleContext context = new StyleContext();
        // build a style
        Style style = context.addStyle("test", null);
        // set some style properties
        StyleConstants.setForeground(style, Color.BLACK);
        document.insertString(0, "Four: success \n", style);
        StyleConstants.setForeground(style, Color.RED);
        document.insertString(0, "Three: error \n", style);
        document.insertString(0, "Two: error \n", style);

        StyleConstants.setForeground(style, Color.BLACK);
        // add some data to the document
        document.insertString(0, "One: success \n", style);

        //  StyleConstants.setForeground(style, Color.blue);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) throws BadLocationException {
        new Example();
    }

//    JFrame frame = new JFrame();
//    JTextPane pane = new JTextPane();
//    JButton button = new JButton("Button");
//
//    public Example() {
//
//        addColoredText(pane, "Red Text\n", Color.RED);
//        addColoredText(pane, "Blue Text\n", Color.BLUE);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pane.setPreferredSize(new Dimension(200, 200));
//        frame.getContentPane().add(pane, BorderLayout.CENTER);
//        frame.getContentPane().add(button, BorderLayout.WEST);
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Example();
//    }
//
//    public void addColoredText(JTextPane pane, String text, Color color) {
//        StyledDocument doc = pane.getStyledDocument();
//
//        Style style = pane.addStyle("Color Style", null);
//        StyleConstants.setForeground(style, color);
//        try {
//            doc.insertString(doc.getLength(), text, style);
//        } catch (BadLocationException e) {
//            e.printStackTrace();
//        }
//    }
}
