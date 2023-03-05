import java.util.List;

/**
 * @author long.truong@finos.asia
 */
public class BBTest {

//    public static void main(String[] args) {
//        String currentDir = "/dev/etc/1/2/3/4/5";
//        String command = "cd ../../..";
//        System.out.println(changeDirectoryString(currentDir,command));
//    }

    public static void printOddNumber(List<Integer> inputs){
        inputs.stream().filter(item -> item%2 !=0).forEach(System.out::println);
    }

    public static void printAll(List<String> inputs){

    }

//    public static String changeDirectoryString(String currentDirectory, String command) {
//
//        if(!command.startsWith("cd ")) throw new IllegalStateException();
//        String path = "";
//        // Change to the root
//        final String SLASH = "/";
//        final String MOVE_UP = "..";
//        String moveToDir = command.substring(3, command.length());
//
//        int numberOfMoveUp = command.split(MOVE_UP).length;
//
//        return path;
//    }

//    public static final String COMMAND_PREFIX = "cd";
//
//    public static void main(String[] args) {
//
//    }
//
//    public String changeDirectoryString(String currentDirectory, String command) {
//        validateCommand(command);
//        if ("cd /".equals(command))
//            return "/";
//
//        String[] isolationCommandArr = genIsolationCommand(command.substring(3));
//        command.split("/");
//        for (int i = 0; i < isolationCommandArr.length; i++) {
//            currentDirectory = helper(currentDirectory, isolationCommandArr[i]);
//        }
//        return currentDirectory;
//
//    }
//
//    private String[] genIsolationCommand(String command) {
//        String[] arrOfStr = command.split("/");
//        return arrOfStr;
//    }
//
//    private String helper(String currentDirectory, String command) {
//
//
//
//        if ("".equals(command)) {
//            return currentDirectory;
//        }
//
//        if ("..".equals(command)) {
//            for (int i = currentDirectory.length() - 1; i >= 0; i--) {
//                if (currentDirectory.charAt(i) == '/') {
//                    return currentDirectory.substring(0, i);
//                }
//            }
//        }
//        if (currentDirectory.endsWith("/" + command))
//            return currentDirectory;
//
//        return currentDirectory + "/" + command;
//    }
//
//    private void validateCommand(String command) {
//        if (command == null)
//            return;
//
//        if (!command.startsWith("cd ")) {
//            throw new IllegalStateException("wrong command");
//        }
//    }
//



}
