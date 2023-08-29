package homework3;

public class homework6 {
    public static void main(String[] args) {
        //Kullanıcıdan satır sayısını alarak asagıdakı
        //sekli elde ediniz7
        int satırSayısı=7;
        for (int satır=0; satır<satırSayısı; satır++){
            for (int bosluk=0; bosluk<satırSayısı-(satır+1); bosluk++)
            {
                System.out.print(" ");
            }
            for (int yildiz=0; yildiz<= (satır*2); yildiz++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
