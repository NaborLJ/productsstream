
package productsstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Productsstream {
         
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
         Product po1 = new Product("cod1","parafusos",3);
         Product po2 = new Product("cod2","arandelas",4);
         Product po3 = new Product();
         File texto = new File("productos.txt");
         
         
         texto.createNewFile();
         DataOutputStream write= new DataOutputStream(new FileOutputStream (texto));
         write.writeUTF(po1.getCodigo());
         write.writeUTF(po1.getDescricion());
         write.write(po1.getPrezo());
         write.writeUTF(po2.getCodigo());
         write.writeUTF(po2.getDescricion());
         
         write.close();
         
         DataInputStream read=new DataInputStream(new FileInputStream(texto));   
         po3.setCodigo(read.readUTF());
         po3.setDescricion(read.readUTF());
         po3.setPrezo(read.read());
         System.out.println(po3.getCodigo());
         System.out.println(po3.getDescricion());
         System.out.println(po3.getPrezo());
         
    }
    
    
    
    
    
}
