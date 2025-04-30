package Day0429;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class AudioEx extends JFrame {
    JButton btn[] = {new JButton("Play"), new JButton("Stop"), new JButton("Again")};
    Clip clip;
    public AudioEx(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        MyActionListener1 ml = new MyActionListener1();
        for(int i =0; i < btn.length;i++){
            cp.add(btn[i]);
            btn[i].addActionListener(ml);
        }

        setSize(500,500);
        setVisible(true);
        loadAudio("audio/애국가1절.wav");
    }

    void loadAudio(String fillname) {
        try{
            clip = AudioSystem.getClip();
            File file = new File(fillname);
            AudioInputStream ais = AudioSystem.getAudioInputStream(file);
            clip.open(ais);
        } catch (LineUnavailableException e){
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    class MyActionListener1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()){
                case "Play" : clip.start(); break;
                case "Stop" : clip.stop(); break;
                case "Again" :
                    clip.setFramePosition(0);
                    clip.start(); break;
            }
        }
    }

    public static void main(String[] args) {
        new AudioEx();
    }
}
