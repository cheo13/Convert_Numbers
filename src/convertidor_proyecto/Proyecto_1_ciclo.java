
package convertidor_proyecto;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Proyecto_1_ciclo extends javax.swing.JFrame {

    public Proyecto_1_ciclo() {
        initComponents();
        this.setResizable(false);
                String sis = (String) sistema.getSelectedItem();
         
         if(sis=="Seleccionar"){
         de.setEnabled(false);
         bi.setEnabled(false);
         oc.setEnabled(false);
         he.setEnabled(false);
        }          
         this.setLocationRelativeTo(null);
         Icon m=new ImageIcon(getClass().getResource("/convertidor_proyecto/INICIO.jpg"));       
         JOptionPane.showMessageDialog(null,m);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sistema = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        de = new javax.swing.JButton();
        bi = new javax.swing.JButton();
        oc = new javax.swing.JButton();
        he = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pro = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        res = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONVERTIDOR DE SISTEMAS DE NUMERACION");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sistema.setBackground(null);
        sistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Decimal", "Binario", "Octal", "Hexadecimal" }));
        sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemaActionPerformed(evt);
            }
        });
        getContentPane().add(sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 133, -1));

        jLabel3.setBackground(null);
        jLabel3.setForeground(null);
        jLabel3.setText("Ingrese valor:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        valor.setBackground(null);
        valor.setForeground(new java.awt.Color(255, 51, 51));
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorKeyTyped(evt);
            }
        });
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 133, -1));

        de.setBackground(null);
        de.setText("DECIMAL");
        de.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deMouseClicked(evt);
            }
        });
        de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deActionPerformed(evt);
            }
        });
        getContentPane().add(de, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        bi.setBackground(null);
        bi.setText("BINARIO");
        bi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                biMouseClicked(evt);
            }
        });
        getContentPane().add(bi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        oc.setBackground(null);
        oc.setText("OCTAL");
        oc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocMouseClicked(evt);
            }
        });
        getContentPane().add(oc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        he.setBackground(null);
        he.setText("HEXADECIMAL");
        he.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heMouseClicked(evt);
            }
        });
        getContentPane().add(he, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jScrollPane1.setBackground(null);
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 255));

        pro.setColumns(20);
        pro.setRows(5);
        jScrollPane1.setViewportView(pro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 417, 166));

        jLabel4.setBackground(null);
        jLabel4.setText("Proceso:");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setBackground(null);
        jLabel5.setText("Resultado:");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        res.setBackground(null);
        res.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 120, 28));

        reset.setBackground(null);
        reset.setForeground(new java.awt.Color(153, 0, 51));
        reset.setText("RESET");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione sistema:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Aldhabi", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/convertidor_proyecto/fondopag.jpg"))); // NOI18N
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemaActionPerformed
        String sis = (String) sistema.getSelectedItem();
        
        if (sis=="Decimal")
        {
            JOptionPane.showMessageDialog(null,"INGRESE NÚMEROS ENTEROS");
            de.setEnabled(false);
        }else if(sis!="Decimal"){
            de.setEnabled(true);
        }
        if (sis=="Binario")
        {
            JOptionPane.showMessageDialog(null,"INGRESE NÚMEROS ENTRE 0 Y 1");
            bi.setEnabled(false);
        }else if(sis!="Binario"){
            bi.setEnabled(true);
        }
        if (sis=="Octal")
        {
            JOptionPane.showMessageDialog(null,"INGRESE NÚMEROS ENTRE 0 Y 7");
            oc.setEnabled(false);
        }else if(sis!="Octal"){
            oc.setEnabled(true);
        }
        if (sis=="Hexadecimal")
        {
            JOptionPane.showMessageDialog(null,"INGRESE NÚMEROS ENTEROS O LETRAS DESDE A HASTA F");
            he.setEnabled(false);
        }else if(sis!="Hexadecimal"){
            he.setEnabled(true);
        }
    }//GEN-LAST:event_sistemaActionPerformed

    private void deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deActionPerformed
   
    }//GEN-LAST:event_deActionPerformed

    private void deMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deMouseClicked
             String sis = (String) sistema.getSelectedItem();
        //BINARIO A DECIMAL   
        
        if(sis=="Binario"){
        
        double potencias = 0;
        int pot = -1;
        double suma=0;
        int incr=-1;
        for (int i = (valor.getText().length()-1); i >= 0; i--)
        {
            pro.append(String.valueOf("\n     "));
            
            
            incr++;
            pot++;
            potencias = Math.pow(2, pot)*(Integer.parseInt((String.valueOf(valor.getText().charAt(i)))));  
            pro.append(String.valueOf("\n 2 * "+incr + " = "+(String.format("%.0f",Math.pow(2,incr)))+"*"+Integer.parseInt((String.valueOf(valor.getText().charAt(i))))*100/100));
            suma=suma+potencias;
            
            pro.append(String.format("\n %.0f",potencias));
            
        
        }res.setText(String.format("%.0f",suma));
        pro.append(String.format("\n"+"La suma total es: "+"\n %.0f",suma));
        
        
        }
        //OCTAL A DECIMAL
        if(sis=="Octal"){
        double potencias = 0;
        int pot = -1;
        double suma=0;
        for (int i = (valor.getText().length()-1); i >= 0; i--)
        {
            pot++;
            potencias = Math.pow(8, pot)*(Integer.parseInt((String.valueOf(valor.getText().charAt(i)))));  
            suma=suma+potencias;
            }res.setText(String.format("%.0f",suma));
               
        //HEXADECIMAL A DECIMAL
        }if(sis=="Hexadecimal"){
        String va=valor.getText();
        double potencias = 0;
        int pot = -1;
        double suma=0;
        for (int i = (va.length()-1); i >= 0; i--)
        {
            pot++; 
                     if  (va.charAt(i)== 'A'){
            potencias= Math.pow(16,pot)*10;
        }else if  (va.charAt(i)== 'B'){
            potencias= Math.pow(16,pot)*11;
        }else if  (va.charAt(i)== 'C'){
            potencias= Math.pow(16,pot)*12;
        }else if  (va.charAt(i)== 'D'){
            potencias= Math.pow(16,pot)*13;
        }else if  (va.charAt(i)== 'E'){
            potencias= Math.pow(16,pot)*14;
        }else if  (va.charAt(i)== 'F'){
            potencias= Math.pow(16,pot)*15;
        }else 
            potencias = Math.pow(16, pot)*(Integer.parseInt((String.valueOf(valor.getText().charAt(i)))));  
                            suma=suma+potencias;
           
        }res.setText(String.format("%.0f",suma));
        
        }
    }//GEN-LAST:event_deMouseClicked

    private void biMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biMouseClicked
        //DECIMAL A BINARIO
        String sis = (String) sistema.getSelectedItem();
        
        if(sis=="Decimal"){
       
        int va=Integer.parseInt(valor.getText());
        int exp=0, digito=0;
        double binario=0;
        while(va!=0){
            pro.append(String.valueOf("\n     "+va+"|_2"));
            digito=va%2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            va=va/2;
            pro.append(String.valueOf("\n"+digito+"         "+va));
        }
        res.setText(String.format("%.0f",binario));
        //OCTAL A BINARIO
        }if(sis=="Octal"){
        String va=(valor.getText());
        String p="";
       long n=0;
       int c=0;
       for(int i=va.length()-1;i>=0;i--)
       {
          if(va.charAt(i)=='1'){
             n=n+(long)(Math.pow(8,c)*1);
             c++;
          }else if(va.charAt(i)=='2'){
            n=n+(long)(Math.pow(8,c)*2);
            c++;
          }else if(va.charAt(i)=='3'){
            n=n+(long)(Math.pow(8,c)*3);
            c++;
        }else if(va.charAt(i)=='4'){
           n=n+(long)(Math.pow(8,c)*4);
           c++;
        }else if(va.charAt(i)=='5'){
            n=n+(long)(Math.pow(8,c)*5);
            c++;
        }else if(va.charAt(i)=='6'){
            n=n+(long)(Math.pow(8,c)*6);
            c++;
        }else if(va.charAt(i)=='7'){
            n=n+(long)(Math.pow(8,c)*7);
            c++;
        }else{
            n=n+(long)Math.pow(8,c)*(long)va.charAt(i);
            c++;
        }}
    String s1="",k="";
    if(n>1){
    while(n>0){
        if(n%2==0){
            k=k+"0";
            n=n/2;
        }else{
            k=k+"1";
            n=n/2;
        }}
    for(int i=0;i<k.length();i++){
        s1=k.charAt(i)+s1;
    }
    res.setText(String.valueOf(s1));
          }else{
        res.setText(String.valueOf(n));
        //HEXADECIMAL A BINARIO
    } }else if(sis=="Hexadecimal"){
        String va=(valor.getText());
        String p="";
       long n=0;
       int c=0;
       for(int i=va.length()-1;i>=0;i--)
       {
          if(va.charAt(i)=='A')
          {
             n=n+(long)(Math.pow(16,c)*10);
             c++;
          }
         else if(va.charAt(i)=='B')
         {
            n=n+(long)(Math.pow(16,c)*11);
            c++;
         }
        else if(va.charAt(i)=='C')
        {
            n=n+(long)(Math.pow(16,c)*12);
            c++;
        }
        else if(va.charAt(i)=='D')
        {
           n=n+(long)(Math.pow(16,c)*13);
           c++;
        }
        else if(va.charAt(i)=='E')
        {
            n=n+(long)(Math.pow(16,c)*14);
            c++;
        }
        else if(va.charAt(i)=='F')
        {
            n=n+(long)(Math.pow(16,c)*15);
            c++;
        }
        else
        {
            n=n+(long)Math.pow(16,c)*(long)va.charAt(i);
            c++;
        }
    }
    String s1="",k="";
    if(n>1)
    {
    while(n>0)
    {
        if(n%2==0)
        {
            k=k+"0";
            n=n/2;
        }
        else
        {
            k=k+"1";
            n=n/2;
        }
    }
    for(int i=0;i<k.length();i++)
    {
        s1=k.charAt(i)+s1;
    }
    res.setText(String.valueOf(s1));
       
    }
    else
    {res.setText(String.valueOf(n));
       
}
        
        }
        
    }//GEN-LAST:event_biMouseClicked

    private void ocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocMouseClicked
        String sis = (String) sistema.getSelectedItem();
        
        if(sis=="Decimal"){
        // DECIMAL A OCTAL
        int va=Integer.parseInt(valor.getText());
        char digitos[]={'0','1','2','3','4','5','6','7'};
        String octal = "";
        int resto, aux = va;
        while (aux>0){
            
            resto=aux%8;
            octal=digitos[resto]+octal;
            pro.append(String.valueOf("\n     "+aux+"|_8"));
            
            aux/=8;   
            pro.append(String.valueOf("\n"+resto+"         "+aux));
            
        }                
        res.setText(String.valueOf(octal));
        //BINARIO A OCTAL
        }else if(sis=="Binario"){
        int va=Integer.parseInt(valor.getText());
        String octal="",rest="";
        int resto=0, aux=va;
        int c=0,au,acu=0;
            while(va>0){
      acu=0;
      c=0;
          while(c<3){
      au=va%10;
      
      if(au==1){
          switch (c) {
              case 0:
                  acu=acu+1;
                  break;
              case 1:
                  acu=acu+2;
                  break;
              case 2:
                  acu=acu+4;
                  break;
              default:
                  break;
          }
      }
      va=va/10;
      c++;
      }
      if(acu<=7){
      rest=acu+rest;
      }else if(acu>7){
          switch (acu) {
              case 0:
                  rest="0"+rest;
                  break;
              case 1:
                  rest="1"+rest;
                  break;
              case 2:
                  rest="2"+rest;
                  break;
              case 3:
                  rest="3"+rest;
                  break;
              case 4:
                  rest="4"+rest;
                  break;
              case 5:
                  rest="5"+rest;
                   break;
                 case 6:
                  rest="6"+rest;
                  break;
                  case 7:
                  rest="7"+rest;
                  break;
              default:
                  break;
          }
      }
      }
            res.setText(String.valueOf(rest));
        }//HEXADECIMAL A OCTAL
        if(sis=="Hexadecimal"){
String va=valor.getText();
int v=Integer.parseInt(String.valueOf(va));
int  octal1;
octal1=Integer.parseInt(va,16);
String octal=Integer.toOctalString(octal1);
        
res.setText(String.valueOf(octal));
	
        }       
    }//GEN-LAST:event_ocMouseClicked

    private void heMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heMouseClicked
     String sis = (String) sistema.getSelectedItem();
        
        if(sis=="Decimal"){
        // DECIMAL A HEXADECIMAL
        int va=Integer.parseInt(valor.getText());
        char digitosh[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexadecimal="",rest="";
        int resto=0, aux=va;
        int c=0,au,acu=0;
        while (aux>0){
            resto=aux%16;
            hexadecimal=digitosh[resto]+hexadecimal;
            pro.append(String.valueOf("\n     "+aux+"|_16"));
            
            aux/=16;
        pro.append(String.valueOf("\n"+resto+"         "+aux));
            
        }
        res.setText(String.valueOf(hexadecimal));
        }else if(sis=="Binario"){
//BINARIO A HEXADECIMAL
            int va=Integer.parseInt(valor.getText());
        String hexadecimal="",rest="";
        int resto=0, aux=va;
        int c=0,au,acu=0;
            while(va>0){
      acu=0;
      c=0;
          while(c<4){
      au=va%10;
      
      if(au==1){
          switch (c) {
              case 0:
                  acu=acu+1;
                  break;
              case 1:
                  acu=acu+2;
                  break;
              case 2:
                  acu=acu+4;
                  break;
              case 3:
                  acu=acu+8;
                  break;
              default:
                  break;
          }
      }
      va=va/10;
      c++;
      }
      if(acu<=9){
      rest=acu+rest;
      }else if(acu>9){
          switch (acu) {
              case 10:
                  rest="A"+rest;
                  break;
              case 11:
                  rest="B"+rest;
                  break;
              case 12:
                  rest="C"+rest;
                  break;
              case 13:
                  rest="D"+rest;
                  break;
              case 14:
                  rest="E"+rest;
                  break;
              case 15:
                  rest="F"+rest;
                  break;
              default:
                  break;
          }
      }
      }
            res.setText(String.valueOf(rest));
        //OCTAL A HEXADECIMAL
        }else if(sis=="Octal"){
 int va=Integer.parseInt(valor.getText());
       int dec=0, i=0, t,rem;
        char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexdec="";
        while(va != 0)
        {
            dec =dec + (va%10) *(int)Math.pow(8, i);
            i++;
            va = va/10;
        }	
       while(dec!= 0)
       {
	rem=dec%16;
	hexdec= a[rem] + hexdec;
               dec= dec/16;
       }	     
            res.setText(String.valueOf(hexdec));
        
        }
      
        
    }//GEN-LAST:event_heMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        valor.setText(null);
        pro.setText(null);
       res.setText(null);
        
        
    }//GEN-LAST:event_resetMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
          
      
          
        
        
        
        
        
    }//GEN-LAST:event_valorActionPerformed

    private void valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyTyped
        String sis = (String) sistema.getSelectedItem();
        String va=valor.getText();
      //BINARIO 
      if (sis=="Binario"){
      for (int i = (va.length()-1); i >= 0; i--)
        {
        if((Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==0 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==1){
        pro.setText(String.valueOf(""));
      
        
        
        }else if((Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))!=0 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))!=1){
        JOptionPane.showMessageDialog(null,"INGRESE NÚMEROS ENTRE 0 Y 1");
        }  
        }
       }
      //DECIMAL
      if (sis=="Decimal"){
     
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null,"INGRESE SOLO NUMEROS ENTEROS");
        }  
        }
      //OCTAL
      if (sis=="Octal"){
      for (int i = (va.length()-1); i >= 0; i--)
        {
        if((Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==0 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==1 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==2 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==3 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==4 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==5 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==6 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==7){
        pro.setText(String.valueOf(""));
        
        }else if((Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==8 || (Integer.parseInt((String.valueOf(valor.getText().charAt(i)))))==9){
        JOptionPane.showMessageDialog(null,"INGRESE NÚMEROS ENTRE 0 Y 7");
        }}  
        
       }
      //HEXADECIMAL
      if (sis=="Hexadecimal"){
      for (int i = (va.length()-1); i >= 0; i--)
        {
        if((va.charAt(i)== '0') || (va.charAt(i)== '1') || (va.charAt(i)== '2') || (va.charAt(i)== '3') || (va.charAt(i)== '4') || (va.charAt(i)== '5') || (va.charAt(i)== '6') || (va.charAt(i)== '7') || (va.charAt(i)== '8') || (va.charAt(i)== '9') || (va.charAt(i)== 'A') || (va.charAt(i)== 'B') || (va.charAt(i)== 'C') || (va.charAt(i)== 'D') || (va.charAt(i)== 'E') || (va.charAt(i)== 'F'))
        {    
            pro.setText(String.valueOf(""));
        
        }else if((va.charAt(i)!= 'A') || (va.charAt(i)!= 'B') || (va.charAt(i)!= 'C') || (va.charAt(i)!= 'D') || (va.charAt(i)!= 'E') || (va.charAt(i)!= 'F')){

        JOptionPane.showMessageDialog(null,"INGRESE NÚMEROS ENTEROS O LETRAS DESDE A HASTA F");
        }  
        
       }}
        
        
        
        
    }//GEN-LAST:event_valorKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto_1_ciclo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bi;
    private javax.swing.JButton de;
    private javax.swing.JButton he;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton oc;
    private javax.swing.JTextArea pro;
    private javax.swing.JTextField res;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox<String> sistema;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
