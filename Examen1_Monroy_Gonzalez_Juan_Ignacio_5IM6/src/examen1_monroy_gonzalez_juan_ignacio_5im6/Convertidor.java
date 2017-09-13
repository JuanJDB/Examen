/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_monroy_gonzalez_juan_ignacio_5im6;

/**
 *
 * @author compucel
 */

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Convertidor extends JFrame implements ActionListener{

    JLabel res;
    JButton no0;
    JButton no1;
    JButton no2;
    JButton no3;
    JButton no4;
    JButton no5;
    JButton no6;
    JButton no7;
    JButton no8;
    JButton no9;
    JButton ce;
    JButton conve;
    
    public Convertidor(){
        configuracion();
        componentes();
    }
    
    public void configuracion(){
      setTitle("Convertidor a pesos");
      setSize(400,400);
      setLayout(null);
      setResizable(false);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    
    public void componentes(){
        
        res = new JLabel("");
        res.setBounds(10,30,300,30);
        res.setAlignmentX(CENTER_ALIGNMENT);
        add(res);
        
        no0 = new JButton("0");
        no0.setBounds(10,70,50,50);
        add(no0);
        no0.addActionListener(this);
        no0.setActionCommand("0");
        add(no0);
        
        no1 = new JButton("1");
        no1.setBounds(70, 70, 50, 50);
        add(no1);
        no1.addActionListener(this);
        no1.setActionCommand("1");
        add(no1);
        
        no2 = new JButton("2");
        no2.setBounds(130, 70, 50, 50);
        add(no2);
        no2.addActionListener(this);
        no2.setActionCommand("2");
        add(no2);
        
        
        no3 = new JButton("3");
        no3.setBounds(10,130,50,50);
        add(no3);
        no3.addActionListener(this);
        no3.setActionCommand("3");
        add(no3);
        
        no4 = new JButton("4");
        no4.setBounds(70, 130, 50, 50);
        add(no4);
        no4.addActionListener(this);
        no4.setActionCommand("4");
        add(no4);
        
        no5 = new JButton("5");
        no5.setBounds(130, 130, 50, 50);
        add(no5);
        no5.addActionListener(this);
        no5.setActionCommand("5");
        add(no5);
        
        no6 = new JButton("6");
        no6.setBounds(10,190,50,50);
        add(no6);
        no6.addActionListener(this);
        no6.setActionCommand("6");
        add(no6);
        
        no7 = new JButton("7");
        no7.setBounds(70, 190, 50, 50);
        add(no7);
        no7.addActionListener(this);
        no7.setActionCommand("7");
        add(no7);
        
        no8 = new JButton("8");
        no8.setBounds(130, 190, 50, 50);
        add(no8);
        no8.addActionListener(this);
        no8.setActionCommand("8");
        add(no8);
        
        no9 = new JButton("9");
        no9.setBounds(70, 250,50,50);
        add(no9);
        no9.addActionListener(this);
        no9.setActionCommand("9");
        add(no9);
        
        ce = new JButton("CE");
        ce.setBounds(200, 70, 180, 100);
        add(ce);
        ce.addActionListener(this);
        ce.setActionCommand("CE");
        add(ce);
        
        conve = new JButton("Convertir");
        conve.setBounds(200, 200, 180,100);
        add(conve);
        conve.addActionListener(this);
        conve.setActionCommand("Convertir");
        add(conve);        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
      
        if(e.getActionCommand().equals("CE")){
            res.setText(" ");
        }else{
           
            if(e.getActionCommand().equals("Convertir")){
                double numero = Double.parseDouble(res.getText());
                double resulta = numero/19;
                res.setText("El resultado es "+resulta+" dolares");
                
            }else{
               
                if(e.getActionCommand().equals("0")){
                    
                  res.setText( res.getText()+"0");
                    
                }else{
                    
                    if(e.getActionCommand().equals("1")){
                        
                          res.setText(res.getText()+"1");
                        
                    }else{
                       
                        if(e.getActionCommand().equals("2")){
                            
                              res.setText(res.getText()+"2");
                            
                        }else{
                           
                            if(e.getActionCommand().equals("3")){
                           
                                  res.setText(res.getText()+"3");
                                
                            }else{
                                
                                if(e.getActionCommand().equals("4")){
                                    
                                      res.setText(res.getText()+"4");
                                    
                                }else{
                                    
                                    if(e.getActionCommand().equals("5")){
                                      
                                          res.setText(res.getText()+"5");
                                        
                                    }else{
                                       
                                        if(e.getActionCommand().equals("6")){
                                            
                                              res.setText(res.getText()+"6");
                                            
                                        }else{
                                           
                                            if(e.getActionCommand().equals("7")){
                                                
                                                  res.setText(res.getText()+"7");
                                                  
                                            }else{
                                                
                                                if(e.getActionCommand().equals("8")){
                                                    
                                                      res.setText(res.getText()+"8");
                                                    
                                                }else{
                                                   
                                                    if(e.getActionCommand().equals("9")){
                                                        
                                                          res.setText(res.getText()+"9");
                                                        
                                                    }else{
                                                        JOptionPane.showMessageDialog(this, "Fallo");
                                                          res.setText("KHEEE");
                                                          JOptionPane.showMessageDialog(this, no0.getText());
                                                    }
                                                }
                                            }
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
       
    }
    
  }
}
