package net.ericaro.surfaceplotter;

import java.awt.*;

public class JSurfaceApplet extends Frame {


    public JSurfaceApplet() {
        initComponents();
        add(surfacePanel1);

        setSize(700, 700);

        setTitle("JSurfaceApplet");
        setVisible(true);
    }


    public static void main(String[] args) {
        JSurfaceApplet jSurfaceApplet = new JSurfaceApplet();
        jSurfaceApplet.setVisible(true);
    }

//	@Override
//	public void init() {
//			//initComponents();
//			try {
//
//	        javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
//	            public void run() {
//	                initComponents();
//	            }
//	        });
//	    } catch (Exception e) {
//	        System.err.println("createGUI didn't successfully complete"+ e);
//	        e.printStackTrace();
//	    }
//	}

    private void initComponents() {
        surfacePanel1 = new JSurfacePanel();

        //======== this ========
        setLayout(new BorderLayout());

        //---- surfacePanel1 ----
        surfacePanel1.setTitleText("Demo Applet");
        surfacePanel1.setBackground(Color.white);
        surfacePanel1.setTitleFont(surfacePanel1.getTitleFont().deriveFont(surfacePanel1.getTitleFont().getStyle() | Font.BOLD, surfacePanel1.getTitleFont().getSize() + 6f));
        surfacePanel1.setConfigurationVisible(false);
        add(surfacePanel1, BorderLayout.CENTER);

    }

    private JSurfacePanel surfacePanel1;
}
