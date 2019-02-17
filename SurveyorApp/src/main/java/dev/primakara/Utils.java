package dev.primakara;

import javax.swing.*;
import java.awt.*;

public final class Utils {

    public static void exitApp(Component parentComponent) {
        int confirmStatus = JOptionPane.showConfirmDialog(parentComponent, "Anda yakin ingin keluar?",
                "Confirmation Message", JOptionPane.YES_NO_OPTION);

        if(confirmStatus == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
}
