import java.util.Scanner;

public class HitungVolumeKubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        double volume = Math.pow(sisi, 3);
        System.out.println("Volume kubus: " + volume);
        scanner.close();
    }
}
