/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;


import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;


/**
 *
 * @author Charly Ponce
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void analizarLexico() throws IOException{
        int cont = 1;
    
           
        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
    
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case Si:
                    resultado += "  <Reservada Si>\t" + lexer.lexeme + "\n";
                    break;
                case Sino:
                    resultado += "  <Reservada Sino>\t" + lexer.lexeme + "\n";
                    break;
                case Hacer:
                    resultado += "  <Reservada Hacer>\t" + lexer.lexeme + "\n";
                    break;
                case Mientras:
                    resultado += "  <Reservada Mientras>\t" + lexer.lexeme + "\n";
                    break;
                case Para:
                    resultado += "  <Reservada Para>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Principal:
                    resultado += "  <Reservada Principal>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }

     private void analizarLexicoarchivo() throws IOException{
        int cont = 1;
    
           
        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
    
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case Si:
                    resultado += "  <Reservada Si>\t" + lexer.lexeme + "\n";
                    break;
                case Sino:
                    resultado += "  <Reservada Sino>\t" + lexer.lexeme + "\n";
                    break;
                case Hacer:
                    resultado += "  <Reservada Hacer>\t" + lexer.lexeme + "\n";
                    break;
                case Mientras:
                    resultado += "  <Reservada Mientras>\t" + lexer.lexeme + "\n";
                    break;
                case Para:
                    resultado += "  <Reservada Para>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Principal:
                    resultado += "  <Reservada Principal>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        btnAnalizarLex = new javax.swing.JButton();
        btnLimpiarLex = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnAnalizarSin = new javax.swing.JButton();
        btnLimpiarSin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analizador Lexico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnArchivo.setText("Abrir archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        txtAnalizarLex.setEditable(false);
        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        btnAnalizarLex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizarLex.setText("Analizar");
        btnAnalizarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexActionPerformed(evt);
            }
        });

        btnLimpiarLex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiarLex.setText("Limpiar");
        btnLimpiarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLexActionPerformed(evt);
            }
        });

        jButton1.setText("Trasladar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnalizarLex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarLex))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(386, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArchivo)
                    .addComponent(btnAnalizarLex)
                    .addComponent(btnLimpiarLex)
                    .addComponent(jButton1))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analizador Sintactico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        txtAnalizarSin.setEditable(false);
        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        btnAnalizarSin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizarSin.setText("Analizar");
        btnAnalizarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSinActionPerformed(evt);
            }
        });

        btnLimpiarSin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiarSin.setText("Limpiar");
        btnLimpiarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSinActionPerformed(evt);
            }
        });

        jButton2.setText("trasladar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnalizarSin)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarSin))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalizarSin)
                    .addComponent(btnLimpiarSin)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtResultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnLimpiarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLexActionPerformed
        // TODO add your handling code here:
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_btnLimpiarLexActionPerformed

    private void btnLimpiarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSinActionPerformed
        // TODO add your handling code here:
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_btnLimpiarSinActionPerformed

    private void btnAnalizarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLexActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarLexActionPerformed

    private void btnAnalizarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSinActionPerformed
        // TODO add your handling code here:
        String ST = txtResultado.getText();
        String resultado = txtAnalizarSin.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        File archivo;
           archivo = new File("bitacora.html");
       
        try {
            s.parse();
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
          
       
           
     
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
               
              
        }
          
        try {
            System.out.println("archivo creado ");
                //FileWriter escritura = new FileWriter(archivo);
                OutputStream out;
            out = new FileOutputStream(archivo);
              byte[] dataBytes = resultado.getBytes();
                out.write( dataBytes );
            
               out.close();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
               
              
    }//GEN-LAST:event_btnAnalizarSinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int cont = 1;
        File archivo;
      
        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        String resultadohtml = "<html><head><title>Datos</title></head><body>\n" +
                                "<link rel='stylesheet' type='text/css' href='estilo.css'>\n" + "<table border='1'>"
                + "<tr><th>No. de Linea</th><th>Token</th><th>Simbolo</th></tr>"
                
                ;
        while (true) {
       try {
           Tokens token = lexer.yylex();
           if (token == null) {
               //txtAnalizarLex.setText(resultado);
               archivo = new File("tabla.html");
        try {
           
                System.out.println("archivo creado ");
                //FileWriter escritura = new FileWriter(archivo);
                OutputStream out = new FileOutputStream(archivo);
                 byte[] dataBytes = resultadohtml.getBytes();
                out.write( dataBytes );
                 resultadohtml +=  " </table>"+"</body></html>";
               out.close();
              try {
                String url = new File("").getAbsolutePath()+ "\\tabla.html";
                ProcessBuilder p = new ProcessBuilder();
                p.command("cmd.exe","/c",url);
                p.start();
     } catch (Exception e) {
     }     
           
        } catch (Exception e) {
        }
               return;
           }
           switch (token) {
               case Linea:
                   cont++;
                   resultado += "LINEA " + cont + "\n";
                   //resultadohtml +=  "<tr><td align='center'>"+cont+"</td>";
                   break;
               case Comillas:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Comillas"+ "</td>"+ "<td align='center'>"+ lexer.lexeme + "</td>"+ "</tr>";
                   break;
               case Cadena:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Tipo de dato\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme + "</td>" + "</tr>"+"\n";
                   break;
               case T_dato:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Tipo de dato\t"  + "</td>"+ "<td align='center'>"+lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Si:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Reservada Si\t"  + "</td>"+ "<tr><td align='center'>"+lexer.lexeme + "</td>" +"</tr>"+ "\n";
                   break;
               case Sino:
                   resultadohtml +="<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+ "  Reservada Sino\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Hacer:
                   resultadohtml +="<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+ "  Reservada Hacer\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Mientras:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Reservada Mientras\t"  + "</td>"+ "<td align='center'>"+lexer.lexeme  + "</td>"+"</tr>"+ "\n";
                   break;
               case Para:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Reservada Para\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Igual:
                   resultadohtml +="<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+ "  Operador igual\t"  + "</td>"+ "<td align='center'>"+lexer.lexeme  + "</td>" + "</tr>"+"\n";
                   break;
               case Suma:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Operador suma\t" + "</td>" +"<td align='center'>"+ lexer.lexeme + "</td>" + "</tr>"+"\n";
                   break;
               case Resta:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Operador resta\t" + "</td>" + "<tr><td align='center'>"+lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Multiplicacion:
                   resultadohtml +="<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+ "  Operador multiplicacion\t" + "</td>" +"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Division:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Operador division\t" + "</td>" +"<td align='center'>"+ lexer.lexeme  + "</td>"+"</tr>"+ "\n";
                   break;
               case Op_logico:
                   resultadohtml +="<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+ "  Operador logico\t"  + "</td>"+ "<td align='center'>"+lexer.lexeme  + "</td>"+"</tr>"+ "\n";
                   break;
               case Op_incremento:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Operador incremento\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+ "\n";
                   break;
               case Op_relacional:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Operador relacional\t"  + "</td>"+ "<td align='center'>"+lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Op_atribucion:
                   resultadohtml +="<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+ "  Operador atribucion\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Op_booleano:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Operador booleano\t" + "</td>" +"<td align='center'>"+ lexer.lexeme  + "</td>"+"</tr>"+ "\n";
                   break;
               case Parentesis_a:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Parentesis de apertura\t" + "</td>" + "<td align='center'>"+lexer.lexeme + "</td>" +"</tr>"+ "\n";
                   break;
               case Parentesis_c:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Parentesis de cierre\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme + "</td>" + "</tr>"+"\n";
                   break;
               case Llave_a:
                   resultadohtml +="<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+ "  Llave de apertura\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Llave_c:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Llave de cierre\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+"</tr>"+ "\n";
                   break;
               case Corchete_a:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Corchete de apertura\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+"</tr>"+ "\n";
                   break;
               case Corchete_c:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Corchete de cierre\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Principal:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Reservada Principal\t" + "</td>" +"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case P_coma:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Punto y coma\t"  + "</td>"+ "<td align='center'>"+lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Identificador:
                   resultadohtml +="<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+ "  Identificador\t\t"  + "</td>"+"<td align='center'>"+ lexer.lexeme  + "</td>"+ "</tr>"+"\n";
                   break;
               case Numero:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Numero\t\t"  + "</td>"+ "<td align='center'>"+lexer.lexeme  + "</td>"+"</tr>"+ "\n";
                   break;
               case ERROR:
                   resultadohtml += "<tr><td align='center'>"+cont+"</td>"+"<td align='center'>"+"  Simbolo no definido\n" + "</td>+\"</tr>\"+";
                   break;
               default:
                   resultadohtml += "  < " + lexer.lexeme + " >\n";
                   break;
           }
             
          
           
       } // TODO add your handling code here:
       
       catch (IOException ex) {
           Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  try {
                String url = new File("").getAbsolutePath()+ "\\bitacora.html";
                ProcessBuilder p = new ProcessBuilder();
                p.command("cmd.exe","/c",url);
                p.start();
     } catch (Exception e) {
     }             // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLex;
    private javax.swing.JButton btnAnalizarSin;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnLimpiarLex;
    private javax.swing.JButton btnLimpiarSin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
