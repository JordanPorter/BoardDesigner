import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class BoardDesigner extends JPanel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/** Variables to Hold the size of the screen **/
	public final int SCREEN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	public final int SCREEN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	
	/** Variables to hold the screen objects for the application **/
	private JFrame frame;
	private BorderLayout layout;
	private JPanel editor;
	
	private JMenuBar menu;
	
	private JMenu file;
	private JMenuItem newBoard;

	
	
	/**
	 * Constructs a new BoardDesigner with a new frame
	 */
	public BoardDesigner()	{
		initialize();
	}
	
	public static void main(String[] args)	{
		new BoardDesigner();
	}
	
	/**
	 * Initialize() sets up the main frame for the application.
	 * It sets the size for the program and adds any buttons
	 * to the frame that are required.
	 * 
	 * Use this function to add buttons to the inital screen.
	 */
	public void initialize()	{
		frame = new JFrame();
		frame.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		layout = new BorderLayout();
		frame.setLayout(layout);
		
		editor = new JPanel();

		menu = new JMenuBar();

		
		file = new JMenu("File");
		
		newBoard = new JMenuItem("New Board");
		newBoard.addActionListener(new ActionListener()	{

			public void actionPerformed(ActionEvent arg0) {
			}
			
		});
		file.add(newBoard);
		
		menu.add(file);
		
		frame.setJMenuBar(menu);
	}
	
	public void paintComponent(Graphics g)	{
		Graphics2D g2d = (Graphics2D)g;
		g2d.fillRect(100, 100, 50, 50);
	}
	
	/**
	 * getFrame() returns the frame for the application. Use
	 * this to get a referance to the frame for adding buttons,
	 * menus, etc.
	 * 
	 * @return frame of the application
	 */
	public JFrame getFrame()	{
		return frame;
	}
}
