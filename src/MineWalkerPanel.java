import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MineWalkerPanel extends JPanel {

	
	private final int MAX_LIVES = 5;
	double maxPoints;
	private int livesPerMine = -1;
	private int pointsPerMine = -5;
	private int pointsPerStep = -1;
	
	int lives;
	int score;
	
	
	MineFieldPanel mineFieldPanel;
	
	
	JPanel scorePanel;
	JLabel scoreLabel;
	JPanel keyPanel;
	JPanel controlPanel;
	JButton showMines;
	JLabel winText;
	
	public MineWalkerPanel() {
		newGame();
		}
	
	
	private class resetButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			newGame();
			
		}
	}


	
	private class showMinesListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			mineFieldPanel.showMines();
			
		}
	}



	public void addMineFieldPanel() {
		mineFieldPanel = new MineFieldPanel();
		this.add(mineFieldPanel);
	}
	
	

	public void addScorePanel() {
		scorePanel = new JPanel();
		scoreLabel = new JLabel();
		scoreLabel.setText("678656578");
		scorePanel.add(scoreLabel);
		this.add(scorePanel);
	}
	
	public void addKeyPanel() {
		keyPanel = new JPanel();
		JButton zeroMines = new JButton();
		zeroMines.setBackground(Color.GREEN);
		zeroMines.setText("0 mines nearby");
		zeroMines.setSize(20, 20);
		keyPanel.add(zeroMines);
		this.add(keyPanel);
    }
	
	public void addControlPanel() {
		controlPanel = new JPanel();
		
		JButton resetBut = new JButton();
		resetBut.setText("Reset");
		resetBut.addActionListener(new resetButtonListener());
		showMines = new JButton();
		showMines.setText("show Mines");
		
		controlPanel.add(resetBut);
		this.add(controlPanel);
				
	}
	
	public void newGame() {
		this.removeAll();
		// Basic setup process
		addMineFieldPanel();
		addScorePanel();
		addKeyPanel();
		addControlPanel();
		setMaxPoints();
		
		this.revalidate();
	}
	
	public void giveUp() {
		System.out.println("Abel is a quitter");
		
	}
	
	public void win() {
		this.remove(scorePanel);
		winText = new JLabel();
		winText.setText("Abel is Gay");
		this.add(winText);
		this.revalidate();
	}
	
	private void setMaxPoints() {
		
		int gridSize = mineFieldPanel.getGridSize();
		maxPoints = Math.pow(gridSize, 2) - mineFieldPanel.getNumberOfMines();
	}
	
	public void lose() {
		
	}
	
	public void GameOver() {
		
	}
	
	public void resetScore() {
		
	}
	
	boolean isGameOver() {
		return true;
	}
	
	public void addPoints(int AmountOfPoints) {
		
	}
	
	public void addLives(int AmountOfLives) {
		
	}
	
	int getGridSizeInput() {
		return 1;
	}
	
	
	private class MineFieldButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MineFieldButton clicked = (MineFieldButton) e.getSource();
			
			clicked.visit();
		}
	}
	
	private class ShowMinesListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
}