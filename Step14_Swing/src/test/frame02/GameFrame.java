package test.frame02;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


	public class GameFrame extends JFrame implements ActionListener{
	//String type 을 인자로 전발 받은 생성자
	public GameFrame(String title) {
		super(title);
		//레이아웃 법칙 지정하기
		setLayout(new FlowLayout());
		//버튼을 만들어서
		JButton runBtn=new JButton("Game Start");
		//버튼을 프레임에 추가하기
		add(runBtn);
		
		runBtn.addActionListener(this);
		
	}
	
	public static void main(String[] args){
	
	GameFrame f=new GameFrame("게임설치");
	f.setBounds(100, 100, 500, 300);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this,"게임을 실행합니다");
		
	}
}
