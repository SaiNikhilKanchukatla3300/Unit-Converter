package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import javax.swing.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
	JFrame f=new JFrame("Unit Converter");
	JLabel l1= new JLabel("Welcome to Unit Converter");
	JLabel l2=new JLabel("by --- SAI NIKHIL KANCHUKATLA ");
	final TextField t1 = new TextField(10);
	final TextField t2 =new TextField(10);
     final List list1 = new List();
      final List list2 = new List();
      list1.add("Kilometer");
      list1.add("Meter");
		list1.add("Centimeter");
		list1.add("Millimeter");
		list1.add("Foot");
		list1.add("Yard");
		list1.add("Inch");
		list2.add("Kilometer");
		list2.add("Meter");
		list2.add("Centimeter");
		list2.add("Millimeter");
		list2.add("Foot");
		list2.add("Yard");
		list2.add("Inch");
		Button b= new Button("Convert");
		f.setLayout(new BoxLayout(f.getContentPane(),BoxLayout.Y_AXIS));
		f.setSize(1000,1000);
		f.setVisible(true);
	    f.add(l1);
	    f.add(list1);
        f.add(t1);
        f.add(list2);
        f.add(t2);
        f.add(b);
        f.add(l2);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
             String s=list1.getItem(list1.getSelectedIndex());
             String s1=t1.getText();
				String s2=list2.getItem(list2.getSelectedIndex());
             float val = Float.parseFloat(s1);
				switch(s){
					case "Kilometer":
					{
						switch(s2) {
							case "Kilometer": {
                                t2.setText(Float.toString(val));
								break;
							}
							case "Meter": {
								val=val*1000;
								t2.setText(Float.toString(val));
								break;
							}
							case "Centimeter": {
								val=1000*100*val;
								t2.setText(Float.toString(val));
								break;
							}
							case "Millimeter": {
								val=1000*100*10*val;
								t2.setText(Float.toString(val));
								break;
							}
							case "Foot": {
								val=3280.84f*val;
								t2.setText(Float.toString(val));
								break;
							}
							case "Inch": {
								val=val*39370.1f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Yard": {
								val=val*1093.61f;
								t2.setText(Float.toString(val));
								break;
							}
						}
						break;
					}
					case "Meter":
					{
						switch(s2) {
							case "Kilometer": {
								val=(float)val/1000;
								t2.setText(Float.toString(val));
								break;
							}
							case "Meter": {
								t2.setText(Float.toString(val));
								break;
							}
							case "Centimeter": {
								val=val*100;
								t2.setText(Float.toString(val));
								break;
							}
							case "Millimeter": {
								val=val*100*10;
								t2.setText(Float.toString(val));
								break;
							}
							case "Foot": {
                                 val=val*3.28084f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Inch": {
								val*=39.3701f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Yard": {
								val=val*1.09361f;
								t2.setText(Float.toString(val));
								break;
							}
						}
						break;
					}
					case "Centimeter":
					{
						switch(s2) {
							case "Kilometer": {
								val=val/(1000*100);
								t2.setText(Float.toString(val));
								break;
							}
							case "Meter": {
								val=val/100;
								t2.setText(Float.toString(val));
								break;
							}
							case "Centimeter": {
								t2.setText(Float.toString(val));
								break;
							}
							case "Millimeter": {
								val*=10;
								t2.setText(Float.toString(val));
								break;
							}
							case "Foot": {
								val*=0.0328084f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Inch": {
								val*=0.393701f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Yard": {
								val*=0.0109361f;
								t2.setText(Float.toString(val));
								break;
							}
						}
						break;
					}
					case "Millimeter":
					{
						switch(s2) {
							case "Kilometer": {
								val=val/(1000*100*10);
								t2.setText(Float.toString(val));
								break;
							}
							case "Meter": {
								val=val/(100*10);
								t2.setText(Float.toString(val));
								break;
							}
							case "Centimeter": {
								val=val/(10);
								t2.setText(Float.toString(val));
								break;
							}
							case "Millimeter": {
								t2.setText(Float.toString(val));
								break;
							}
							case "Foot": {
								val=val*0.00328084f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Inch": {
                                 val*=0.0393701f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Yard": {
								val=val*0.00109361f;
								t2.setText(Float.toString(val));
								break;
							}
						}
						break;
					}
					case "Foot":
					{
						switch(s2) {
							case "Kilometer": {
								val*=0.0003048f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Meter": {
								val*=0.3048f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Centimeter": {
								val*=30.48f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Millimeter": {
								val*=304.8f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Foot": {
								t2.setText(Float.toString(val));
								break;
							}
							case "Inch": {
								val*=12;
								t2.setText(Float.toString(val));
								break;
							}
							case "Yard": {
								val*=0.333333f;
								t2.setText(Float.toString(val));
								break;
							}
						}
						break;
					}
					case "Inch":
					{
						switch(s2) {
							case "Kilometer": {
								val*=2.53999746e-5f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Meter": {
								val*=0.0253999746f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Centimeter": {
								val*=2.54f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Millimeter": {
                                  val*=25.4f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Foot": {
								val*=0.0833333f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Inch": {
								t2.setText(Float.toString(val));
								break;
							}
							case "Yard": {
								val*=0.0277778f;
								t2.setText(Float.toString(val));
								break;
							}
						}
						break;
					}
					case "Yard":
					{
						switch(s2) {
							case "Kilometer": {
								val*=0.0009144f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Meter": {
								val*=0.9144f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Centimeter": {
								val*=91.44f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Millimeter": {
								val*=914.4f;
								t2.setText(Float.toString(val));
								break;
							}
							case "Foot": {
								val*=3;
								t2.setText(Float.toString(val));
								break;
							}
							case "Inch": {
								val*=36;
								t2.setText(Float.toString(val));
								break;
							}
							case "Yard": {
								t2.setText(Float.toString(val));
								break;
							}
						}
						break;
					}

			 }
			}
		});
    }
}
