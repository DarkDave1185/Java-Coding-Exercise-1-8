public class MegaByteConverter {
    public static void main(String[] args) {
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int x=kiloBytes;
        int y=kiloBytes/1024;
        int z=kiloBytes%1024;
        if (kiloBytes>=0) {
            System.out.println(x+" KB = "+y+" MB and "+z+" KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
