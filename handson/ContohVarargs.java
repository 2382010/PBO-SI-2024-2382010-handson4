package handson;

public class ContohVarargs {
    public static int jumlahkan(int... kumpulanAngka){
        int total = 0;
        for (int nilai : kumpulanAngka){
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        int hasil = jumlahkan(1,2,3);
        System.out.println("Hasil : " + hasil);
    }
}
