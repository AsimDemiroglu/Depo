package day_18Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> isimList = new HashMap<>();

        isimList.put("Ajdar", 3000);
        System.out.println(isimList);
        isimList.put("Acun ılıcalı", 5000);
        isimList.put("Tom hans", 7000);
        isimList.put("ömer faruk", 8000);
        System.out.println(isimList);
        isimList.put(null, 3000);
        System.out.println(isimList);
        isimList.put(null, 6000);
        System.out.println(isimList);
        isimList.put("ajda pekkan", null);

        isimList.put("dede korkut",null);

        System.out.println(isimList);

        Set<String> keyİsimler = isimList.keySet();

        System.out.println(keyİsimler);

        Collection<Integer> valueİsimler = isimList.values();

        System.out.println(valueİsimler);
        System.out.println("----------------------------------------------------------");
        Integer valueOmer=isimList.get("ömer faruk");
        System.out.println(valueOmer);
        Integer valueAjda=isimList.remove("ajda pekkan");
        System.out.println(valueAjda);
        System.out.println(isimList);
        boolean result=isimList.remove("Ajdar",3000);
        System.out.println(result);
        System.out.println(isimList);
        Integer deneme= isimList.replace("Acun ılıcalı",1000);
        System.out.println(deneme);
        System.out.println(isimList);
       boolean result3 =isimList.replace("Acun ılıcalı",1000,8500);

        System.out.println(result3);
        System.out.println(isimList);
        Collection<Integer> caca=isimList.values();
        Integer sub=0;
        Integer sayac=0;
        for (Integer w : caca){
            if (w!=null){
                sub=sub+w;
                sayac++;

            }
        }
        System.out.println(sub / sayac);


        isimList.put("angalina julie", 100000);
        isimList.put("brad pit", 9500);
        isimList.put("cüneyt tarkın", 10500);
        isimList.put("ayşen gruda",6500);

        System.out.println(isimList);

        Collection<String> caca2=isimList.keySet();
        Integer toplam=0;
        for (String w : caca2){
            if (w!=null){
                if (w.charAt(0) != 'A' || w.charAt(0) != 'a' ){
                    toplam=toplam+w.length();
                }
            }


        }
        System.out.println(toplam);

        Collection <String> ornek2Key= isimList.keySet();
        int toplam2=0;

        for (String w: ornek2Key){
            if((w!=null)&&((!w.startsWith("a"))||(!w.startsWith("A")))){
                toplam2=toplam2+w.length();
            }
        }

        System.out.println(toplam2);

        Set<Map.Entry<String,Integer>> setlist=isimList.entrySet();
        System.out.println(setlist);
        for (Map.Entry<String,Integer> w : setlist){
            System.out.println(w);
        }

        isimList.putIfAbsent("Tom hans",7330);
        isimList.putIfAbsent("ömer abi", 2000);
        System.out.println(isimList);

    }


    }

