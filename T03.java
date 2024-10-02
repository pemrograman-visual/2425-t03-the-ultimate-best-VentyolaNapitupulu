// 12S24039 - Jody Alfonso Siahaan
// 12S24042 - Ventyola Rohati Napitupulu



import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn, judul, penulis, penerbit, formatbuku, kategori, kesimpulan, nilaidiskon;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        kodeisbn = input.nextLine();
        while (!kodeisbn.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahunterbit = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            formatbuku = input.nextLine();
            hargapembelian = Double.parseDouble(input.nextLine());
            minimummargin = Double.parseDouble(input.nextLine());
            if (-(minimummargin / hargapembelian) > 0.4) {
                nilaidiskon = "Once in a lifetime";
            } else {
                if (0.2 < -(minimummargin / hargapembelian) && minimummargin / hargapembelian < 0.4) {
                    nilaidiskon = "Never come twice";
                } else {
                    if (-(minimummargin / hargapembelian) <= 0.2 && -(minimummargin / hargapembelian) > 0) {
                        nilaidiskon = "no regret";
                    } else {
                        nilaidiskon = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (nilaidiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                kesimpulan = "The Ultimate Best";
            } else {
                kesimpulan = "---";
            }
            System.out.print(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori + "|" + nilaidiskon + "|" + kesimpulan);
            kodeisbn = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
