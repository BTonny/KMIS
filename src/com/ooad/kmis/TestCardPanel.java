//package com.ooad.kmis;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.util.Random;
//
//import javax.swing.*;
//
//public class TestCardPanel extends JPanel {
//
//	private static final long serialVersionUID = 1L;
//	private static final Random random = new Random();
//    private static final JPanel cards = new JPanel(new CardLayout());
//    private final String name;
//    
//	public TestCardPanel(String name) {
//		this.name = name;
//        this.setPreferredSize(new Dimension(320, 240));
//        this.setBackground(new Color(random.nextInt()));
//        this.add(new JLabel(name));
//	}
//	
//	@Override
//    public String toString() {
//        return name;
//    }
//
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                create();
//            }
//        });
//    }
//
//    private static void create() {
//        JFrame f = new JFrame();
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        for (int i = 1; i < 9; i++) {
//        	TestCardPanel p = new TestCardPanel("Panel " + String.valueOf(i));
//            cards.add(p, p.toString());
//        }
//        JPanel control = new JPanel();
//        control.add(new JButton(new AbstractAction("\u22b2Prev") {
//
//            /**
//			 * 
//			 */
//			private static final long serialVersionUID = 1L;
//
//			@Override
//            public void actionPerformed(ActionEvent e) {
//                CardLayout cl = (CardLayout) cards.getLayout();
//                cl.previous(cards);
//            }
//        }));
//        control.add(new JButton(new AbstractAction("Next\u22b3") {
//
//            /**
//			 * 
//			 */
//			private static final long serialVersionUID = 1L;
//
//			@Override
//            public void actionPerformed(ActionEvent e) {
//                CardLayout cl = (CardLayout) cards.getLayout();
//                cl.next(cards);
//            }
//        }));
//        f.add(cards, BorderLayout.CENTER);
//        f.add(control, BorderLayout.SOUTH);
//        f.pack();
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//    }
//
//
//}
