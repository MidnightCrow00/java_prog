
package tombnelkul;

import java.util.Scanner;

public class ElemiProgTetelek {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Összegzés
        /*Python kód:
            i = 0
            n = 0
            ossz = 0
            n = int(input("N = "))
            while (n < 0):
                n = int(input("N = "))
            for i in range(0, n + 1):
                ossz += i
            return f"Az első {n} db ternészetes szám összege: {ossz}"
        */
        //Java kód: 
        int n = -1;
        while(n < 0){
            System.out.println("N=");
            n = sc.nextInt();
        }
        int ossz = 0;
        for (int i = 0; i < n+1; i++){
            ossz += i;
        }
        System.out.printf("Az első %d ternészetes szám összege: %d\n",n,ossz);
        
        //Összegzés vége
        /*Megszámlálas*/
         /*Python kód:
            db = 0
            for i in range(10, 100):
                if i % 2 == 0:
                    db += 1
            return f"{db} db 2 jegyű páros szám van."
        */
        //Java kód: 
            int db = 0;
            for (int i = 10; i < 100; i++){
                if(i % 2 == 0){
                    db++;
                }
            }
            System.out.printf("Ennyi darab 2 jegyű páros szám van: %d\n",db);
         /*Min_kiválasztás*/
         /*Python kód:
            VEGE = 0
            db = 0
            min = 231233213
            while((szam := int(input("Szám: "))) != VEGE):
                if szam < min:
                    min = szam
                db += 1
                print(f"{db} számból a legnagyobb: {min}")
        */
        //Java kód: 
        int VEGE = 0;
        db = 0;
        int szam;
        int min = 231233213;
        while((szam = sc.nextInt()) != VEGE){
            if(szam < min){
                min = szam;
            }
            db += 1;
        }
        System.out.printf("%d számból a legkisebb:%d\n",db,min);
         /*Eldöntés*/
         /*Python kód:
            n = int(input("\n Szám: "))
            prim = True
            if n < 2:
                prim = False
            else:
                i = 2
                while i <= math.sqrt(n) and n % i != 0:
                    i += 1
                prim = i > math.sqrt(n)
            if prim == True:
                print("Prím")
            else:
                print('Nem prím')
        */
        //Java kód:
        n = sc.nextInt();
        boolean prim;
        
        if(n < 2){
            prim = false;
        }else{
            int i = 2;
            while(i <= Math.sqrt(n) && n % i != 0){
                i += 1;
            }
            prim = i > Math.sqrt(n);
        }
        if(prim = true){
            System.out.println("Prím");
        }else{
            System.out.println("Nem prím");
        }
    }//main vége
    
}//class vége
