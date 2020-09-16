import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 public class  Calculator extends Applet
implements ActionListener
{
	String msg=" ";
	int p,q,result;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,mul,div,clear,mod,EQ;
	char OP;
	public void init()
	{
t1=new TextField(10);
		GridLayout gl=new GridLayout(4,5);
		setLayout(gl);
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		add=new Button("add");
		sub=new Button("sub");
		mul=new Button("mul");
		div=new Button("div");
		mod=new Button("mod");
		clear=new Button("clear");
		EQ=new Button("EQ");
		t1.addActionListener(this);
		add(t1);
		for(int i=0;i<10;i++)
		{
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}
 
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
		t1.setText(t1.getText()+str);
		else
		if(str.equals("add"))
		{
			p=Integer.parseInt(t1.getText());
			OP='+';
			t1.setText("");
		}
		else if(str.equals("sub"))
		{
			p=Integer.parseInt(t1.getText());
			OP='-';
			t1.setText("");
		}
		else if(str.equals("mul"))
		{
			p=Integer.parseInt(t1.getText());
			OP='*';
			t1.setText("");
		}
		else if(str.equals("div"))
		{
			p=Integer.parseInt(t1.getText());
			OP='/';
			t1.setText("");
		}
		else if(str.equals("mod"))
		{
			p=Integer.parseInt(t1.getText());
			OP='%';
			t1.setText("");
		}
		if(str.equals("EQ"))
		{
			q=Integer.parseInt(t1.getText());
			if(OP=='+')
				result=p+q;
			else if(OP=='-')
				result=p-q;
			else if(OP=='*')
				result=p*q;
			else if(OP=='/')
				result=p/q;
			else if(OP=='%')
				result=p%q;
			t1.setText(""+result);
		}	
		if(str.equals("clear"))
		{
			t1.setText("");
		}
	}
}


