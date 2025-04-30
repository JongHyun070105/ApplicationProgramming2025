package Day0429;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AudioEventEx extends JFrame {
    Clip clip;
    String song = "audio/애국가1절.wav";
    JLabel label = new JLabel(song);
    public AudioEventEx(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();

        cp.setLayout(new FlowLayout());
        cp.add(label);
        cp.setBackground(Color.YELLOW);

        setSize(500,500);
        setVisible(true);
        loadAudio(song);
    }

    void loadAudio(String song) {
        try{
            File soundFile = new File(song);
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if(event.getType() == LineEvent.Type.START){
                        getContentPane().setBackground(Color.GREEN);
                        label.setText("Start");
                    } else if (event.getType() == LineEvent.Type.STOP) {
                        getContentPane().setBackground(Color.RED);
                        label.setText("END");
                        clip.close();
                        try{
                            ais.close();
                        } catch (IOException e1){
                            e1.printStackTrace();
                        }
                    }
                }
            });
            clip.open(ais);
            clip.start();
        }catch (LineUnavailableException e){
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new AudioEventEx();
    }
}
