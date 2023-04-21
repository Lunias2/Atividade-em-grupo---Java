package telas;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 * @author LAPESA
 *
 */
public class JPanelCircular extends JPanel    {
    /**
	 * 
	 */
	private static final long serialVersionUID = 652591046208742610L;
	private Color backgroundColor;
    private int cornerRadius = 15;
    private String caminho;
    
    public JPanelCircular(LayoutManager layout, int radius) {
        super(layout);
        cornerRadius = radius;
    }
    public JPanelCircular(LayoutManager layout, int radius, Color bgColor) {
        super(layout);
        cornerRadius = radius;
        backgroundColor = bgColor;
    }
    public JPanelCircular(int radius) {
        super();
        cornerRadius = radius;
        
    }
    public JPanelCircular(int radius, Color bgColor, String caminho) {
        super();
        cornerRadius = radius;
        backgroundColor = bgColor;
        this.caminho = caminho;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //Draws the rounded panel with borders.
        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }
        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
         
    }
	/**
	 * @return the caminho
	 */
	public String getCaminho() {
		return caminho;
	}
	/**
	 * @param caminho the caminho to set
	 */
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
    

}

