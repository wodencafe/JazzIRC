package com.wcw.fontchooser.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import com.wcw.jazzirc.gui.MainView;

public class TestFrame {
	public static void main(String[] args) {
		/*JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(new FontMainPanel());
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);*/
		
	}

	/*private static class SouthPanel extends JPanel {
		public SouthPanel() {
			super()
		}
	}*/
	public static void showFontSelectionDialog(Font existingFont) {
		JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}
	private static class FontMainPanel extends JPanel {
		private FontButtonPanel fontButtonPanel;
		private FontButtonPanel getFontButtonPanel() {
			if (fontButtonPanel == null) {
				fontButtonPanel = new FontButtonPanel();
			}
			return fontButtonPanel;
		}
		private FontChooserPanel fontChooserPanel;
		private FontChooserPanel getFontChooserPanel() {
			if (fontChooserPanel == null) {
				fontChooserPanel = new FontChooserPanel();
			}
			return fontChooserPanel;
		}
		public FontMainPanel() {
			setLayout(new BorderLayout());
			add(getFontChooserPanel(), BorderLayout.CENTER);
			add(getFontButtonPanel(), BorderLayout.SOUTH);
		}
	}
	private static class FontButtonPanel extends JPanel {
		private JButton okButton;
		private JButton cancelButton;
		
		private JButton getOkButton() {
			if (okButton == null) {
				okButton = new JButton("OK");
			}
			return okButton;
		}
		private JButton getCancelButton() {
			if (cancelButton == null) {
				cancelButton = new JButton("Cancel");
			}
			return cancelButton;
		}
		public FontButtonPanel() {
			setLayout(new FlowLayout(FlowLayout.RIGHT));
			add(getOkButton());
			add(getCancelButton());
		}
	}
	private static class FontChooserPanel extends JPanel {

		public FontChooserPanel() {
			super(new BorderLayout());
			add(new FontPanel(), BorderLayout.CENTER);
			add(new FontEffectsAndSamplePanel(), BorderLayout.SOUTH);
			// add(getFontStyle());
			// add(getFontSizeList());
		}

	}

	private static class FontEffectsAndSamplePanel extends JPanel {
		public FontEffectsAndSamplePanel() {
			super(new GridLayout(1, 2));
			add(new FontEffectsPanel());
			add(new FontSamplePanel());
		}
	}

	private static class FontSamplePanel extends JPanel {

		private JLabel sampleLabel;

		private JLabel getSampleLabel() {
			if (sampleLabel == null) {
				sampleLabel = new JLabel("Sample");
			}
			return sampleLabel;
		}
		
		private JLabel sampleOutputLabel;
		
		private JLabel getSampleOutputLabel() {
			if (sampleOutputLabel == null) {
				sampleOutputLabel = new JLabel("AaBbYyZz");
			}
			return sampleOutputLabel;
		}
		private JPanel sampleOutputPanel;
		private JPanel getSampleOutputPanel() {
			if (sampleOutputPanel == null) {
				sampleOutputPanel = new JPanel();
				sampleOutputPanel.add(getSampleOutputLabel());

				sampleOutputPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
			}
			return sampleOutputPanel;
		}
		public FontSamplePanel() {
			setLayout(new BorderLayout());
			add(getSampleLabel(), BorderLayout.NORTH);
			add(getSampleOutputPanel(), BorderLayout.CENTER);

			setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		}
	}

	private static class FontEffectsPanel extends JPanel {
		private JCheckBox strikeoutCheckBox;

		private JCheckBox underlineCheckbox;

		private JLabel effectsLabel;

		private JCheckBox getStrikeoutCheckBox() {
			if (strikeoutCheckBox == null) {
				strikeoutCheckBox = new JCheckBox("Strikeout");
			}
			return strikeoutCheckBox;
		}

		private JCheckBox getUnderlineCheckBox() {
			if (underlineCheckbox == null) {
				underlineCheckbox = new JCheckBox("Underline");
			}
			return underlineCheckbox;
		}

		private JLabel getEffectsLabel() {
			if (effectsLabel == null) {
				effectsLabel = new JLabel("Effects");
			}
			return effectsLabel;
		}

		public FontEffectsPanel() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			add(getEffectsLabel());
			add(getStrikeoutCheckBox());
			add(getUnderlineCheckBox());
			setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		}
	}

	private static class FontPanel extends JPanel {
		public FontPanel() {
			super(new GridLayout(1, 3));
			add(new FontSelectionPanel());
			add(new FontStyleSelectionPanel());
			add(new FontSizeSelectionPanel());
		}
	}

	private static class FontSizeSelectionPanel extends JPanel {

		private JList<String> fontSizeList;

		private JList<String> getFontSizeList() {
			if (fontSizeList == null) {
				fontSizeList = new JList<>("6,7,8,9,10,11,12,14,16,18,20,22,24,26,28,36,48,72".split(","));
			}
			return fontSizeList;
		}

		private JLabel fontSizeLabel;

		private JLabel getFontSizeLabel() {
			if (fontSizeLabel == null) {
				fontSizeLabel = new JLabel("Font Size: ");
			}
			return fontSizeLabel;
		}

		private JScrollPane fontSizeScrollPanel;

		private JScrollPane getFontSizeListScrollPanel() {
			if (fontSizeScrollPanel == null) {
				fontSizeScrollPanel = new JScrollPane(getFontSizeList());
				// fontListScrollPanel.setPreferredSize(new Dimension(500, 800));
			}
			return fontSizeScrollPanel;
		}

		private JPanel fontSizeAndLabelPanel;

		private JPanel getFontSizeAndLabelPanel() {
			if (fontSizeAndLabelPanel == null) {
				fontSizeAndLabelPanel = new JPanel(new BorderLayout());
				fontSizeAndLabelPanel.add(getFontSizeLabel(), BorderLayout.NORTH);
				fontSizeAndLabelPanel.add(getFontSizeTextField(), BorderLayout.CENTER);
			}
			return fontSizeAndLabelPanel;
		}

		private JTextField fontSizeTextField;

		private JTextField getFontSizeTextField() {
			if (fontSizeTextField == null) {
				fontSizeTextField = new JTextField();
			}
			return fontSizeTextField;
		}

		public FontSizeSelectionPanel() {
			super();
			setLayout(new BorderLayout());
			add(getFontSizeAndLabelPanel(), BorderLayout.NORTH);
			add(getFontSizeListScrollPanel(), BorderLayout.CENTER);
		}
	}

	private static class FontStyleSelectionPanel extends JPanel {
		private JLabel fontStyleLabel;

		private JLabel getFontStyleLabel() {
			if (fontStyleLabel == null) {
				fontStyleLabel = new JLabel("Font Style: ");
			}
			return fontStyleLabel;
		}

		private JScrollPane fontListScrollPanel;

		private JScrollPane getFontStyleListScrollPanel() {
			if (fontListScrollPanel == null) {
				fontListScrollPanel = new JScrollPane(getFontStyle());
				// fontListScrollPanel.setPreferredSize(new Dimension(500, 800));
			}
			return fontListScrollPanel;
		}

		private JTextField fontStyleTextField;

		private JTextField getFontStyleTextField() {
			if (fontStyleTextField == null) {
				fontStyleTextField = new JTextField();
			}
			return fontStyleTextField;
		}

		private JList<String> fontStyleList;

		private JList<String> getFontStyle() {
			if (fontStyleList == null) {
				fontStyleList = new JList<>(new String[] { "Plain", "Italic", "Bold", "Bold Italic" });
			}
			return fontStyleList;
		}

		public FontStyleSelectionPanel() {
			super();
			setLayout(new BorderLayout());
			add(getFontStyleAndLabelPanel(), BorderLayout.NORTH);
			add(getFontStyleListScrollPanel(), BorderLayout.CENTER);
		}

		private JPanel fontStyleAndLabelPanel;

		private JPanel getFontStyleAndLabelPanel() {
			if (fontStyleAndLabelPanel == null) {
				fontStyleAndLabelPanel = new JPanel(new BorderLayout());
				fontStyleAndLabelPanel.add(getFontStyleLabel(), BorderLayout.NORTH);
				fontStyleAndLabelPanel.add(getFontStyleTextField(), BorderLayout.CENTER);
			}
			return fontStyleAndLabelPanel;
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
				// fontList.setPreferredSize(new Dimension(500, 800));
			}
			return fontList;
		}

		private JScrollPane fontListScrollPanel;

		private JScrollPane getFontListScrollPanel() {
			if (fontListScrollPanel == null) {
				fontListScrollPanel = new JScrollPane(getFontList());
				// fontListScrollPanel.setPreferredSize(new Dimension(500, 800));
			}
			return fontListScrollPanel;
		}

		private JPanel fontAndLabelPanel;

		private JPanel getFontAndLabelPanel() {
			if (fontAndLabelPanel == null) {
				fontAndLabelPanel = new JPanel(new BorderLayout());
				fontAndLabelPanel.add(getFontListLabel(), BorderLayout.NORTH);
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
