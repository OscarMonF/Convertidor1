/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class Cal extends JFrame implements ActionListener{  

    
    private JTextField operando1, resultado;
    private  JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, con, cerrar, pun;
    private JLabel titulo, num1Txt, result;
    
    
    
    public Cal(){
         
        configurarVentana();
        iniciarComponentes();
     } 


    private void configurarVentana() {

            setTitle(" Convertidor ");             
            setSize(650, 510);                                 
            setLocationRelativeTo(null);                       
            setLayout(null);                                   
            setResizable(false);                               
             
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       }

    private  void iniciarComponentes(){

      

            titulo = new JLabel("Convertidor");
            titulo.setBounds(230, 40, 300, 30);
            titulo.setFont( new Font("TimesRoman",Font.BOLD,18));
            add(titulo);


            num1Txt = new JLabel(" Cantidad ");
            num1Txt.setBounds(40, 120, 200, 30);
            add(num1Txt);
        
            result = new JLabel("Resultado: ");
            result.setBounds(40, 200, 200, 30);
            add(result);

            operando1 = new JTextField();
            operando1.setBounds(150, 120, 100, 20);
            add(operando1);
     
            resultado = new JTextField();
            resultado.setBounds(150, 200, 100, 20);
            add(resultado);

            num1 = new JButton("1");
            num1.setBounds(400, 100, 50, 50);
            add(num1);
            num1.addActionListener(this);
            
            num2 = new JButton("2");
            num2.setBounds(450, 100, 50, 50);
            add(num2);
            num2.addActionListener(this);
            
            num3 = new JButton("3");
            num3.setBounds(500, 100, 50, 50);
            add(num3);
            num3.addActionListener(this);

            num4 = new JButton("4");
            num4.setBounds(400, 150, 50, 50);
            add(num4);
            num4.addActionListener(this);
            
            num5 = new JButton("5");
            num5.setBounds(450, 150, 50, 50);
            add(num5);
            num5.addActionListener(this);
            
            num6 = new JButton("6");
            num6.setBounds(500, 150, 50, 50);
            add(num6);
            num6.addActionListener(this);
            
            num7 = new JButton("7");
            num7.setBounds(400, 200, 50, 50);
            add(num7);
            num7.addActionListener(this);
            
            num8 = new JButton("8");
            num8.setBounds(450, 200, 50, 50);
            add(num8);
            num8.addActionListener(this);
            
            num9 = new JButton("9");
            num9.setBounds(500, 200, 50, 50);
            add(num9);
            num9.addActionListener(this);
            
            num0 = new JButton("0");
            num0.setBounds(400, 250, 50, 50);
            add(num0);
            num0.addActionListener(this);
           
            pun = new JButton(".");
            pun.setBounds(450, 250, 50, 50);
            add(pun);
            pun.addActionListener(this);
            
            con = new JButton("Convertir");
            con.setBounds(450, 340, 100, 50);
            add(con);
            con.addActionListener(this);
    }  
  
  

        @Override
    public void actionPerformed(ActionEvent e) {
        int resul;
        double resu;
        
        String num11,total;
        if(e.getSource() == num1){
            num11="1";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num2){
            num11="2";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num3){
            num11="3";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num4){
            num11="4";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num5){
            num11="5";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num6){
            num11="6";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num7){
            num11="7";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num8){
            num11="8";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num9){
            num11="9";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == num0){
            num11="0";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == pun){
            num11=".";
            operando1.setText(operando1.getText() + num11);
        
        }
        if(e.getSource() == con){
             
            resu = new Double(operando1.getText())/20;
            total=String.valueOf(resu);
            resultado.setText(total);
            operando1.setText("");
        
        }
    }
}      