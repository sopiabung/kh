package _18;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingFileIO extends JFrame implements ActionListener{
	Container cp;
	JButton btnSvae, btnLoad;
	JTextArea ta;

	public SwingFileIO(String title) {
		super(title);
		cp=this.getContentPane(); //프레임위의 기본패널
		this.setBounds(100,100,100,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDesign();
		this.setVisible(true);
	}

	private void setDesign() {
		JPanel pTop=new JPanel();
		btnSave=new JButton("save file");
		btnLoad=new JButton("load file");
		pTop.add(btnSvae);
		pTop.add(btnLoad);
		this.add("North",pTop);

		ta=new JTextArea();
		JScrollPane sp=new JScrollPane(ta);
		this.add("Center",sp);
		btnSave.addAction
		btnLoad.addActionListner



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==btnSvae) {
			FileDialog fd = new FileDialog(this, "saving file", FileDialog.SAVE);
			fd.setVisible(true);
			String filename = fd.getDirectory()+fd.getFile();
			if(fd.getFile()==null) {
				return;
			}
			FileWriter fw = null;
			try {
				fw=new FileWriter(filename);
				fw=write(ta.getText());
				ta.setText("save");
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();			}
		}
	} else if(ob==btnLoad) {
		FileDialog dlg = new FileDialog(this, "open file", FileDialog.LOAD);
		dlg.setVisible(true);
		String filename = dlg.getDirectory()



				while(true) {
					String line = "";
					try {
						line=br.readLine();

					} catch ( Exception e) {
						e.printStackTrace();
					}
					if(line==null)
						break;
					ta.append(line+"\n");
				}
		try {
			br.close();
			fr.close();
		} catch (Exception e2) {
			e2.printStackTrace();	}

	}

	public static void main(String[] args) {
		new SwingFileIO("파일 입풀력");
	}
}
}


