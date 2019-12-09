public class CevaAnume {

    public CevaAnume() {
     //   System.out.println("constructor");
    }

    {
    //    System.out.println("printing from regular block");
    }

    static {
      //  System.out.println("printing from static block");
    }

    public static void main(String[] args) {
        // TODO static vs non-static
        CevaAnume.increaseStaticCall(); // ? 1|1
        System.out.println("din main");
        CevaAnume myVar = new CevaAnume();
        myVar.increaseInstanceCall(); // ? 1|1
        CevaAnume.increaseStaticCall();    // ? 2|2
        CevaAnume.increaseStaticCall();    // ? 3|3

        CevaAnume myVar2 = new CevaAnume();
        myVar2.increaseInstanceCall(); // ? 1|1
        myVar.increaseInstanceCall(); // ? 2|3
        CevaAnume myVar3 = new CevaAnume();
       System.out.println(myVar3.numberOfInstanceCalls); // ? 1|1
    }

    private static int numberOfStaticCalls = 0;

    private int numberOfInstanceCalls = 0;

    public static void increaseStaticCall(){
        int v = Integer.parseInt("234");

        int w = Integer.parseInt("111");
        System.out.println(v+w);
        numberOfStaticCalls++;
        System.out.println("Static calls "+numberOfStaticCalls );
    }

    public void increaseInstanceCall(){

        numberOfInstanceCalls++;
        System.out.println("Instance calls "+numberOfInstanceCalls );
    }

}
