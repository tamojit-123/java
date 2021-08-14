class withoitsync
{
public static void main (String args[])
{
callme tar = new callme ();
caller obj1 = new caller (tar,"Hello");
caller obj2 = new caller (tar,"World");

try
{
obj1.t.join();
obj2.t.join();
}
catch(Exception e)
{
System.out.print("Exception!!!");
}
}
}

class callme 
{
void call (String msg)
{
System.out.print("["+ msg);

try
{
Thread.sleep(1000);
}
catch (Exception e)
{
System.out.println("Inturrepted");
}
System.out.print("]");
}
}

class caller implements Runnable
{
String msg;
callme target;
Thread t;
public caller(callme targ, String s)
{
target = targ;
msg = s;
t = new Thread (this);
t.start();
}
public void run()
{
target.call (msg);
}
}
