/*
 4. Una tienda ha puesto en oferta la venta de un producto, ofreciendo 15% de descuento por la
compra de 3 docenas y 10% en caso contrario. Además por la compra de más de 3 docenas se obsequia una unidad por cada docena en 
exceso sobre 3. Diseñe un programa que determine el monto de la compra, el monto de descuento y el número de unidades de obsequio para
cada uno de los 10 clientes que se atendieron en el día.
 */
package descuento;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonio Aranda
 */
public class Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String docenas;
        float cant, descuento=0, obsequio=0;
        
        docenas = JOptionPane.showInputDialog("Digite las docenas que desea comprar: ");
        cant = Float.parseFloat(docenas);
        
        if(cant >= 3)
        {
            if(cant == 3)
            {
               descuento = (float) 0.15; 
            }
            else if(cant >= 3)
            {
                descuento = (float) 0.15;
                obsequio = 1 * (cant - 3);
            }
        }
        else
        {
            descuento = (float) 0.10;
        }
        
        JOptionPane.showMessageDialog(null, "Su compra es de "+ cant + " docenas\nCon un descuento del "+descuento+"\nCon un obsequi de "+obsequio+" unidades");
    }
    
}
