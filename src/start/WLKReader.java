/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import data.DailyWeatherData;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JList;
import org.joda.time.DateTime;
import reader.WlkReader;

/**
 *
 * @author JMAR
 */
public class WLKReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        WlkReader wlkReader = new WlkReader(new File("D:\\WeatherLink\\STATIONS\\TEST\\niel"), new DateTime(2012, 2, 5, 14, 0), new DateTime(2012, 7, 23, 16, 30), true);
        List<DailyWeatherData> dailyWeatherDataList = wlkReader.readData();
        
        
        JFrame f = new JFrame("Test");
        f.add(new JList(dailyWeatherDataList.toArray()));
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
                
    }
    
}
