import java.awt.*; 
import java.awt.event.*;
class RadioApp extends Frame
{
    Checkbox cb1, cb2, cb3, cb4, cb5; 
    Checkbox male,female;
    Label l, l1;
    TextField fld;
    RadioApp ()
    {
        setSize (400, 400);
        setLayout (new FlowLayout ()); 
        CheckboxGroup cbg1=new CheckboxGroup(); 
        CheckboxGroup cbg2=new CheckboxGroup(); 
        CheckboxGroup gender=new CheckboxGroup();
        
        cb1=new Checkbox ("C", cbg1, false); 
        cb2=new Checkbox ("C++", cbg1, false); 
        cb3=new Checkbox ("Java", cbg1, true); 
        cb4=new Checkbox ("Python", cbg1, false); 
        cb5=new Checkbox ("Exit");
        male=new Checkbox("Male",gender,false);
        female=new Checkbox("Female", gender, true);
        fld=new TextField();
        fld.setEditable(false);
        fld.setSize(200, 200);;
       
        l=new Label ("Please select Course : "); 
        l1=new Label ();
        add (l);
        add (cb1);
        add (cb2);
        add (cb3);
        add (cb4);
        add (cb5);
        add (l1);
        add(male);
        add(female);
        cb1.addItemListener (new itl ()); 
        cb2.addItemListener (new itl ()); 
        cb3.addItemListener (new itl ()); 
        cb4.addItemListener (new itl ()); 
        cb5.addItemListener (new itl ()); 
        male.addItemListener(new itl ());
        female.addItemListener(new itl ());
        add(fld);
        setVisible (true);
    }
    
    class itl implements ItemListener
    {
        public void itemStateChanged (ItemEvent ie)
        {
            Object obj=ie.getItemSelectable (); 
            Checkbox cb=(Checkbox) obj;
            if (cb.getState ())
            {
               /* l1.setText ("U HAVE SELECTED : "+cb.getLabel ()); 
                String lab=cb.getLabel ();
                if (lab.equalsIgnoreCase ("exit"))
                {
                     System.exit (0);

                }*/
            	
            	String input=cb.getLabel();
            	fld.setText(input);
            	if(fld.getText().equalsIgnoreCase("exit"))
            		System.exit(0);
            }
            else
            {
                l1.setText ("U HAVE SELECTED NONE");
            }
        }
    }
};
    
