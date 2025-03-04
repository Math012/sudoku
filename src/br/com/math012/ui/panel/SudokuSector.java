package br.com.math012.ui.panel;

import br.com.math012.ui.input.NumberText;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.List;
import static java.awt.Color.black;

public class SudokuSector extends JPanel {
    public SudokuSector(List<NumberText> textFields){
        var dimension = new Dimension(170, 170);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setBorder(new LineBorder(black, 2, true));
        this.setVisible(true);
        textFields.forEach(this::add);
    }
}
