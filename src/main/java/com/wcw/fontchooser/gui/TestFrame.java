package com.wcw.fontchooser.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.wcw.jazzirc.gui.MainView;

public class TestFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new FontChooserPanel());
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	private static class FontChooserPanel extends JPanel {
		

		private JList<String> fontStyleList;
		private JList<String> getFontStyle() {
			if (fontStyleList == null) {
				fontStyleList = new JList<>(new String[] {"Plain", "Italic", "Bold", "Bold Italic"});
			}
			return fontStyleList;
		}
		private JList<String> fontSizeList;
		private JList<String> getFontSizeList() {
			if (fontSizeList == null) {
				fontSizeList = new JList<>(
						"6,7,8,9,10,11,12,14,16,18,20,22,24,26,28,36,48,72".split(","));
			}
			return fontSizeList;
		}
		public FontChooserPanel() {
			super(new BorderLayout());
			add(new FontPanel(), BorderLayout.CENTER);
			//add(getFontList());
			//add(getFontStyle());
			//add(getFontSizeList());
		}

	}
	 private static class FontPanel extends JPanel {
		public FontPanel() {
			super(new FlowLayout());
			add(new FontSelectionPanel());
		}
	}
	private static class FontSelectionPanel extends JPanel {
		private JLabel fontListLabel;
		private JLabel getFontListLabel() {
			if (fontListLabel == null) {
				fontListLabel = new JLabel("Font: ");
			}
			return fontListLabel;
		}
		private JList<String> fontList;
		
		private JTextField fontListTextField;
		private JTextField getFontListTextField() {
			if (fontListTextField == null) {
				fontListTextField = new JTextField();
			}
			return fontListTextField;
		}
		private JList<String> getFontList() {
			if (fontList == null) {
				fontList = new JList<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
				//fontList.setPreferredSize(new Dimension(500, 800));
			}
			return fontList;
		}
		
		private JScrollPane fontListScrollPanel;
		
		private JScrollPane getFontListScrollPanel() {
			if (fontListScrollPanel == null) {
				fontListScrollPanel = new JScrollPane(getFontList());
				//fontListScrollPanel.setPreferredSize(new Dimension(500, 800));
			}
			return fontListScrollPanel;
		}
		
		private JPanel fontAndLabelPanel;
		
		private JPanel getFontAndLabelPanel() {
			if (fontAndLabelPanel == null) {
				fontAndLabelPanel = new JPanel(new BorderLayout());
				fontAndLabelPanel.add(getFontListLabel(), BorderLayout.WEST);
				fontAndLabelPanel.add(getFontListTextField(), BorderLayout.CENTER);
			}
			return fontAndLabelPanel;
		}
		public FontSelectionPanel() {
			super();
			setLayout(new BorderLayout());
			add(getFontAndLabelPanel(), BorderLayout.NORTH);
			add(getFontListScrollPanel(), BorderLayout.CENTER);
		}
	}
}
