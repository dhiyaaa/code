import java.awt.*;  
import java.*;
import java.awt.event.*;  
public class excel extends Frame
{
  MenuBar mb = new MenuBar();
  Menu f1 = new Menu("File");
  MenuItem a1 = new MenuItem("New");  
  MenuItem a2 = new MenuItem("Exit");
  int i,j,n,m,x,y;
  TextField tf[][]= new TextField[50][50];
  excel()
  {
	n=10;m=26;x=20;y=20;
	
	setSize(600,400);  
    setLayout(null);  
    setVisible(true);
    show();
  }
  void init()
  {
	  for(i=1;i<=n;i++)
	{
		y=20;
		x=x+20;
		for(j=1;j<=m;j++)
		{
		    y=y+40;

			tf[i][j].setBounds(x,y,40,20); 
			add(tf[i][j]);
		}
	}
  }
  public static void main(String args[]) 
  {  
    excel e=new excel();   
	e.init();	
  } 
}