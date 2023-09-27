package myString;

public class MyString {
private char [] wort;

public MyString() {
	this.wort= new char [0];
}
public MyString(char c ) {
	this.wort=new char [1];
	wort [0]=c;
}

public MyString(String s) {
	this.wort=new char[s.length()];
	for(int i=0;i<wort.length;i++) {
		wort[i]=s.charAt(i);
	}
}
@Override
public String toString()
{
    String s=" ";
    for(int i=0; i<this.wort.length; i++)
    {    
         s+=   String.valueOf(this.wort[i]);
    }
 
    return s;
}

public void print()
{System.out.println(this.toString());}


public int getLength() {
	return wort.length;
}

public char getCharAt(int index) {
char s;
	if(index>wort.length){
		return s=32;
	}
	else 
	{return wort[index];
}


}


public boolean contains(char c) {
	for(int i=0;i<wort.length;i++) {
		if(wort[i]==c) 
		{return true;}}
	return false;
}

@Override
public boolean equals(Object o)     
{if(o==null) return false;    
if(this==o) return true;                                                                              
if(this.getClass() != o.getClass()) return false;

MyString otherV = (MyString)o;
if( this.getLength()==otherV.getLength()) {                     
for (int index = 0; index < this.wort.length; index++)
{
    if(this.wort[index] != otherV.wort[index]) return false;
}
return true;
}
return false;
}
}
