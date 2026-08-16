public class dataTypes {
    public static void main(){
        byte num1=127; //range:-128to127
        System.out.println(num1);
        short num2=32000;//range:-32768 to 32767
        //java: incompatible types: possible lossy conversion from int to short
        System.out.println(num2);
        int num3=50000;
        long num4=345363636;
        System.out.println(num3);
        System.out.println(num4);
        float num5=2342.5F;
        float num6=2.4546778f; // less precison

        System.out.println(num5);
        System.out.println(num6);
        double num7=2.234252525;
        System.out.println(num7);//for more precision

        boolean el=true;
        boolean rve=false;
        System.out.println(rve);
        System.out.println(el);
        char rat='a';
        System.out.println(rat);
        System.out.println((char)(rat+2));//add ascii and gives value in char
        //implicit conversion
        byte num10=32;
        long newNum=num10;
        System.out.println(newNum);// chota datatype value in big data type
        //expilcit
        long io=234252525;
        int oi=(int)io;//zabardasti conversion bada value datatype value store in chota data type but i should be in range of chota data type
        System.out.println(io);
        System.out.println(oi);
        char char1='A';
        int char2=char1;
        System.out.println(char2);
        float ui=2.15f;// it will remove decimal part as we convert in into int
        System.out.println((int)(ui));
        int num14=7;
        int num19=8;
        float num87=num14;// it will add 0.0f(as it is default value for float)
        double num90=num19;
        System.out.println(num87); //same reason as double default value is 0.0
        System.out.println(num87);
}}
