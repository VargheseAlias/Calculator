import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculatorUI implements ActionListener{
	JFrame jf;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bEq,bDec,bClr;
	JTextField txt;
	String a,b;
	double result;
	char op;
	
	CalculatorUI(){
		jf=new JFrame("Calculator");
		jf.setSize(215,270);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		bAdd=new JButton("+");
		bSub=new JButton("-");
		bMul=new JButton("*");
		bDiv=new JButton("/");
		bEq=new JButton("=");
		bDec=new JButton(".");
		bClr=new JButton("C");
		txt=new JTextField(19);
		
		jf.add(txt);
		jf.add(b7);
		jf.add(b8);
		jf.add(b9);
		jf.add(bDiv);
		jf.add(b4);
		jf.add(b5);
		jf.add(b6);
		jf.add(bMul);
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(bSub);
		jf.add(bClr);
		jf.add(b0);
		jf.add(bDec);
		jf.add(bAdd);
		jf.add(bEq);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bEq.addActionListener(this);
		bDec.addActionListener(this);
		bClr.addActionListener(this);
		
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b0)
			txt.setText(txt.getText().concat("0"));
		if(e.getSource()==b1)
			txt.setText(txt.getText().concat("1"));
		if(e.getSource()==b2)
			txt.setText(txt.getText().concat("2"));
		if(e.getSource()==b3)
			txt.setText(txt.getText().concat("3"));
		if(e.getSource()==b4)
			txt.setText(txt.getText().concat("4"));
		if(e.getSource()==b5)
			txt.setText(txt.getText().concat("5"));
		if(e.getSource()==b6)
			txt.setText(txt.getText().concat("6"));
		if(e.getSource()==b7)
			txt.setText(txt.getText().concat("7"));
		if(e.getSource()==b8)
			txt.setText(txt.getText().concat("8"));
		if(e.getSource()==b9)
			txt.setText(txt.getText().concat("9"));
		if(e.getSource()==bDec)
			txt.setText(txt.getText().concat("."));
		if(e.getSource()==bClr)
			txt.setText("");
		if(e.getSource()==bAdd){
			a=txt.getText();
			op='+';
			txt.setText(txt.getText().concat("+"));
		}
		if(e.getSource()==bSub){
			a=txt.getText();
			op='-';
			txt.setText(txt.getText().concat("-"));
		}
		if(e.getSource()==bMul){
			a=txt.getText();
			op='*';
			txt.setText(txt.getText().concat("*"));
		}
		if(e.getSource()==bDiv){
			a=txt.getText();
			op='/';
			txt.setText(txt.getText().concat("/"));
		}
		if(e.getSource()==bEq){
			b=txt.getText().substring(txt.getText().indexOf(op)+1);
			if(op=='+')
				result=Double.parseDouble(a)+Double.parseDouble(b);
			if(op=='-')
				result=Double.parseDouble(a)-Double.parseDouble(b);
			if(op=='*')
				result=Double.parseDouble(a)*Double.parseDouble(b);
			if(op=='/')
				result=Double.parseDouble(a)/Double.parseDouble(b);
			txt.setText(txt.getText()+" = "+result);
		}
	}
}

class Calculator{
	public static void main(String args[]){
		CalculatorUI cui=new CalculatorUI();
	}
}
			
			
		

