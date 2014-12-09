package com.yy.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * Desc:开始界面,程序的起点
 *
 * @author Sapphire
 *
 * @Since 创建时间:2014年12月7日 下午10:03:51
 */
public class StartFrame extends JFrame {

	private static final long serialVersionUID = -8921185454921189650L;

	public StartFrame() {

		initUI();
	}

	/**
	 * 初始化界面
	 */
	private void initUI() {
		// TODO sapphire 构造界面
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("网页图片自动下载");

		add(getNorth(), BorderLayout.NORTH);
		add(getWest(), BorderLayout.WEST);
		add(getCenter(), BorderLayout.CENTER);
		add(getSouth(), BorderLayout.SOUTH);
	}

	private JPanel getNorth() {
		JPanel north = new JPanel();
		north.setBackground(Color.RED);

		return north;
	}

	private JPanel getWest() {
		JPanel west = new JPanel();
		west.setBackground(Color.BLUE);

		return west;
	}

	private JPanel getCenter() {
		JPanel center = new JPanel();
		center.setBackground(Color.YELLOW);

		return center;
	}

	private JPanel getSouth() {
		JPanel south = new JPanel();
		south.setBackground(Color.GREEN);

		return south;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				StartFrame frame = new StartFrame();
				frame.setVisible(true);
			}
		});
	}

}
