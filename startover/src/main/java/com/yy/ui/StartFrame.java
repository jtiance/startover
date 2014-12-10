package com.yy.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.yy.ui.utils.GBC;

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
	// IP
	private JTextField addressText;
	// URI
	private JTextField uriText;
	// 是否为BBS站点
	private JCheckBox bbsCheckBox;
	// 升序
	private JRadioButton up;
	// 降序
	private JRadioButton down;
	// 正则表达式的标签
	private JLabel regexpLabel;
	// 正则表达式
	private JTextField regexpText;

	public StartFrame() {

		initUI();
		initEvent();
	}

	/**
	 * 初始化界面
	 */
	private void initUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("网页图片自动下载");

		add(getNorth(), BorderLayout.NORTH);
		add(getWest(), BorderLayout.WEST);
		add(getCenter(), BorderLayout.CENTER);
		add(getEast(), BorderLayout.EAST);
		add(getSouth(), BorderLayout.SOUTH);
	}

	/**
	 * 初始化事件
	 */
	private void initEvent() {
		setComponentEnabled(false);

		bbsCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox checkBox = (JCheckBox) e.getSource();
				setComponentEnabled(checkBox.isSelected());
			}

		});
	}

	private void setComponentEnabled(boolean flag) {
		up.setEnabled(flag);
		down.setEnabled(flag);
		regexpLabel.setEnabled(flag);
		regexpText.setEnabled(flag);
	}

	/**
	 * 
	 * @param gridx
	 * @param gridy
	 * @param gridwidth
	 * @param gridheight
	 * @param weightx
	 * @param weighty
	 * 
	 * @return
	 */
	private static GBC newGBC(int gridx, int gridy, int gridwidth,
			int gridheight, double weightx, double weighty, int fill,
			int anchor, int inset1, int inset2, int inset3, int inset4,
			int ipadx, int ipady) {
		GBC gbc = new GBC(gridx, gridy);
		gbc.setSpan(gridwidth, gridheight);
		gbc.setWeight(weightx, weighty);
		gbc.setFill(fill);
		gbc.setInsets(inset1, inset2, inset3, inset4);
		gbc.setIpad(ipadx, ipady);

		return gbc;
	}

	private JPanel getNorth() {
		JPanel north = new JPanel();

		north.setLayout(new GridLayout(3, 1));

		JPanel line1 = new JPanel();
		line1.setLayout(new GridBagLayout());

		north.add(line1);
		{
			line1.add(
					new JLabel("网址:"),
					newGBC(1, 1, 1, 1, 0, 0, GBC.HORIZONTAL, GBC.CENTER, 5, 10,
							2, 2, 10, 0));
			addressText = new JTextField();
			line1.add(
					addressText,
					newGBC(2, 1, 1, 1, 90, 0, GBC.HORIZONTAL, GBC.CENTER, 5, 2,
							2, 5, 0, 0));
			line1.add(
					new JLabel("URI:"),
					newGBC(3, 1, 1, 1, 0, 0, GBC.HORIZONTAL, GBC.EAST, 5, 5, 2,
							2, 10, 0));
			uriText = new JTextField();
			line1.add(
					uriText,
					newGBC(4, 1, 1, 1, 90, 0, GBC.HORIZONTAL, GBC.CENTER, 5, 2,
							2, 5, 0, 0));
		}

		JPanel line2 = new JPanel();
		line2.setLayout(new GridBagLayout());
		north.add(line2);
		{
			bbsCheckBox = new JCheckBox("是否为BBS站点");
			line2.add(
					bbsCheckBox,
					newGBC(1, 1, 1, 1, 0, 0, GBC.NONE, GBC.WEST, 2, 5, 2, 5, 0,
							0));
			line2.add(
					new JLabel(),
					newGBC(2, 1, 1, 1, 100, 0, GBC.HORIZONTAL, GBC.CENTER, 2,
							5, 2, 5, 0, 0));

		}
		{
			JPanel line3 = new JPanel();
			line3.setLayout(new GridBagLayout());
			north.add(line3);
			ButtonGroup group = new ButtonGroup();
			up = new JRadioButton("索引递增");
			up.setSelected(true);
			down = new JRadioButton("索引递减");
			group.add(up);
			group.add(down);
			line3.add(
					up,
					newGBC(1, 1, 1, 1, 0, 0, GBC.NONE, GBC.WEST, 2, 5, 5, 2, 0,
							0));
			line3.add(
					down,
					newGBC(2, 1, 1, 1, 5, 0, GBC.NONE, GBC.WEST, 2, 2, 5, 5,
							20, 0));
			line3.add(
					regexpLabel = new JLabel("子链接正则表达式:"),
					newGBC(3, 1, 1, 1, 0, 0, GBC.NONE, GBC.CENTER, 2, 2, 5, 5,
							0, 0));
			regexpText = new JTextField();
			line3.add(
					regexpText,
					newGBC(4, 1, 1, 1, 50, 0, GBC.HORIZONTAL, GBC.CENTER, 2, 5,
							5, 5, 0, 0));
			line3.add(
					new JLabel(),
					newGBC(5, 1, 4, 1, 75, 0, GBC.HORIZONTAL, GBC.CENTER, 2, 5,
							5, 5, 0, 0));
		}

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

	private JPanel getEast() {
		JPanel center = new JPanel();
		center.setBackground(Color.RED);

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
