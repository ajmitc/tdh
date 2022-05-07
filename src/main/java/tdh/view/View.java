package tdh.view;

import tdh.Model;

import javax.swing.*;
import java.awt.*;

public class View {
    private Model model;
    private JFrame frame;

    public View(Model model){
        this.model = model;
        this.frame = new JFrame();

        this.frame.setTitle("This Didn't Happen");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    public Model getModel(){ return this.model; }
    public JFrame getFrame(){ return this.frame; }
}
