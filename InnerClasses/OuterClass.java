// Nested Inner Class (Done: public, Done: private, Static)
// Static Nested Classes
// Method Local Inner Classes
// Anonymous Inner Classes
// done:Both of their methods have access to each other's 
// done:private methods and instance variables.
public class OuterClass{
    private String OuterClassMsg;
    private PrivateInnerClass PIC;
    public OuterClass()
    {
        this.OuterClassMsg = "this is the constructor of OuterClass";
        this.PIC = new PrivateInnerClass();
    }
    public String getOuterClassMsg()
    {
        return this.OuterClassMsg;
    }
    public PrivateInnerClass getPIC()
    {
        return this.PIC;
    }
    public void setOutClassMsg(String msg)
    {
        this.OuterClassMsg = msg;
    }
    public void setPIC(PrivateInnerClass pic)
    {
        this.PIC = pic;
    }
    private static void tempMethod()
    {
      //  InnerClass I = new innerClass();//not allowed
        StaticInnerClass SICO = new StaticInnerClass();
        System.out.println(StaticInnerClass.SICMsg);
    }
    public void testOutClass()
    {
        
    int x = 98;//it will work fine if you make it final
	System.out.println("inside outerMethod");
	class Inner {
		void innerMethod() {
		System.out.println("x= "+x);

		}
	}
	Inner y = new Inner();
	y.innerMethod();

        System.out.println(this.OuterClassMsg);
        innerClass IC = new innerClass();
        System.out.println(IC.InnerClassMsg);
        IC.TestInnerPrivateMethod();
    }
    public String toString()
    {
        return ("OuterClass:" + this.OuterClassMsg);
    }
    private void TestOuterPrivateMethod()
    {
    //
    }
    //Public Inner class
    public class innerClass{
        static int count = 0;
        private String InnerClassMsg;
        public innerClass()
        {
            this.InnerClassMsg = "This is Inner Class Constructor";
        }
        public String getInnerClassMsg()
        {
            return this.InnerClassMsg;
        }
        public void setInnerClassMsg(String msg)
        {
            this.InnerClassMsg = msg;
        }
        public String toString()
        {
            return("InnerClass: " + this.InnerClassMsg);
                }
   
        public void testInnerClass()
        {
            System.out.println(OuterClassMsg);
            TestOuterPrivateMethod();
        }
        private void TestInnerPrivateMethod()
        {
            //
        }

            }
    //Private Inner Class
    private class PrivateInnerClass{
        //instance variables
        private String PICfield;
        //constrcutors
        public PrivateInnerClass()
        {
            this.PICfield = "This is Constructor of Private Inner Class";
        }
        //methods
        public void setPICfield(String PIC)
        {
            this.PICfield = PIC;
        }
        public String getPICField()
        {
            return this.PICfield;
        }
    }

    //Static Inner Class
    static class StaticInnerClass{
        static String SICMsg;
        StaticInnerClass()
        {
            this.SICMsg = " This is Static Inner Class Constructor";
        }
        public void displayStaticInnerClass()
        {
            System.out.println(this.SICMsg);
              tempMethod(); 
        }
    }

        }