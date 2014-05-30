public class Driver {
  
  public static main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please select your compression threshold: ");
    int t = scan.nextInt();
    System.out.println("Please select your compression ratio: ");
    int r = scan.nextInt();
    Compressor c = new Compressor(t,r);
    
  }
  
}
