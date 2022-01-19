package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PlayMusic extends JFrame{
	
	public PlayMusic(String title) {
		super(title); 
		setLayout(new FlowLayout()); 
		JButton sendBtn=new JButton("PLAY");
		JButton updateBtn=new JButton("STOP");
		
		add(sendBtn);
		add(updateBtn);
		
		sendBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(PlayMusic.this, "음악을 재생합니다.");
			}
		});
	
		updateBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(PlayMusic.this, "일시정지합니다.");
		});
	}
	
	public static void main(String[] args) {
		PlayMusic f=new PlayMusic("음악감상");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

