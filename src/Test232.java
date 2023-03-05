/**
 * @author long.truong@finos.asia
 */
public class Test232 {

    public static void main(String[] args) {
        System.out.println(changeDirectoryString("/ext/de/13", "cd /"));
    }

    public static String changeDirectoryString(String currentDirectory, String command) {

        if(!command.startsWith("cd ")) throw new IllegalStateException();

        // Change to the root
        final String SLASH = "/";
        final String MOVE_UP = "..";
        // Cases: /, .. ,
        String expectionPath = command.substring(3);
        // Build commands
        String[] components = command.split(SLASH);

        // Direct the moving
        for(int i = 0; i< components.length; i++){
            String tempCommand = components[i];
            if("". equals(tempCommand)|| currentDirectory.endsWith("/"+ tempCommand)){
                currentDirectory = currentDirectory;
            }else if(MOVE_UP.equals(tempCommand)){
                for(int j = currentDirectory.length() -1; j>=0; j--){
                    if(currentDirectory.charAt(j) == '/'){
                        currentDirectory = currentDirectory.substring(0,j);
                    }
                }
            }else{
                currentDirectory = currentDirectory + "/" + tempCommand;
            }


        }


        return currentDirectory;
    }
}
