package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Main app window.
 * Created by shako on 6/3/2017.
 */
public class MainWindow extends JFrame {

    public MainWindow() {

        setDefaultLookAndFeelDecorated(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 650);

        // setContentPane(new Map());
        add(new Map());
        
        setVisible(true);
    }

    /**
     * Main table for represent the model of data.
     */
    class Map extends JTable {

        private int mapSz = 30;
        private int cellSz = 15;

        public Map() {

            // Ширина и высота таблицы.
            setModel(new DefaultTableModel(mapSz, mapSz));

            // Высота ячейки
            setRowHeight(cellSz);

            // Перебор ячеек для задания ширины.
            for(int i = 0; i < mapSz; i++) {
                // getColumnModel().getColumn(i).setWidth(cellSz);
                getColumnModel().getColumn(i).setMinWidth(cellSz);
                getColumnModel().getColumn(i).setMaxWidth(cellSz);
            }
        }
    }

    /**
     *
     */
    class Panel01 extends JPanel {
        // TO-DO
    }

    /**
     *
     */
    class Panel02 extends JPanel {
        // TO-DO
    }

    /**
     *
     */
    class Panel3 extends JPanel {
        // TO-DO
    }

    /**
     *
     */
    class Panel04 extends JPanel {
        // TO-DO
    }
}
