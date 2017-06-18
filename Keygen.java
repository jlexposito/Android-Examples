public class Keygen {

  public static void main(String[] args) {
    System.out.println("\n****************************** \n* Crack Me Keygen Generator: *\n******************************\n");
    
    if(args.length != 3) {
      System.out.println("Invalid arguments \nUsage: java Keygen name HardwareID01 HardwareID02 \n");
      return;
    }
    
    String name = args[0];
    String hardware01 = args[1];
    String hardware02 = args[2];
    
    if(name.length() < 4) {
      System.out.println("Warning: Name must have more than 4 characters\n");
      return;
    }

    int i;
    String paramAnonymousView = "";
    
    for(i = 0; i < name.length(); ++i){
      paramAnonymousView += (int) name.charAt(i);
    }
    
    i = Integer.parseInt(paramAnonymousView.substring(0, 5));
    paramAnonymousView = hardware01.substring(0, 6);
    String localObject = hardware02.substring(0, 6);
    long l = Integer.parseInt(paramAnonymousView) ^ Integer.parseInt((String)localObject);
    String serial = String.valueOf(i ^ 0x6B016) + "-" + String.valueOf(l) + "-" + paramAnonymousView;
    
    System.out.println("Serial: " + serial + "\n");
    return;
  }
}